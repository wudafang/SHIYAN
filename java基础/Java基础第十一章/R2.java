import java.util.Scanner;


public class R2 {
public static void main(String[] args){
	Scanner q=new Scanner(System.in);
	System.out.println("请输入班级人数。");
	int num=q.nextInt();
	
	int sum=0;
	double[] cj=new double[num];
	for(int i=0;i<cj.length;i++){
		System.out.println("请输入班级第"+i+"人的成绩。");
		 cj[i]=q.nextDouble();
	}
	for(int i=0;i<cj.length;i++){
		sum+=cj[i];
		
	}
	double avg=sum/num;
	System.out.println("平均分为："+avg);
}
}
