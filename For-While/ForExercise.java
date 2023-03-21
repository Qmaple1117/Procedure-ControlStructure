
public class ForExercise{

	public static void main(String[] args){

		//打印 1~100 之间所有是 9 的倍数的整数，统计个数 及总和【化繁为简，先死后活】
		//
		//老韩思路：
		//化繁为简
		//（1）输出1~100
		//（2）只输出9的倍数
		//（3）统计个数，定义变量
		//（4）计算总和，定义变量，条件满足时 +i
		//先死后活
		//将 1 和 100 用变量代替，可以更好的调整范围
		int numble = 0;
		int sum = 0;
		for(int i = 1; i <= 100; i++){
			if(i % 9 == 0){
				++numble;
				sum += i;
				System.out.println(i);
			}
		}
		System.out.println("1~100之间是9的倍数的整数的个数为：" + numble);
		System.out.println("这些整数的和为：" + sum);

		//化繁为简
		//（1）输出 0 到 5
		//（2）+ 后面是 5-a
		//先死后活
		//将 5 用变量代替
		int n = 5;
		for(int a = 0; a <= n; a++){
			System.out.println(a + "+" + (n - a) + "=" + n);
		}
	}
}