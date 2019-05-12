package com.ysd123;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * 员工管理类
 * 
 * @author zz.lv
 * 
 */
public class EmployeeManager {
	ArrayList<Employee> list = new ArrayList<Employee>();

	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

	Scanner sc = new Scanner(System.in);

	/**
	 * 构造方法，添加已有员工信息
	 * 
	 * @throws ParseException
	 */
	public EmployeeManager() throws ParseException {
		list.add(new Employee("100", "jim", "男", sdf.parse("2000-01-01")));
		list.add(new Employee("101", "tom", "男", sdf.parse("2002-01-01")));
		list.add(new Employee("102", "lily", "女", sdf.parse("1990-01-01")));
		list.add(new Employee("103", "lucy", "女", sdf.parse("1997-01-01")));

	}

	/**
	 * 打印所有员工信息
	 */
	public void printAll() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	/**
	 * 根据姓名查询员工信息
	 */
	public void queryByName() {
		System.out.println("输入要查询员工的姓名");
		String name = sc.next();
		for (int i = 0; i < list.size(); i++) {
			// 当前员工是否包含要查询的姓名
			if (list.get(i).getName().contains(name)) {
				System.out.println(list.get(i));
			}
		}
	}

	/**
	 * 添加员工
	 * 
	 * @throws ParseException
	 */
	public void add() throws ParseException {

		System.out.println("请输入员工的工号：");
		String num = sc.next();

		int index = queryYgbyNum(num);
		if (index != -1) {
			System.out.println("此工号已存在");
			return;
		}

		System.out.println("请输入员工的姓名：");
		String name = sc.next();
		System.out.println("请输入员工的性别：");
		String sex = sc.next();
		System.out.println("请输入员工的生日：(2000-01-01)");
		String day = sc.next();

		// 把string转换为日期对象 方法parse();

		Date birthday = sdf.parse(day);
		Employee e1 = new Employee(num, name, sex, birthday);
		list.add(e1);
	}

	/**
	 * 查询员工的下标，通过工号
	 * 
	 * @param num
	 *            工号
	 * @return 下标，如果没有这个员工，返回-1
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
	 * 修改员工的信息
	 * 
	 * @throws ParseException
	 */
	public void update() throws ParseException {
		System.out.println("输入要修改员工的工号");
		String num = sc.next();

		int index = queryYgbyNum(num);
		// 员工不存在
		if (index == -1) {
			System.out.println("员工不存在");
			return;
		}
		System.out.println("请输入员工的姓名：");
		String name = sc.next();
		System.out.println("请输入员工的性别：");
		String sex = sc.next();
		System.out.println("请输入员工的生日：(2000-01-01)");
		String day = sc.next();

		Date birthday = sdf.parse(day);
		Employee e1 = new Employee(num, name, sex, birthday);

		list.set(index, e1);

	}

	/**
	 * 删除员工
	 */
	public void delete() {
		System.out.println("输入要删除员工的工号");
		String num = sc.next();

		int index = queryYgbyNum(num);
		// 员工不存在
		if (index == -1) {
			System.out.println("员工不存在");
			return;
		}

		list.remove(index);
	}

	/**
	 * 根据年龄排序，输出所有员工信息
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
