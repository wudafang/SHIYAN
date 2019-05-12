import java.util.Scanner;
public class R13 {
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int i;
	boolean flag=true;
	System.out.print("请输入一个数字判断是否是一个素数：");
	int n=sc.nextInt();
	for( i=2;i<=n-1;i++){
		if(n%i==0){
			System.out.println(n+"不是素数");
			flag=false;
			break;
		}
		
	}
	if(flag==true){
		System.out.println(n+"是素数");
		
	}
}
}
