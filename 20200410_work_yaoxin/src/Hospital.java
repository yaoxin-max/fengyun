/**
 * 
 * @author yaoxin
 * @date   2020年4月11日
 *
 */
public class Hospital {

	public static void main(String[] args) {
		String name = "苏大第一人民医院";
		int esta_time = 1883;    
		String local = "姑苏区十梓街188号";
		String telphone = "0512-65223637";
		String grade = "三级甲等";
		System.out.println("医院信息");
		System.out.println("-----------");
		System.out.println("医院名称："+name);
		System.out.println("医院地址："+local);
		System.out.println("医院成立时间："+esta_time+"年");
		System.out.println("医院总机电话：："+telphone);
		System.out.println("医院等级："+'\u2605'+grade);
	}

}
