
import java.util.Scanner;

public class If01 {

	public static void main(String[] args) {

		//定义一个Scanner对象接收输入的年龄
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入你的年龄");
		int age = myScanner.nextInt();
		if(age > 18) {
			System.out.println("大于18.对行为负责，否则进监狱");
		}
		System.out.println("程序继续。。。");
	}
}
