package com.yx.test;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import com.yx.utils.DBUtils2;

/*
 * 采用预编译PreparStatement来执行Sql语句，可以避免有statement带来的注入漏铜
 */
public class Hotel {

	public static void main(String[] args) throws Exception{
		
		//用户选择入户酒店
		String sql = "select * from hotelName where hId= ?";
		DBUtils2 dbUtils2 = new DBUtils2();
		//用户选择入住的酒店，假设由前端获取
		Object [] objects = {5121001};
		ResultSet resultSet2 = DBUtils2.selectRun(sql, objects);
		while(resultSet2.next()){
			String hoteName = resultSet2.getString("hotelName");
			System.out.println("欢迎选择"+hoteName);
			System.out.println("我们有以下房型：");
			show();	
			typeRoom();
		}
		DBUtils2.close();
		
	}

	//获取客户选择的酒店的所有房型和对应的价格
	public static List<HashMap<String, Object>> selectTypeRoom() throws SQLException {
		List<HashMap<String, Object>> list = new ArrayList<>();
		String sql = "SELECT t.type,h.price from 5121001type h INNER JOIN typehouse t on  h.typeId = t.id ";
		DBUtils2 dbUtils = new DBUtils2();
		//用户选择入住的酒店编号，假设由前端录入
		ResultSet resultSet2 = DBUtils2.selectRun2(sql);
		while(resultSet2.next()){
			HashMap<String, Object> hashMap = new HashMap<>();
			hashMap.put("type", resultSet2.getString("type"));
			hashMap.put("price", resultSet2.getString("price"));
			list.add(hashMap);
		}
		DBUtils2.close();
		return list;
	}
	
	//显示客户选择的酒店的所有房型和对应的价格
	public static void show() throws SQLException {
		List<HashMap<String, Object>> list= selectTypeRoom();
		for (HashMap<String, Object> hashMap : list) {
			System.out.println("\t"+"房型:"+hashMap.get("type")+"----"+"价格："+hashMap.get("price"));
		}	
	}
	
	/*
	 * 1-客户选择房型
	 * 2-将该房型的数量-1
	 */
	public static void typeRoom() throws SQLException {
		String sql= "SELECT t.type,h.price,h.num from 5121001type h INNER JOIN typehouse t on t.id = h.typeId WHERE h.typeId =?;";
		//假设用户选择入住双床房
		Object [] objects = {2};
		ResultSet resultSet2 = DBUtils2.selectRun(sql, objects);
		while(resultSet2.next()){
			int num2 = resultSet2.getInt("num");//获得该房型的数量
			String tyroom = resultSet2.getString("type");//选择房型
			Random random = new Random();
			System.out.println("欢迎入住"+tyroom+"----你的房卡为"+"8"+random.nextInt(100));
			//把预订的房型数量进行-1
			DBUtils2 dbUtils2 = new DBUtils2();
			String sql2 = "UPDATE 5121001type SET num =? WHERE typeId = ?";
			Connection connection = DBUtils2.getconn();
			PreparedStatement preparedStatement = connection.prepareStatement(sql2);
			preparedStatement.setInt(1, num2-1);
			preparedStatement.setInt(2, (int)objects[0]);
			preparedStatement.executeUpdate();
		}
		DBUtils2.close();	
	}	
}


	
	


