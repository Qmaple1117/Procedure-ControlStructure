import java.util.Scanner;

public class MultiplyForExercise{

	public static void main(String[] args){

		//统计 3 个班成绩情况，每个班有 5 名同学，求出各个班的平均分
		//和所有班级的平均分[学生的成绩从键盘输入]。
		//统计三个班及格人数，每个班有 5 名同学。
		Scanner myScanner = new Scanner(System.in);
		int a = 3;//有几个班级
		int b = 5;//每个班所含人数
		double score = 0;//存储每个学生的分数
		double allSum = 0, allAverage = 0;//存储所有班级的总分和平均分
		int passing = 0;
		for(int start = 1; start <= a; start++){

			double sum = 0, average = 0;;//存储各个班级的总分和平均分
			for(int i = 1; i <= b; i++){

				System.out.println(start + "班第" + i + "个学生的成绩：");
				score = myScanner.nextDouble();
				sum += score;
				if(score >= 60){
					passing++;
				}
			}
			average = sum / b;
			allSum += sum;
			System.out.println(start + "班的平均分是：" + average);
		}
		allAverage = allSum / (a * b);
		System.out.println("三个班级的平均分是" + allAverage);
		System.out.println("三个班级的合格人数为" + passing + "人");
	}
}