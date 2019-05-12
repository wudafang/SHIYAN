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
		System.out.println("请输入——0:退出1:显示所有2:添加3:修改4:删除5:查询6:按年龄排序输出 ");
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
