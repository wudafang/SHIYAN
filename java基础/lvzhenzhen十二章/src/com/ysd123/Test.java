package com.ysd123;

import java.text.ParseException;
import java.util.Scanner;
/**
 * �����࣬�˵�
 * @author zz.lv
 *
 */
public class Test {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		//��ʼ��һ��Ա���������
		EmployeeManager em = new EmployeeManager();
		System.out.println("��ӭʹ��****����ϵͳ��");
		
		int order;
		do {
			System.out.println("0:�˳�");
			System.out.println("1:��ʾ����");
			System.out.println("2:���");
			System.out.println("3:�޸�");
			System.out.println("4:ɾ��");
			System.out.println("5:��ѯ");
			System.out.println("6:�������������");
			System.out.println("��ѡ��:");
			//�û������ѡ��
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
		
		System.out.println("�˳�****����ϵͳ��");

	}

}
