public class Homework01{

	public static void main(String[] args){

		//某人有100000元，每经过一次路口都要交费：
		//当现金 > 50000元时，每次交5%
		//当现金 <= 50000元时，每次交1000
		//编程计算该人可以经过多少次路口，要求：使用 while + break 完成
		
		//（1）重点：定义一个 while 无线循环结构
		//（2）使用三个if分别控制现金的三种情况，当现金小于1000时，车子无法通过路口
		//（2）大于 50000 元时，每次剩余的钱为 钱 * 0.95
		//（3）每一次循环最后都要检查一次剩余金额是否大于1000，小于则用 break 跳出循环
		//（4）定义一个变量 numble 存储可以通过路口的次数，在每一次while 循环的最后 numble++
		
		double money = 100000;//钱的总数
		int numble = 0;//统计可以通过路口的次数
		int i = 0;
		while(true){
			if(money > 50000){
				money *= 0.95;//减去过路口花费的费用
				numble++;
			}

			if(money <= 50000){
				money -= 1000;//减去过路口花费的费用
				numble++;
			}

			if(money < 1000){
				System.out.println("剩余金额为" + money + "，不足以通过下次路口");
				break;
			}
		}
		System.out.println("100000可以通过的路口次数为：" + numble);
	}
}