import java.util.Scanner;
/**
 * �������������Լ���ʾ��Ļ
 * @author Administrator
 *
 */

public class Test {
public static void main(String[] args){
	Manger m=new Manger();
	menu(m);
}
public static void menu(Manger e){
	System.out.println("��ӭʹ��ѧ���ɼ�����ϵͳ�� ");
	int order=0;
	Scanner sc=new Scanner(System.in);
	do {
		System.out.println("��ѡ���ܣ�0���˳�1����ʾ����2������������ѯ�ɼ�3���޸ĳɼ���Ϣ ");
		order=sc.nextInt();
		switch(order){
		case 1:
			e.printAll();
			break;
		case 2:
			e.getResult();
			break;
		case 3:
			e.update();
			break;
		case 0:
			System.out.println("ллʹ�ñ�ϵͳ�� ");
		}
		
			
	} while (order!=0);
}
}
