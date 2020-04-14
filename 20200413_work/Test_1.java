import java.sql.Date;
import java.text.SimpleDateFormat;
public class Test_1 {
	public static void main(String[] args) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		int i =1;//挂号次数	
		java.util.Date date1 = sdf.parse("2015-07-23 09:04:53");//第一次挂号时间
		long time1=date1.getTime();		
		java.util.Date date2 = sdf.parse("2015-07-23 09:34:53");//第二次挂号时间
		long time2=date2.getTime();
		java.util.Date date3 = sdf.parse("2015-07-23 10:44:53");//第三次挂号时间
		long time3=date3.getTime();
		long leadTime;//时间差毫秒
		double sumMin;//时间差分钟
		if (i==1) {
			System.out.println("挂号成功");		
		}
		//第二次挂号时间	
		if(i==2){
			leadTime= time2-time1;
			sumMin=leadTime/60000.0;
			System.out.print("距离第一次挂号时间为"+sumMin+"分钟\t");	
			if (sumMin<30) {
				double time_1 = 30-sumMin;//待挂号时间
				String info = "你好，现在不可以挂号,请在";
				System.out.println(info+time_1+"分钟后再次挂号。");
				}
				
			else{
				System.out.println("挂号成功");
				}			
			}
		if(i==3){
			leadTime=time3-time2;
			sumMin=leadTime/60000.0;
			System.out.print("距离第二次挂号时间为"+sumMin+"分钟");	
			if(sumMin>30){
				System.out.println("\t挂号成功");
			}
			else {
				System.out.println("\t由于时间间隔未超过30分钟，且挂号已经第三次，今天不可以再次预约");
				}
			}	
		}
}
