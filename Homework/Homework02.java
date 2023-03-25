import java.util.Scanner;

public class Homework02{

	public static void main(String[] args){

		//实现判断一个整数属于哪个范围，大于零小于零还是等于零
		//思路：定义一个Scanner对象接收要判断的整数，然后三个 if
		//
		// Scanner myScanner = new Scanner(System.in);
		// System.out.print("请输入要判断的整数：");
		// int int1 = myScanner.nextInt();
		// if(int1 > 0){
		// 	System.out.println("大于零");
		// } else if(int1 < 0){
		// 	System.out.println("小于零");
		// } else{
		// 	System.out.println("等于零");
		// }

		//判断一个年份是否为闰年
		//思路：（1）定义一个Scanner对象接收要判断的年份，然后if
		//       （2）成功就输出 谁谁是闰年，失败就输出 不是闰年
		//       
		// Scanner myScanner = new Scanner(System.in);
		// System.out.print("请输入要判断的年份：");
		// int year = myScanner.nextInt();
		// if( (year % 4 == 0 && year % 100 != 0) || year % 100 == 0 ){
		// 	System.out.println(year + "年是闰年");
		// } else{
		// 	System.out.println("不是闰年");
		// }

		//判断一个整数是否是水仙花数：一个 3 位数，其各个位上数字立方和等于其本身。
		//例：153 = 1*1*1 + 5*5*5 + 3*3*3
		//思路：
		//（1）定义一个Scanner对象接收要判断的正整数
		//（2）百位数：整数 / 100
		//（2）十位数：（整数 - 百位数*100）/ 10
		//（3）个位数：整数 - 百位数*100 - 十位数*10   //老师的思路更好：十位数：（整数%100）/10
		//                                                           个位数：整数 % 10
		//（4）判断 整数 是否等于 哒哒哒哒哒哒
		//
		Scanner myScanner = new Scanner(System.in);
		System.out.print("请输入要判断的正整数 0-1000：");
		int num = myScanner.nextInt();
		int digits = 0;//储存个位数
		int tenDigits = 0;//储存十位数
		int hundreds = 0;// 储存百位数
		if(num > 1000 || num < 0){
			System.out.println("输入错误，请重新输入");
		} else{
			hundreds = num / 100;
			System.out.println("百位数是：" + hundreds);
			tenDigits = (num - hundreds*100) / 10;
			System.out.println("十位数是：" + tenDigits);
			digits = num - hundreds*100 - tenDigits*10;
			System.out.println("个位数是：" + digits);
			if(num == (hundreds*hundreds*hundreds + tenDigits*tenDigits*tenDigits 
				+ digits*digits*digits)){
				System.out.println("是水仙花数");
			} else{
				System.out.println("不是");
			}
		}
	}
}