import java.text.ParseException;
import java.util.Scanner;


public class Test {
public static void main(String[] args) throws ParseException{
	Mange manger=new Mange();
	menu(manger);
}
public static void menu(Mange e) throws ParseException{
	Scanner s=new Scanner(System.in);
	int order=0;
	do{
		System.out.println("�����롪��0:�˳�1:��ʾ����2:���3:�޸�4:ɾ��5:��ѯ6:������������� ");
		order=s.nextInt();
		switch(order){
		case 1:
			e.printall();
			break;
		case 2:
			e.add();
			break;
		case 3:
			e.update();
			break;
		case 4:
			e.delet();
			break;
		case 5:
			e.getresult();
			break;
		case 6:
			e.getsort();
			break;
			
		}
		
			
			
	}while(order!=0);
}
}
