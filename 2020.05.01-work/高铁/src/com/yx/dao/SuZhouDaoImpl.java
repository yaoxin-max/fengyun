package com.yx.dao;

public class SuZhouDaoImpl  implements HSRTicket{
	
	String trainInfo = "你乘坐的车次："+TRAIN_NUMBER+","+"始发站--目的站："+START_TATION+"--苏州,"+"座位等级：";
	String seat1="一等座";
	String seat2="二等座";
	
	@Override
	public void run(String seatlevel) {
		if (seatlevel.equals(seat1)) {
			System.out.println(trainInfo+seat1+",车票价格为"+159.5+"元");
			}
		else if(seatlevel.equals(seat2)){
			System.out.println(trainInfo+seat2+",车票价格为"+99.5+"元");
			}
		else{
			System.out.println("111输入有误，请输入：一等座或者二等座");
		}
	}

}
