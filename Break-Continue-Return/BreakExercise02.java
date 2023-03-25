import java.util.Scanner;

public class BreakExercise02{

	public static void main(String[] args){

		//实现登录验证，有 3 次机会，如果用户名为"丁真" ,
		//密码"666"提示登录成功，否则提示还有几次机会，请使用 for+brea
		//
		//字符串相比较用equals 使用方法【用name变量示范】 name.equals("比较对象")
		//                                          "比较对象".equals(name) 推荐，可以避免空指针 

		int chance = 3;//可尝试次数
		Scanner myScanner = new Scanner(System.in);
		label1:
		for(;;){

			System.out.print("请输入用户名：");
			String name = myScanner.next();
			if("丁真".equals(name)){//检验用户名是否存在
				for(;;){//名字存在，进入密码验证环节

					System.out.print("请输入密码：");
					String code = myScanner.next();
					if("666".equals(code)){
						System.out.println("登陆成功");
						break label1;//登录成功，退出程序
					} else if(chance != 1){
						chance--;
						System.out.println("密码错误，请重新输入，还有" + chance + "次机会");
					} else{
						System.out.println("登陆失败");
						break label1;//超出验证次数范围，退出程序
					}
				}
			} else{
				System.out.println("用户名不存在，请重新输入：");
			}

		}
	}
}