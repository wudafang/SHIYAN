import java.util.Scanner;
public class Q1 {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	System.out.println("�������Ա�");
	String qq=s.next();
	System.out.println("������ĳ�˵���ߣ�");
	double q=s.nextDouble();
	System.out.println("������ĳ�˵����أ�");
	int p=s.nextInt();
	if(qq.equals("��")){
		if(q>=165){
			double z=q-100;
			double ppp=z*1.02;
			double pp=z*0.98;
			if(p>pp&&p<ppp){
				System.out.println("��׼");
			}else if(p<pp){
				System.out.println("̫��");
			}else if(p>ppp){
				System.out.println("̫��");
			}
		}else if(q<165){
			double m=q-105;
			double n=m*0.98;
			double nn=m*1.02;
			if(p>n&&p<nn){
				System.out.println("��׼");
			}else if(p<n){
				System.out.println("̫��");
			}else if(p>n){
				System.out.println("̫��");
			}
		}
	}else {
		double j=q-100;
		double f=j*1.02;
		double ff=j*0.98;
		if(p>ff&&p<f){
			System.out.println("��׼");
		}else if(p<ff){
			System.out.println("̫��");
		}else if(p>f){
			System.out.println("̫��");
		}
	}
}
}
