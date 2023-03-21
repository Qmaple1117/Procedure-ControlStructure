import java.util.Scanner;
public class MulForExercise03{

	public static void main(String[] args){

		//打印 * 空心金字塔
		//（1）先每一层都只打印一个 *
		//（2）将金字塔先打印为等腰直角三角
		//（3）每一层前面需要空出的“空格数”为（总层数 - 当前层数）
		//（4）每一层后面需要增加的 * 数为（当前层数 - 1）
		//（5）将中间的*挖掉
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入金字塔层数：");
		int layerNum = myScanner.nextInt();
		
		//用for实现
		// for(int i = 1; i <= layerNum; i++){

		// 	for(int n = 1; n <= (layerNum - i); n++){

		// 			System.out.print(" ");//输出每一层前面所空出的距离
		// 		}
		// 	for(int j = 1; j <= (2 * i - 1); j++){

		// 		if(i == layerNum){
		// 			System.out.print("*");//最后一行直接输出所有的*
		// 		} else if(j < (2 * i - 1) && j > 1){
		// 			System.out.print(" ");//输出空心区域
		// 		} else if(j == (2 * i - 1)){
		// 			System.out.println("*");//输出最后一个*并换行
		// 		} else{
		// 			System.out.print("*");//输出每一行的第一个*
		// 		}
		// 	}
		// }


		//用while实现
		int i = 1;
		while(i <= layerNum){ 

			int n = 1;
			while(n <= (layerNum - i)){

					System.out.print(" ");//输出每一层前面所空出的距离
					n++;
				}
			int j = 1;
			while(j <= (2 * i - 1)){

				if(i == layerNum){
					System.out.print("*");//最后一行直接输出所有的*
				} else if(j < (2 * i - 1) && j > 1){
					System.out.print(" ");//输出空心区域
				} else if(j == (2 * i - 1)){
					System.out.println("*");//最后一个*换行
				} else{
					System.out.print("*");//输出每一行的第一个*
				}
				j++;
			}
			i++;//层数加一
		}
	}
}