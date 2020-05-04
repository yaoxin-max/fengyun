package com.yx.dao;

public class GetInstance {
	
	public static HSRTicket getInstanceof(String station){
		if(station.equals("镇江")){
			return new ZhenJiangDaoImpl();	
		}
		if (station.equals("丹阳")) {
			return new DanYangDaoImpl();
		}
		if (station.equals("常州")) {
			return new ChangZhouDaoImpl();
		}
		if (station.equals("无锡")) {
			return new WuXiDaoImpl();
		}
		if (station.equals("苏州")) {
			return new SuZhouDaoImpl();
		}
		if (station.equals("上海")) {
			return new ShangHaiDaoImpl();
		}
		else {
			return null;
		}
	}

}
