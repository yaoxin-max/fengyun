package com.yx.test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCTest4 {
	
	private static Connection connection;
	private static Statement statement;

	public static void main(String[] args) throws Exception {
		getconn();
		String sql = "insert into employee value(3,'鲁鹏','男','13830651242','苏州工业园',3002,now(),5600,3);"; 
		update(sql);
		String sql2 = "select name,pay from employee where sex = '男'"; 
		query(sql2);
		connection.close();
	}
	
	//建立连接
	public static void getconn() throws Exception{
		//1--加载驱动
		Class.forName("com.mysql.jdbc.Driver");
		//2--建立连接
		String url = "jdbc:mysql://192.168.12.66:3306/kfcdatabase"; 
		String user = "root";
		String password = "root";
		connection = DriverManager.getConnection(url, user, password);
		statement = connection.createStatement();	
	}
	
	//增、删、改
	public static void update(String sql)throws Exception{
		int i = statement.executeUpdate(sql);
		System.out.println("添加sql语句"+i+"条");	
	}
	
	//查
	public static void query(String sql)throws Exception {
		ResultSet rest = statement.executeQuery(sql);
		while (rest.next()) {
			System.out.print("name: "+rest.getString("name")+", ");
			System.out.println("salary: "+rest.getDouble("pay"));
		}
	}

}
