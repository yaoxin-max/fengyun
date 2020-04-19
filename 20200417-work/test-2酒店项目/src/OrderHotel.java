import java.util.Random;
import java.util.Scanner;

public class OrderHotel {
	static String[] hotels = {"格林豪泰苏州火车站南广场拙政园商务酒店","格雅苏州工业园区金鸡湖东方之门酒店","格林豪泰苏州漕湖工业园智选酒店"};
	static String[] houseTyel = {"大床房","标间","豪华双床房","高级大床房"};
	public static void main(String[] args) {

		Scanner  sc = new Scanner(System.in);
		System.out.println("格林豪泰苏州火车站南广场拙政园商务酒店：1");
		System.out.println("格雅苏州工业园区金鸡湖东方之门酒店：2");
		System.out.println("格林豪泰苏州漕湖工业园智选酒店：3");
		
		int flag=0;//判断用户
		while(flag==0){
			System.out.println("亲，请根据提示输入您要入住宾馆的序号：");
			int number = sc.nextInt();//用户选择入住的宾馆
			switch (number) {
			case 1:
				System.out.println("欢迎选择"+hotels[number-1]);
				glZzy();//显式房型及对应的价格给客户
				houseType(number);
				break;
			case 2:
				System.out.println("欢迎选择"+hotels[number-1]);
				System.out.println("这是我们的房型：");
				System.out.println("豪华双床房---vip/no-vip:(399/339)");
				houseType(number);
				break;
			case 3:
				System.out.println("欢迎选择"+hotels[number-1]);
				System.out.println("这是我们的房型：");
				System.out.println("高级大床房---vip/no-vip:(189/161)");
				houseType(number);
				break;
			default:
				System.out.println("输入有误，请输入1-3");	
			}
			if(number==1||number==2||number==3){break;}
			System.out.println("重新选择，请输入0，");
			flag=sc.nextInt();
		}	
	}
	
	//显式格林豪泰苏州火车站南广场拙政园商务酒店的房型
	public static void glZzy() {
		System.out.println("这是我们的房型:");
		String[] houseType = {"大床房---vip/no-vip:(161/189) ","标间---vip/no-vip:(169/149)","豪华双床房---vip/no-vip:(209/190)"};
		for(String i : houseType){
			System.out.print(i+"\t");
		}
	}
	
	public static void houseType(int number) {
		Random r = new Random();
		int ran1 = r.nextInt(1000);
		if(number==1){
		System.out.println();
		System.out.print("大床房：1"+"\t");
		System.out.print("标间：2"+"\t");
		System.out.println("豪华双床房：3"+"\t");
		}
		
		if(number==2){
			System.out.println("豪华双床房：3"+"\t");
		}
		if (number==3) {
			System.out.println("高级大床房：4"+"\t");	
		}
		System.out.println("请根据提示选择你要入住的房型：");
		Scanner  sc = new Scanner(System.in);
		int number1 = sc.nextInt();//用户选择入住的房型
			//先咨询是否有优惠券（1/0）
			hasCoupon();
			System.out.println("请输入：");
			int coupon = sc.nextInt();
			String st1="感谢先生入住"+hotels[number-1]+houseTyel[number1-1]+",您的房费是：";
			String st2=",房卡："+ran1+","+"入住愉快！";
			if (coupon==1) {
				System.out.println();
				//你是会员吗--(1/0)
				isVip();
				int vip = sc.nextInt();
				if (vip==1) {
					System.out.println(st1+returnPrice(number,number1,coupon,vip)+st2);	
				}
				else{
					System.out.println(st1+returnPrice(number,number1,coupon,vip)+st2);
				}
			}
			else {
				isVip();
				int vip = sc.nextInt();
				if (vip==1) {
					System.out.println(st1+returnPrice(number,number1,coupon,vip)+st2);	
				}
				else{
					System.out.println(st1+returnPrice(number,number1,coupon,vip)+st2);
				}
			}
	}
	
	//是否是会员
	public static void isVip(){
		System.out.println("你是会员吗--(1/0)");//1表示是
	}
	
	//是否有会员券
	public static void hasCoupon(){
		System.out.println("你有优惠券吗--(1/0)");//1表示有	
	}
	
	//返回价格
	public static double returnPrice(int number,int number1,int coupon,int vip) {
		int price = 0;
		//选格林豪泰苏州火车站南广场拙政园商务酒店&&住大床&&有优惠券&&是会员(1111)
		if(number==1&&number1==1&&coupon==1&&vip==1){
			price=141;
		}
		//选格林豪泰苏州火车站南广场拙政园商务酒店&&住大床&&有优惠券&&不是会员(1110)
		if(number==1&&number1==1&&coupon==1&&vip==0){
			price=169;
		}
		//选格林豪泰苏州火车站南广场拙政园商务酒店&&住大床&&无优惠券&&是会员(1101)
		if(number==1&&number1==1&&coupon==0&&vip==1){
			price=161;
		}
		//选格林豪泰苏州火车站南广场拙政园商务酒店&&住大床&&无优惠券&&不是会员(1100)
		if(number==1&&number1==1&&coupon==0&&vip==0){
			price=189;
		}
		//选格林豪泰苏州火车站南广场拙政园商务酒店&&标间&&有优惠券&&是会员(1211)
		if(number==1&&number1==2&&coupon==1&&vip==1){
			price=139;
		}
		//选格林豪泰苏州火车站南广场拙政园商务酒店&&标间&&有优惠券&&不是会员(1210)
		if(number==1&&number1==2&&coupon==1&&vip==0){
			price=159;
		}
		//选格林豪泰苏州火车站南广场拙政园商务酒店&&标间&&无优惠券&&是会员(1201)
		if(number==1&&number1==2&&coupon==0&&vip==1){
			price=149;
		}
		//选格林豪泰苏州火车站南广场拙政园商务酒店&&标间&&无优惠券&&不是会员(1200)
		if(number==1&&number1==2&&coupon==0&&vip==0){
			price=169;
		}
		//选格林豪泰苏州火车站南广场拙政园商务酒店&&豪华双床房&&有优惠券&&是会员(1311)
		if(number==1&&number1==3&&coupon==1&&vip==1){
			price=160;
		}
		//选格林豪泰苏州火车站南广场拙政园商务酒店&&豪华双床房&&有优惠券&&不是会员(1310)
		if(number==1&&number1==3&&coupon==1&&vip==0){
			price=179;
		}
		//选格林豪泰苏州火车站南广场拙政园商务酒店&&豪华双床房&&无优惠券&&是会员(1301)
		if(number==1&&number1==3&&coupon==0&&vip==1){
			price=190;
		}
		//选格林豪泰苏州火车站南广场拙政园商务酒店&&豪华双床房&&无优惠券&&不是会员(1300)
		if(number==1&&number1==3&&coupon==0&&vip==0){
			price=209;
		}
		//选格雅苏州工业园区金鸡湖东方之门酒店&&豪华双床房&&无优惠券&&不是会员(2311)
		if(number==2&&number1==3&&coupon==1&&vip==1){
			price=319;
		}
		//选格雅苏州工业园区金鸡湖东方之门酒店&&豪华双床房&&有优惠券&&不是会员(2310)
		if(number==2&&number1==3&&coupon==1&&vip==0){
			price=379;
		}
		//选格雅苏州工业园区金鸡湖东方之门酒店&&豪华双床房&&无优惠券&&是会员(2301)
		if(number==2&&number1==3&&coupon==0&&vip==1){
			price=339;
		}
		//选格雅苏州工业园区金鸡湖东方之门酒店&&豪华双床房&&无优惠券&&不是会员(2300)
		if(number==2&&number1==3&&coupon==0&&vip==0){
			price=399;
		}
		//选格林豪泰苏州漕湖工业园智选酒店&&高级大床房&&有优惠券&&是会员
		if(number==3&&number1==4&&coupon==1&&vip==1){
			price=151;
		}
		//选格林豪泰苏州漕湖工业园智选酒店&&高级大床房&&有优惠券&&不是会员
		if(number==3&&number1==4&&coupon==1&&vip==0){
			price=179;
		}
		//选格林豪泰苏州漕湖工业园智选酒店&&高级大床房&&无优惠券&&是会员
		if(number==3&&number1==4&&coupon==0&&vip==1){
			price=161;
		}	
		//选格林豪泰苏州漕湖工业园智选酒店&&高级大床房&&无优惠券&&不是会员
		if(number==3&&number1==4&&coupon==0&&vip==0){
			price=189;
		}
		return price;
	}
}
	
