import java.util.Scanner;
public class R13 {
public static void main(String[] args){
	
Scanner s=new Scanner(System.in);
	System.out.println("请输入字符：(注：在输入y时可以在页面上输出而在输入其他的字符时显示请重新输入。)");
	String q=s.next();
		if(q.equals("y")==true){
			System.out.println(q);
		}else{
			System.out.println("请重新输入。");
		}
	}
	
}

