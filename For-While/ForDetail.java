public class ForDetail{

	public static void main(String[] args){
		
		//for(;循环判断条件;) 中的初始化和变量迭代可以写到其它地方，但是两边的分号不能省略
		int i =1;// i写在外面可以使其作用域变大
		for( ; i <= 10 ; ){
			System.out.println("ok" + i);
		}

		// for(;;){//代表死循环，使用时配合break使用，以后讲,退出死循环用ctrl + c
		// 	System.out.println("循环");
		// }	
		
	}
}