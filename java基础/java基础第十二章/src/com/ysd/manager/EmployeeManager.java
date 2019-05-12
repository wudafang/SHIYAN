package com.ysd.manager;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.ysd.entity.Employee;

public class EmployeeManager {
	Employee[] emps = new Employee[1000];
	int empCount = 0; //标明数组中的数量
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	Scanner sc = new Scanner(System.in);
	
	public EmployeeManager() throws ParseException {
		emps[0] = new Employee(100, "张三丰", "男", sdf.parse("1980-12-12"));
		emps[1] = new Employee(101, "张无忌", "男", sdf.parse("1995-12-12"));
		emps[5] = new Employee(102, "赵敏", "女", sdf.parse("1999-12-12"));
		empCount = 3;
	}

	//访问修饰符 返回值类型 方法名（参数列表）｛方法体｝
	public void printAll(){ //数组，对于数组来说，最常见的操作就是遍历（循环）
		for (Employee e : emps) {
			if (e != null) {
				System.out.println(e);
			}
		}
	}
	
	public int getIndex(){
		for (int i = 0; i < emps.length; i++) {
			if (emps[i] == null) {
				return i;
			}
		}
		return -1;
	}
	
	public void add() throws ParseException{
		int index = getIndex();
		System.out.println("请输入要添加的员工工号：");
		int num = sc.nextInt();
		System.out.println("请输入要添加的员工姓名：");
		String name = sc.next();
		System.out.println("请输入要添加的员工性别：");
		String sex = sc.next();
		System.out.println("请输入要添加的员工生日：");
		String birthday = sc.next();
		
		Date birth = sdf.parse(birthday);
		
		Employee e = new Employee(num, name, sex, birth);
		
		if (index != -1) {
			emps[index] = e;
			empCount++;
		} else {
			System.out.println("数组没有位置了");
		}
	}
	
	public void update(){
		System.out.println("修改");
	}
	
	public void delete(){
		System.out.println("删除");
	}
	
	public void printByName(){
		System.out.println("根据姓名查询");
	}
	
	public void printSortByAge(){
		System.out.println("根据年龄排序");
	}
}
