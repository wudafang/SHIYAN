import java.util.Scanner;


public class Test2 {
public static void main(String[] args){
	Scanner q=new Scanner(System.in);
	System.out.println("������һ�������š�");
	String email=q.next();
	int index1=email.indexOf(".");
	int index2=email.indexOf("@");
	if(email!=" "){
		if(index1!=-1&&index1>index2){
			System.out.println("������ȷ");
		}else{
			System.out.println("����������������롣");
		}
		
	}
	
}
}
