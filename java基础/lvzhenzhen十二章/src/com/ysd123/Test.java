package com.ysd123;

import java.text.ParseException;
import java.util.Scanner;
/**
 * 调试类，菜单
 * @author zz.lv
 *
 */
public class Test {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		//初始化一个员工管理对象
		EmployeeManager em = new EmployeeManager();
		System.out.println("欢迎使用****管理系统！");
		
		int order;
		do {
			System.out.println("0:退出");
			System.out.println("1:显示所有");
			System.out.println("2:添加");
			System.out.println("3:修改");
			System.out.println("4:删除");
			System.out.println("5:查询");
			System.out.println("6:按年龄排序输出");
			System.out.println("请选择:");
			//用户输入的选项
			order = sc.nextInt();

			switch (order) {
			case 1:
				em.printAll();
				break;
			case 2:
				em.add();
				break;
			case 3:
				em.update();
				break;
			case 4:
				em.delete();
				break;
			case 5:
				em.queryByName();
				break;
			case 6:
				em.printSortByAge();
				break;

			}
		} while (order != 0);
		
		System.out.println("退出****管理系统！");

	}

}
