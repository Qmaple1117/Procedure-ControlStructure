import java.util.Scanner;

public class Switch01{
	//新建一个main方法
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入一个字符：（a-g）");
		char day = myScanner.next().charAt(0);
		switch(day){
			case 'a':
				System.out.println("星期一");
				break;
			case 'b':
				System.out.println("星期二");
				break;
			case 'c':
				System.out.println("星星三");
				break;
			case 'd':
				System.out.println("星期四");
				break;
			case 'e':
				System.out.println("星期五");
				break;
			case 'f':
				System.out.println("星期六");
				break;
			case 'g':
				System.out.println("星期天");
				break;
			default:
				System.out.println("你输入的字符不正确");
		}
		System.out.println("程序继续。。。");
	}
}