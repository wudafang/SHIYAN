import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner q = new Scanner(System.in);
		System.out.println("������һ�������š�");
		String email =" ";//��һ�ֵ�
	
//		String email =q.next();
//		int index1 = email.indexOf(".");
//		int index2 = email.indexOf("@");
		if (email != null && !email.equals("")) {
			int index1 = email.indexOf(".");//��һ��
			int index2 = email.indexOf("@");//��һ��
			if (index1 != -1 && index1 > index2) {
				System.out.println("������ȷ");
			} else {
				System.out.println("����������������롣");
			}

		} else {
			System.out.println("111111��");

		}
	}
}