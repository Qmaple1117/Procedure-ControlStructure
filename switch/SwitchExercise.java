import java.util.Scanner;

public class SwitchExercise{

	public static void main(String[] args){

		//练习一：使用 switch 把小写类型的 char 型转为大写(键盘输入)。
		//只转换 a, b, c, d, e. 其它的输出"other"
		//定义一个Scanner对象接收输入的字符
		/*Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入一个字符：a-z");
		char c1 = myScanner.next().charAt(0);
		switch(c1){
			case 'a':
				c1 = 'A';
				System.out.println("a转为:" + c1);
				break;
			case 'b':
				c1 = 'B';
				System.out.println("b转为:" + c1);
				break;
			case 'c':
				c1 = 'C';
				System.out.println("c转为:" + c1);
				break;
			case 'd':
				c1 = 'D';
				System.out.println("d转为:" + c1);
				break;
			case 'e':
				c1 = 'E';
				System.out.println("e转为:" + c1);
				break;
			default:
				System.out.println("other");
		}*/

		//第二题：对学生成绩大于 60 分的，输出"合格"。低于 60 分的，
		//输出"不合格"。(注：输入的成绩不能大于 100), 提示 成绩/60
		/*Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入成绩：1 - 100");
		double score = myScanner.nextDouble();
		if(score > 100 || score < 0){
			System.out.println("输入有误请重新输入");
		} else{
			switch( (int)(score / 60) ){
				case 1:
					System.out.println("合格");
					break;
				case 0:
					System.out.println("不合格");
					break;
			}
		}*/
		
		//根据用于指定月份，打印该月份所属的季节。3,4,5 春季 6,7,8
		// 夏季 9,10,11 秋季 12, 1, 2 冬季 [课堂练习, 提示 使用穿透
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入月份：1 - 12");
		int month = myScanner.nextInt();
		switch(month){
			case 3:
			case 4:
			case 5:
				System.out.println("春季");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("夏季");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("秋季");
				break;
			case 12:
			case 1:
			case 2:
				System.out.println("冬季");
				break;
			default:
				System.out.println("月份输入有误，请重新输入");
		}
		

		System.out.println("程序继续。。。");
	}
}