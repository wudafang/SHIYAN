import java.util.Scanner;
public class Q2 {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	System.out.println("������ȼ���");
	int q=s.nextInt();
	System.out.println("���������ѽ�");
	double w=s.nextDouble();
	if(q==1){
		System.out.println("�������ѽ�"+w);
	}else if(q==2){
		double ww=w*0.05;
		System.out.println("�������ѽ�"+ww);
	}else if(q==3){
		double t=w*0.1;
		System.out.println("�������ѽ�"+t);
	}else if(q==4){
		double tt=w*0.15;
		System.out.println("�������ѽ�"+tt);
	}else if(q==5){
		double v=w*0.2;
		System.out.println("�������ѽ�"+v);
	}else if(q==6){
		double vv=w*0.25;
		System.out.println("�������ѽ�"+vv);
	}
}     
}
