public class WhileExercise{

	public static void main(String[] args){

		//打印 1—100 之间所有能被3整除的数
		// int i = 1;
		// while(i <= 100){
		// 	if(i % 3 == 0){
		// 		System.out.println(i);
		// 	}
		// 	i++;
		// }

		//打印 40—200 之间所有的偶数
		int start = 40;
		int end = 200;
		while(start <= end){
			if(start % 2 == 0){
				System.out.println(start);
			}
			start++;
		}

		System.out.println("while终止..");
	}
}