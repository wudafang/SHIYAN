import java.util.Scanner;
public class R7 {
public static void main(String[] args){
	int a=0,b=2;
	getRand(a,b);
	jieGuo();
}
public static int getRand(int min,int max){
	double d=Math.random();
	int q=(int)(d*1000);
	    q=q%(max-min+1)+min;
	    return q;
}
public static void jieGuo(){
	Scanner sc=new Scanner(System.in);
	System.out.println("������һ�����֣�0��������1��������2����ͷ");
	int q=sc.nextInt();
	if(q==0){
		if(getRand(0,2)==0){
			System.out.println("����");
			System.out.println("ƽ");
	}else if(getRand(0,2)==1){
		System.out.println("����");
		System.out.println("��");
			
	}else if(getRand(0,2)==2){
		System.out.println("��ͷ");
		System.out.println("ʤ");
	}
	}
	if(q==1){
		if(getRand(0,2)==0){
			System.out.println("����");
			System.out.println("ʤ");
	}else if(getRand(0,2)==1){
		System.out.println("����");
		System.out.println("ƽ");
			
	}else if(getRand(0,2)==2){
		System.out.println("��ͷ");
		System.out.println("��");
	}
	}
	if(q==2){
		if(getRand(0,2)==0){
			System.out.println("����");
			System.out.println("��");
	}else if(getRand(0,2)==1){
		System.out.println("����");
		System.out.println("ʤ");
			
	}else if(getRand(0,2)==2){
		System.out.println("��ͷ");
		System.out.println("ƽ");
	}
	}
}
}
