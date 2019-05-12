import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner q = new Scanner(System.in);
		System.out.println("请输入一个邮箱编号。");
		String email =" ";//第一种的
	
//		String email =q.next();
//		int index1 = email.indexOf(".");
//		int index2 = email.indexOf("@");
		if (email != null && !email.equals("")) {
			int index1 = email.indexOf(".");//第一种
			int index2 = email.indexOf("@");//第一种
			if (index1 != -1 && index1 > index2) {
				System.out.println("邮箱正确");
			} else {
				System.out.println("邮箱错误请重新输入。");
			}

		} else {
			System.out.println("111111。");

		}
	}
}