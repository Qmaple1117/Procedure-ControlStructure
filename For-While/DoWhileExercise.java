import java.util.Scanner;

public class DoWhileExercise{

	public static void main(String[] args){

		//输出1-100
		// int i = 1;
		// do{
		// 	System.out.println(i);
		// 	i++;
		// } while(i <= 100);

		//计算1-100 的和
		// int a = 1;
		// int sum = 0;
		// do{
		// 	sum += a;
		// 	a++;
		// } while(a <= 100);
		// System.out.println("1-100的和是：" + sum);

		// 1 - 200 之间 能被 5 整除，不能被 3 整除的数的个数
		// int start = 1, end = 200;
		// int numble = 0;
		// do{
		// 	if(start % 5 == 0 && start % 3 != 0){
		// 		numble++;
		// 	}
		// 	start++;
		// } while(start <= end);
		// System.out.println("个数：" + numble);

		Scanner myScanner = new Scanner(System.in);
		char reply = ' ';
		do{
			System.out.println("闪电吴联编");
			System.out.println("还钱不？ y/n");
			reply = myScanner.next().charAt(0);
		} while(reply != 'y');

		System.out.println("退出dowhile..");
	}
}