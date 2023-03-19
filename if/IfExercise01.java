import java.util.Scanner;

public class IfExercise01{

	public static void main(String[] args){

		Scanner myScanner = new Scanner(System.in);
		//接收第一个数
		// System.out.println("请输入第一个数：");
		// double d1 = myScanner.nextDouble();
		// //接收第二个数
		// System.out.println("请输入第二个数：");
		// double d2 = myScanner.nextDouble();
		// //判断第一个数是否大于10.0，第二个数是否小于20.0
		// if(d1 > 10.0 && d2 < 20.0){
		// 	System.out.println("两个数的和 = " + (d1 + d2));
		// }

		// System.out.println("请输入第一个数：");
		// int a1 = myScanner.nextInt();
		// //接收第二个数
		// System.out.println("请输入第二个数：");
		// int a2 = myScanner.nextInt();
		// if((a1 + a2) % 3 == 0 && (a1 + a2) % 5 == 0){
		// 	System.out.println("二者的和既能被3又能被5整除");
		// }else{
		// 	System.out.println("二者的和不可以既能被3又能被5整除");
		// }
		
		System.out.println("请输入一个年份：");
		int year = myScanner.nextInt();
		//判断是否为闰年，符合其一即可。（1）能被4整除但不能被100整除 （2）能被400整除
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
			System.out.println("该年份是闰年");
		}else{
			System.out.println("该年份不是闰年");
		}
		System.out.println("程序继续。。。");
	}
}