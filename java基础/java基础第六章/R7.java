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
	System.out.println("请输入一个数字：0：剪刀；1：包袱；2：锤头");
	int q=sc.nextInt();
	if(q==0){
		if(getRand(0,2)==0){
			System.out.println("剪刀");
			System.out.println("平");
	}else if(getRand(0,2)==1){
		System.out.println("包袱");
		System.out.println("负");
			
	}else if(getRand(0,2)==2){
		System.out.println("锤头");
		System.out.println("胜");
	}
	}
	if(q==1){
		if(getRand(0,2)==0){
			System.out.println("剪刀");
			System.out.println("胜");
	}else if(getRand(0,2)==1){
		System.out.println("包袱");
		System.out.println("平");
			
	}else if(getRand(0,2)==2){
		System.out.println("锤头");
		System.out.println("负");
	}
	}
	if(q==2){
		if(getRand(0,2)==0){
			System.out.println("剪刀");
			System.out.println("负");
	}else if(getRand(0,2)==1){
		System.out.println("包袱");
		System.out.println("胜");
			
	}else if(getRand(0,2)==2){
		System.out.println("锤头");
		System.out.println("平");
	}
	}
}
}
