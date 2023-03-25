public class Homework03{

	public static void main(String[] args){

		//输出 1-100 之间不能被5整除的数，每五个一行
		//思路：
		//（1）输出不能被5整除的数
		//（2）分为五个一行
		int num = 0;//记录每行已经有几个数
		for(int i = 1; i <= 100; i++){
			if(i % 5 != 0){
				System.out.print(i + "\t");
				num++;
			}
			if(num == 5){
				System.out.println();//换行且重置num
				num = 0;
			}
		}

		//输出小写的 a-z 以及大写的 Z-A
		//思路：
		//（1）a-z的ASCII码是 97-122，A-Z的ASCII码是 65-90
		//（2）小写用for循环++，大写的用for循环--
		//
		//思路浅薄了，忘了字符类型是可以运算的，可以char a = 'a'; a <= 'z'; a++
		char letter = ' ';
		char majuscule = ' ';
		for(int j = 97; j<=122; j++){
			letter = (char)j;
			System.out.print(letter);
		}
		System.out.println();
		for(int n = 90; n >= 65; n--){
			majuscule = (char)n;
			System.out.print(majuscule);
		}
		System.out.println();

		//求出 1 - 1/2 + 1/3 - 1/4.....1/100 的和
		//思路：
		//（1）for循环从1-100，每一次循环进行累加操作
		//（2）定义一个double变量存储累加的值
		//（3）循环变量为偶数时进行 -= 操作
		//（4）输出最终值
		//
		double sum1 = 0;
		for(int a = 1; a <= 100; a++){
			if(a % 2 == 0){
				sum1 -= (1.0 / a);	
			} else{
				sum1 += (1.0 / a);
			}
		}
		System.out.println("和是：" + sum1);
		
		//求 1 + (1+2) + (1+2+3) +....+ (1+2+3+...+100) 的结果
		//思路：
		//（1）for循环 1-100 ，并定义一个int变量 sum2 存储累加值
		//（2）定义一个int变量 allSum 存储每一次累加值的和
		//
		int sum2 = 0;
		int allSum = 0;
		for(int start = 1; start <= 100; start++){
			sum2 += start;
			allSum += sum2;
		}
		System.out.println("1 + (1+2) + ... + (1+2+...+100)的结果是：" + allSum);
	}
}