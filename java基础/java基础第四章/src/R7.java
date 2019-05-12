import java.util.Scanner;  
public class R7 {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	int m=0;
		do{

			System.out.println("0:退出   1：进货  2：销售  3：盘点");
			 m=s.nextInt();
			switch(m){
			case 1:
				System.out.println("执行进货");
				break;
			case 2:
				System.out.println("执行销售");
				break;
			case 3:
				System.out.println("执行盘点");
				break;   
			
			}
			
		}while(m!=0);
	
	System.out.println("欢迎下次使用");
}             
}
   