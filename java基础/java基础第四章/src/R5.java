import java.util.Scanner;
public class R5 {
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int i=1;
while(i<=2){
	System.out.println("请录入姓名：");
	String xm=s.next();
	System.out.println("请录入性别：");
	String xb=s.next();
	System.out.println("请录入身高：");
	int sg=s.nextInt();
	System.out.println("姓名"+xm+"性别"+xb+"身高"+sg);
	i++;
}

}
}
