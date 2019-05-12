import java.util.Scanner;
public class R5 {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	System.out.println("请输入成绩：");
	double q=s.nextDouble();
	if(q==100){
		System.out.println("奖励人参果一个");
	}else if(q>=90){
		System.out.println("奖励水果一箱");
	}else if(q>=60){
		System.out.println("罚喂马三次");
	}else{
		System.out.println("抄经书两个时辰" );
	}
}
}
