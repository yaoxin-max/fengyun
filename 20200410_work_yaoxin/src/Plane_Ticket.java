/**
 * 
 * @author yaoxin
 * @date   2020年4月11日
 *
 */
public class Plane_Ticket {

	public static void main(String[] args) {
		String flight = "CZ6917";//航班
		String date = "23JUL";//日期
		String name = "lisi";//乘客姓名
		String destination = "成都";//目的地
		String gate = "C96";//登机口
		String time = "16:30";//出发时间
		char loction = 'Q';//舱位
		String seat = "25C";//座位号
		System.out.println("机票信息");
		System.out.println("-----------");
		System.out.println("航班： "+flight);
		System.out.println("出发时间： "+'\u2606'+date+" "+time);
		System.out.println("乘客：  "+name);
		System.out.println("目的地： "+destination);
		System.out.println("登机口： "+gate);
		System.out.println("舱位： "+loction);
		System.out.println("座位号："+seat);
	}

}
