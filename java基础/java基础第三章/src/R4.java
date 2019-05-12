import java.util.Scanner;
public class R4 {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	System.out.println("请按建");
	int q=s.nextInt();
	switch(q){
	case 1:
		System.out.println("套餐服务");
		break;
	case 2:
		System.out.println("优惠服务");
		break;
	case 3:
		System.out.println("上网服务");
		break;
	case 4:
		System.out.println("业务服务");
		break;
	case 5:
		System.out.println("无线服务");
		break;
	case 0:
		System.out.println("人工服务");
		break;
	}    
}
}
