import java.util.Scanner;  
public class R7 {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	int m=0;
		do{

			System.out.println("0:�˳�   1������  2������  3���̵�");
			 m=s.nextInt();
			switch(m){
			case 1:
				System.out.println("ִ�н���");
				break;
			case 2:
				System.out.println("ִ������");
				break;
			case 3:
				System.out.println("ִ���̵�");
				break;   
			
			}
			
		}while(m!=0);
	
	System.out.println("��ӭ�´�ʹ��");
}             
}
   