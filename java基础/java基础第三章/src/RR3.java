import java.util.Scanner;
public class RR3 {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	System.out.println("����������е��·ݣ�");
	int q=s.nextInt();
	System.out.println("������ѡ��ͷ�Ȳջ��Ǿ��òգ�(1.ͷ�Ȳ� 2.���ò�)");
	int qq=s.nextInt();
	int w=5000;
	if(q>0&&q<4&&q>10&&q<13){
		if(qq==1){
			double a=w*0.5;
			System.out.println(a);
		}else if(qq==2){
			double j=w*0.4;
			System.out.println(j);
		}
	}else if(q>3&&q<11){
		if(qq==1){
			double k=w*0.9;
			System.out.println(k);
		}else if(qq==2){
			double g=w*0.8;
			System.out.println(g);
		}
	}
	
}
}
