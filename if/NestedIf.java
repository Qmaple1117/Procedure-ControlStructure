import java.util.Scanner;
//参加歌手比赛，如果初赛成绩大于 8.0 进入决赛，否则提示淘汰。并且根据性别提示进入男子组或女子组

public class NestedIf {

	public static void main(String[] args) {
		//定义一个Scanner对象接收键盘输入的信息
		Scanner myScanner = new Scanner(System.in);
		System.out.println("输入成绩 0-10");
		double score = myScanner.nextDouble();
		if(score > 8.0) {
			System.out.println("输入选手性别 男or女");
			char gender = myScanner.next().charAt(0);
			if(gender == '男') {
				System.out.println("进入男子组决赛");
			} else if(gender == '女') {
				System.out.println("进入女子组决赛");
			} else {
				System.out.println("性别输入错误");
			}
		} else {
			System.out.println("淘汰");
		}
		System.out.println("程序继续。。。");
	}
}