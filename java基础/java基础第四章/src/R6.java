import java.util.Scanner;
public class R6 {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	int i=1;
	String sex="";
	while(i<=2){
		System.out.println("请录入姓名：");
		String xm=s.next();
		System.out.println("请录入性别：");
		 sex=s.next();
		if(sex.equals("女")){
			System.out.println("只征收男兵。");
			continue;
		}
		System.out.println("请录入身高：");
		int sg=s.nextInt();
		System.out.println("请录入年龄：");
		int nl=s.nextInt();
		if(nl>18&&nl<50){
			System.out.println("恭喜，成功入伍");
			System.out.println("姓名"+xm+"性别"+sex+"身高"+sg+"年龄"+nl);
		}
		
		
		i++;
	}
}
}
