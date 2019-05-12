import java.util.Scanner;
public class R3 {
public static void main(String[] args){
	for(int i=1;i<=3;i++){
		getYear();
	}
}
public static void getYear(){
	Scanner sc=new Scanner(System.in);
	System.out.println("请输入一个年份：");
	int n=sc.nextInt();
	System.out.println("请输入一个月份：");
	int y=sc.nextInt();
	switch(y){
	case 1:
	case 3:
	case 5:
	case 7:
	case 8:
	case 10:
	case 12:
		System.out.println("天数为31天" );
		break;
	case 4:
	case 6:
	case 9:
	case 11:
		System.out.println("天数为30天" );
		break;
	case 2:	
		if(n%400==0||n%4==0&&n%100!=0){
			System.out.println("天数为29天" );
		}else{
			System.out.println("天数为28天" );
		}
	break;
	}
}
}
