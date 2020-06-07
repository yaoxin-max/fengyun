package com.yx.utils;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtils2 {
	
	private static String className;
	private static String url;
	private static String user;
	private static String password;

	private static Connection connection;
	private static PreparedStatement preparedStatement;
	private  static ResultSet resultSet;
	public static Properties properties = null;
	
	
	static{
		properties = new Properties();
		try {
			properties.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("hotel.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}

	public DBUtils2(){
		this.className = properties.getProperty("drivername");
		this.url = properties.getProperty("url");
		this.user = properties.getProperty("user");
		this.password = properties.getProperty("password");
	}
	
	//1实现连接功能
	public static Connection getconn(){
		try {
			Class.forName(className);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			connection = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
	
	//2-1实现增-删-改功能
	public static int updateRun(String sql,Object[] objects) throws SQLException{
		getconn();
		preparedStatement = connection.prepareStatement(sql);
		for (int i = 0; i < objects.length; i++) {
			preparedStatement.setObject(i+1, objects[i]);
		}
		int i = preparedStatement.executeUpdate(sql);
		return i ;
	}
	
	//2-2实现增-删-改功能(无占位符的)
	public static int updateRun2(String sql) throws SQLException{
		getconn();
		preparedStatement = connection.prepareStatement(sql);
		int i = preparedStatement.executeUpdate(sql);
		return i ;
	}
	
	//3-1实现查
	public static ResultSet selectRun(String sql,Object[] objects) throws SQLException{
		getconn();
		preparedStatement = connection.prepareStatement(sql);
		for (int i = 0; i < objects.length; i++) {
			preparedStatement.setObject(i+1, objects[i]);
		}
		 resultSet = preparedStatement.executeQuery();
		 return resultSet;
	}
	//3-2实现查,(无占位符)
	public static ResultSet selectRun2(String sql) throws SQLException{
		getconn();
		preparedStatement = connection.prepareStatement(sql);
		resultSet = preparedStatement.executeQuery();
		return resultSet;
	}
	
		
	//4-关闭
	public static void close(){
		if (resultSet!=null) {
			try {
				resultSet.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}	
		}
		if (preparedStatement!=null) {
			try {
				preparedStatement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (connection!=null) {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
