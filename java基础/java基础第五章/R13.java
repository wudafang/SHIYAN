import java.util.Scanner;
public class R13 {
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int i;
	boolean flag=true;
	System.out.print("������һ�������ж��Ƿ���һ��������");
	int n=sc.nextInt();
	for( i=2;i<=n-1;i++){
		if(n%i==0){
			System.out.println(n+"��������");
			flag=false;
			break;
		}
		
	}
	if(flag==true){
		System.out.println(n+"������");
		
	}
}
}
