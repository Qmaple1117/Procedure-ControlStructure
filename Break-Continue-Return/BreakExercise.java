public class BreakExercise{

	public static void main(String[] args){

		//1 - 100 以内的数求和，求 和第一次大于20的当前数
		int sum = 0;
		int i = 0;
		for( ; i <= 100; i++){

			sum += i;
			if(sum > 20){
				break;
			}
		}
		System.out.println("该数为" + i);
	}
}