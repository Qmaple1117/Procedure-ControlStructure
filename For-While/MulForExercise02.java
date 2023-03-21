public class MulForExercise02{

	public static void main(String[] args){

		//打印出九九乘法表[课后题]
		for(int i = 1; i <= 9; i++){

			for(int j = 1; j <= i; j++){

				if(j < i){
					System.out.print(j + "*" + i + "=" + (i * j) + "\t");	
				} else{
					System.out.println(j + "*" + i + "=" + (i * j));
				}
			}
		}
	}
}