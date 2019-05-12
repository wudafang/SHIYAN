import java.util.Scanner;
public class Q1 {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	System.out.println("请输入性别：");
	String qq=s.next();
	System.out.println("请输入某人的身高：");
	double q=s.nextDouble();
	System.out.println("请输入某人的体重：");
	int p=s.nextInt();
	if(qq.equals("男")){
		if(q>=165){
			double z=q-100;
			double ppp=z*1.02;
			double pp=z*0.98;
			if(p>pp&&p<ppp){
				System.out.println("标准");
			}else if(p<pp){
				System.out.println("太轻");
			}else if(p>ppp){
				System.out.println("太重");
			}
		}else if(q<165){
			double m=q-105;
			double n=m*0.98;
			double nn=m*1.02;
			if(p>n&&p<nn){
				System.out.println("标准");
			}else if(p<n){
				System.out.println("太轻");
			}else if(p>n){
				System.out.println("太重");
			}
		}
	}else {
		double j=q-100;
		double f=j*1.02;
		double ff=j*0.98;
		if(p>ff&&p<f){
			System.out.println("标准");
		}else if(p<ff){
			System.out.println("太轻");
		}else if(p>f){
			System.out.println("太重");
		}
	}
}
}
