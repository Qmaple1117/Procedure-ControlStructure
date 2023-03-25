public class ContinueDetail{

	public static void main(String[] args){

		label1:
		for(int i = 0; i < 2; i++){

			label2:
			for(int j = 0; j < 4; j++){

				if(j == 2){
					//看看分别输出什么值
					//continue;
					//continue label2;
					continue label1;
				}
				System.out.println("j = " + j);
			}
		}
	}
}