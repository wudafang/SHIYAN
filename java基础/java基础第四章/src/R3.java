import java.util.Scanner;
public class R3 {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	System.out.println("请输入班级的总人数：");
	int num=s.nextInt();
	int i=1;
	int total=0;
	while(i<=num){
		System.out.println("请输入"+i+"个人的成绩：");
		double fs=s.nextDouble();
	  total +=fs;
		i++;
	}
	double avg=total/num;
	System.out.println("平均成绩："+avg);
}
}
