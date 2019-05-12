package com.ysd123;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * Ա��������
 * 
 * @author zz.lv
 * 
 */
public class EmployeeManager {
	ArrayList<Employee> list = new ArrayList<Employee>();

	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

	Scanner sc = new Scanner(System.in);

	/**
	 * ���췽�����������Ա����Ϣ
	 * 
	 * @throws ParseException
	 */
	public EmployeeManager() throws ParseException {
		list.add(new Employee("100", "jim", "��", sdf.parse("2000-01-01")));
		list.add(new Employee("101", "tom", "��", sdf.parse("2002-01-01")));
		list.add(new Employee("102", "lily", "Ů", sdf.parse("1990-01-01")));
		list.add(new Employee("103", "lucy", "Ů", sdf.parse("1997-01-01")));

	}

	/**
	 * ��ӡ����Ա����Ϣ
	 */
	public void printAll() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	/**
	 * ����������ѯԱ����Ϣ
	 */
	public void queryByName() {
		System.out.println("����Ҫ��ѯԱ��������");
		String name = sc.next();
		for (int i = 0; i < list.size(); i++) {
			// ��ǰԱ���Ƿ����Ҫ��ѯ������
			if (list.get(i).getName().contains(name)) {
				System.out.println(list.get(i));
			}
		}
	}

	/**
	 * ���Ա��
	 * 
	 * @throws ParseException
	 */
	public void add() throws ParseException {

		System.out.println("������Ա���Ĺ��ţ�");
		String num = sc.next();

		int index = queryYgbyNum(num);
		if (index != -1) {
			System.out.println("�˹����Ѵ���");
			return;
		}

		System.out.println("������Ա����������");
		String name = sc.next();
		System.out.println("������Ա�����Ա�");
		String sex = sc.next();
		System.out.println("������Ա�������գ�(2000-01-01)");
		String day = sc.next();

		// ��stringת��Ϊ���ڶ��� ����parse();

		Date birthday = sdf.parse(day);
		Employee e1 = new Employee(num, name, sex, birthday);
		list.add(e1);
	}

	/**
	 * ��ѯԱ�����±꣬ͨ������
	 * 
	 * @param num
	 *            ����
	 * @return �±꣬���û�����Ա��������-1
	 */
	public int queryYgbyNum(String num) {
		for (int i = 0; i < list.size(); i++) {
			if (num.equals(list.get(i).getNum())) {
				return i;

			}
		}

		return -1;
	}

	/**
	 * �޸�Ա������Ϣ
	 * 
	 * @throws ParseException
	 */
	public void update() throws ParseException {
		System.out.println("����Ҫ�޸�Ա���Ĺ���");
		String num = sc.next();

		int index = queryYgbyNum(num);
		// Ա��������
		if (index == -1) {
			System.out.println("Ա��������");
			return;
		}
		System.out.println("������Ա����������");
		String name = sc.next();
		System.out.println("������Ա�����Ա�");
		String sex = sc.next();
		System.out.println("������Ա�������գ�(2000-01-01)");
		String day = sc.next();

		Date birthday = sdf.parse(day);
		Employee e1 = new Employee(num, name, sex, birthday);

		list.set(index, e1);

	}

	/**
	 * ɾ��Ա��
	 */
	public void delete() {
		System.out.println("����Ҫɾ��Ա���Ĺ���");
		String num = sc.next();

		int index = queryYgbyNum(num);
		// Ա��������
		if (index == -1) {
			System.out.println("Ա��������");
			return;
		}

		list.remove(index);
	}

	/**
	 * �������������������Ա����Ϣ
	 */
	public void printSortByAge() {
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = 0; j < list.size() - 1 - i; j++) {
				if (list.get(j).getAge() > list.get(j + 1).getAge()) {
					Employee temp = list.get(j);
					list.set(j, list.get(j + 1));
					list.set(j + 1, temp);
				}
			}

		}
		printAll();

	}

}
