import java.util.Scanner;
public class RR3 {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	System.out.println("请输入你出行的月份：");
	int q=s.nextInt();
	System.out.println("请问你选择头等舱还是经济舱：(1.头等舱 2.经济舱)");
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
