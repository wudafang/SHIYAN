import java.util.Scanner;




import java.util.Scanner;

public class R6 {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	System.out.println("������ο���Ա���Ա�");
	String q=s.next();
	System.out.println("���������Ͷ�����룺");
	double w=s.nextDouble();
	double mark=0;
	if(q.equals("��")){
		if(w>=9){
			mark=10;
		}else if(w>=8.2){
			mark=9;
		}else if(w>7.5){
			mark=7;
		}else if(w>6.5){
			mark=6;
		}else if(w<5.5){
			mark=5;
		}
	}else{
		if(w>=8){
			mark=10;
		}else if(w>=7){
			mark=9;
		}else if(w>=6){
			mark=8;
		}else if(w>=5){
			mark=7;
		}else if(w>=4.2){
			mark=6;
		}else if(w<4.2){
			mark=5;            
		}
	}
	System.out.println(mark);
}
}
