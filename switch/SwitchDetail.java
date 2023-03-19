import java.util.Scanner;

public class SwitchDetail{
	//新建一个main方法
	public static void main(String[] args){
		// Scanner myScanner = new Scanner(System.in);
		// System.out.println("请输入一个字符：（a-g）");
		// char day = myScanner.next().charAt(0);
		int day = 12;//正确
		switch(day){
			case 'a':
				System.out.println("星期一");
				break;
			case 'b':
				System.out.println("星期二");
				break;
			default:
				System.out.println("dsadas");
		}
	}
}