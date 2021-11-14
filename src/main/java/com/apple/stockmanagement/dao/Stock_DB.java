package com.apple.stockmanagement.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.apple.stockmanagement.bean.Stock_D;



public class Stock_DB {
	
	//creating Database Connection
	
	private String jdbcURL="jdbc:mysql://localhost:3306/stockmanagemant?useSSL=false";
	private String jdbcUsername="root";
	private String jdbcPassword="3661433";
	
	//declarig sql statements
	private static final String INSERT_STOCK_SQL = "INSERT INTO stockmanagemant.stock" + "  (name, company, price, quantity, exp_date, discription) VALUES "	+ " (?, ?, ?, ?, ?, ?);";
	private static final String SELECT_STOCK_BY_ID = "select name,company,price,quantity,exp_date,discription from stockmanagemant.stock where id =?";
	private static final String SELECT_ALL_STOCKS = "select * from stockmanagemant.stock";
	private static final String DELETE_STOCKS_SQL = "delete from stockmanagemant.stock where id = ?;";
	private static final String UPDATE_STOCKS_SQL = "update stockmanagemant.stock set name = ?,company= ?,price= ?,quantity= ?,exp_date= ?, discription= ? where id = ?;";
	
	public Stock_DB() {		
	}
	
	//getting database connection  
	protected Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(jdbcURL,jdbcUsername,jdbcPassword);
		}catch(SQLException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		return connection;
	}
	
	//implimenting Insert Crud method 
	
	public void insertStock(Stock_D stock) throws SQLException{
		System.out.println(INSERT_STOCK_SQL);
		try(Connection connection = getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_STOCK_SQL)){
			preparedStatement.setString(1, stock.getName());
			preparedStatement.setString(2, stock.getCompany());
			preparedStatement.setString(3, stock.getPrice());
			preparedStatement.setString(4, stock.getQuantity());
			preparedStatement.setString(5, stock.getExp_date());
			preparedStatement.setString(6, stock.getDiscripition());
			System.out.println(preparedStatement);
			preparedStatement.executeUpdate();
		}catch(SQLException e) {
			printSQLException(e);
		}
	}
	
	//implimenting Select Crud method 
	
	public Stock_D selectStock(int id) {
		Stock_D stock = null;
		try(Connection connection = getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(SELECT_STOCK_BY_ID);){
			preparedStatement.setInt(1, id);
			System.out.println(preparedStatement);
			ResultSet rs = preparedStatement.executeQuery();
			while(rs.next()) {
				String name = rs.getString("name");
				String company = rs.getString("company");
				String price = rs.getString("price");
				String quantity = rs.getString("quantity");
				String exp_date = rs.getString("exp_date");
				String discripition =rs.getString("discription");
				stock = new Stock_D(id, name, company, price, quantity,exp_date,discripition);				
			}
		}catch(SQLException e) {
			printSQLException(e);
		}
		return stock;
	}
	
	//implimenting select all Crud method 
	
	public List<Stock_D> selectAllStocks(){
		List <Stock_D> stocks = new ArrayList<>();
		try(Connection connection = getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_STOCKS);){
			System.out.println(preparedStatement);
			ResultSet rs = preparedStatement.executeQuery();
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String company = rs.getString("company");
				String price = rs.getString("price");
				String quantity = rs.getString("quantity");
				String exp_date = rs.getString("exp_date");
				String discripition =rs.getString("discription");
				stocks.add(new Stock_D(id, name, company, price, quantity,exp_date,discripition));
				
			}
			
		}catch(SQLException e) {
			printSQLException(e);
		}
		return stocks;
	}
	
	//implimenting delete Crud method 
	public boolean deleteStock(int id) throws SQLException{
		boolean rowDeleted;
		try(Connection connection = getConnection();
				PreparedStatement statement = connection.prepareStatement(DELETE_STOCKS_SQL);){
			statement.setInt(1, id);
			rowDeleted = statement.executeUpdate()>0;
		}
		return rowDeleted;
	}
	
	//implimenting update Crud method 
	public boolean updateStock(Stock_D stock) throws SQLException{
		boolean rowUpdated;
		try(Connection connection = getConnection();
				PreparedStatement statement = connection.prepareStatement(UPDATE_STOCKS_SQL);){
			System.out.println("Updated Stock :  " +statement);
			statement.setString(1, stock.getName());
			statement.setString(2, stock.getCompany());
			statement.setString(3, stock.getPrice());
			statement.setString(4, stock.getQuantity());
			statement.setString(5, stock.getExp_date());
			statement.setString(6, stock.getDiscripition());
			statement.setInt(7, stock.getId());
			rowUpdated = statement.executeUpdate()>0;
			
		}
		return rowUpdated;
	}
	//creting a method to get the error and print it
	private void printSQLException(SQLException ex) {
		for (Throwable e : ex) {
			if (e instanceof SQLException) {
				e.printStackTrace(System.err);
				System.err.println("SQLState: " + ((SQLException) e).getSQLState());
				System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
				System.err.println("Message: " + e.getMessage());
				Throwable t = ex.getCause();
				while (t != null) {
					System.out.println("Cause: " + t);
					t = t.getCause();
				}
			}
		}
		
	}



}
