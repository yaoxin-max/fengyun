/**
 * 
 * @author yaoxin
 * @date   2020年4月11日
 *
 */
public class Train_Ticket {

	public static void main(String[] args) {
		String tick_id = "B061141";//车票编号
		String train_id = "K412";//车次
		String s_station = "威海站";
		String e_station = "北京站";
		String s_time = "2020年 04月 11日 09:30开";
		double price = 261.5;//火车票价格
		String seat = "无座";//座位信息
		System.out.println("火车票信息");
		System.out.println("-----------");
		System.out.println("车票编号： "+tick_id);
		System.out.println("乘坐车次： "+train_id);
		System.out.println("始发站： "+s_station+",终点站："+e_station);
		System.out.println("出发时间： "+'\u2605'+s_time);
		System.out.println("车票价格： "+price+"元");
		System.out.println("座位号： "+seat);		
	}

}
