import java.util.Scanner;
public class R7 {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	System.out.println("请输入一年所交的税额：");
	double ye=0;
	double q=s.nextDouble();
	if(q<15000){
		ye=15000*0.05;	
	}else if(q<30000){
		ye=750+(q-15000)*0.1;
	}else if(q<60000){
		ye=2250+(q-30000)*0.2;
	}else if(q<100000){
		ye=8250+(q-60000)*0.3;
	}else{
		ye=20250+(q-100000)*0.35;
	}
	System.out.println("所交钱额"+ye);
}


}
