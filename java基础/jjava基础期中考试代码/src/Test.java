import java.util.Scanner;
/**
 * 此类用来测验以及显示屏幕
 * @author Administrator
 *
 */

public class Test {
public static void main(String[] args){
	Manger m=new Manger();
	menu(m);
}
public static void menu(Manger e){
	System.out.println("欢迎使用学生成绩管理系统！ ");
	int order=0;
	Scanner sc=new Scanner(System.in);
	do {
		System.out.println("请选择功能：0：退出1：显示所有2：根据姓名查询成绩3：修改成绩信息 ");
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
			System.out.println("谢谢使用本系统！ ");
		}
		
			
	} while (order!=0);
}
}
