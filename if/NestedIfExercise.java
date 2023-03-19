import java.util.Scanner;
//根据淡旺季和游客年龄，打印票价  4-10旺季：成人（18-60）60元；儿童<18：半价；老人（>60）1/3
//淡季 成人40 其余20

public class NestedIfExercise {

	public static void main(String[] args) {
		//定义一个Scanner对象接收游客信息
		Scanner myScanner = new Scanner(System.in);
		System.out.println("输入月份");
		int month = myScanner.nextInt();
		if(month >= 4 && month <= 10) {//判断是否是旺季
			System.out.println("输入游客年龄");
			int age = myScanner.nextInt();
			if(age >= 18 && age <= 60) {//判断游客年龄大小
				System.out.println("票价60元");
			} else if(age > 60) {
				System.out.println("票价20元");
			}else if(age < 1) {
				System.out.println("年龄输入错误，请重新输入...");
			}else {
				System.out.println("票价30元");
			}
		} else if( (month < 4 && month >= 1) || (month > 10 && month <= 12)) {//判断是否是淡季
			System.out.println("输入游客年龄");
			int age = myScanner.nextInt();
			if(age >= 18 && age <=60) {//判断游客年龄大小
				System.out.println("票价40元");
			}else if(age < 1) {
				System.out.println("年龄输入错误");
			}else {
				System.out.println("票价20元");
			}
		}else {
			System.out.println("月份输入有误，请重新输入...");
		}
	}
}