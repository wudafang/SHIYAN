import java.util.Scanner;
public class R1 {
public static void main(String[] args){
	int sum ;
	
	Scanner sn=new Scanner(System.in);
	System.out.println("������һ����ݣ�");
	int nf=sn.nextInt();
	System.out.println("������һ���·ݣ�");
	int yf=sn.nextInt();
 int ts= getDay(nf,yf);

	 sum=totalDay(nf,yf);
	System.out.println("����1900��1��1����"+sum+"��");
	System.out.println("������\t����һ\t���ڶ�\t������\t������\t������\t������");
	int week=sum%7+1;
	if(week!=7){
		for(int i=1;i<=week;i++){
			System.out.print(" \t");
		}
		
		


}
	for(int i=1;i<=ts;i++){
		System.out.print(i+"\t");
		if(week==6){
			System.out.println();
		}
	week=week%7+1;	
	}
	
	
	
	
}

public static int totalDay(int nf,int yf){
	int s=0;
	
	for(int i=1900;i<=nf-1;i++){
		for(int j=1;j<=12;j++){
			s+=getDay(i,j);
		}
	}
	for(int i=1;i<=yf-1;i++){
		s+=getDay(nf,i);
	}
	return s;
}
public static int getDay(int nf,int yf){
	
	switch(yf){
	case 1:
	case 3:
	case 5:
	case 7:
	case 8:
	case 10:
	case 12:
		return 31;
	
	case 4:
	case 6:
	case 9:
	case 11:
		return 30;
		
		
	case 2:
		if(nf%400==0||nf%4==0&&nf%100!=0){
		return 29;
		}else{
			return 28;
		}
		default:
			return -1;
	}
	
}
}