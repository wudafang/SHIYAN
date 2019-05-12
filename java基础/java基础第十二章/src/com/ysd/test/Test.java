package com.ysd.test;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

import com.ysd.entity.Employee;
import com.ysd.manager.EmployeeManager;

public class Test {
	public static void main(String[] args) throws ParseException {
		EmployeeManager em = new EmployeeManager();
		showMenu(em);
	}
	
	public static void showMenu(EmployeeManager em) throws ParseException{
		System.out.println("��ӭʹ��YSD����ϵͳ");
		int order = 0;
		do {
			System.out.println("0���˳� 1����ѯ���� 2����� 3���޸� 4��ɾ�� 5����ѯ 6���������������");
			Scanner sc = new Scanner(System.in);
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
				em.printByName();
				break;
			case 6:
				em.printSortByAge();
				break;
			default:
				break;
			}
		} while (order != 0);
	}
	
	
}
