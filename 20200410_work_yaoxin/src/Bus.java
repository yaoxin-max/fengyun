/**
 * 
 * @author yaoxin
 * @date   2020年4月11日
 *
 */
public class Bus {

	public static void main(String[] args) {
		int bus_id = 56;//公车编号
		String s_time = "6:00";//公车出发时间
		String e_time = "22:00";//公车停止时间
		String s_station = "清华苑";//公车始发站
		String e_station = "苏州站";//公车终点站
		double price = 2.0;//公车单价
		System.out.println("公交车信息");
		System.out.println("-----------");
		System.out.println("公共汽车编号："+bus_id);
		System.out.println("56号公共汽车始发时间："+s_time+"，停止时间："+e_time);
		System.out.println("56号公共汽车始发站："+'\u2605'+s_station+"，终点站："+'\u2605'+e_station);
		System.out.println("56号公共汽车单价："+price+"元");		
	}

}
/*
class Hospital{
	
	
}

class Train_ticket{
	
}

class Plane_ticket{
	
}
*/