import java.util.Scanner;


public class Test2 {
public static void main(String[] args){
	Scanner q=new Scanner(System.in);
	System.out.println("请输入一个邮箱编号。");
	String email=q.next();
	int index1=email.indexOf(".");
	int index2=email.indexOf("@");
	if(email!=" "){
		if(index1!=-1&&index1>index2){
			System.out.println("邮箱正确");
		}else{
			System.out.println("邮箱错误请重新输入。");
		}
		
	}
	
}
}
