package com.ysd.manager;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.ysd.entity.Employee;

public class EmployeeManager {
	Employee[] emps = new Employee[1000];
	int empCount = 0; //���������е�����
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	Scanner sc = new Scanner(System.in);
	
	public EmployeeManager() throws ParseException {
		emps[0] = new Employee(100, "������", "��", sdf.parse("1980-12-12"));
		emps[1] = new Employee(101, "���޼�", "��", sdf.parse("1995-12-12"));
		emps[5] = new Employee(102, "����", "Ů", sdf.parse("1999-12-12"));
		empCount = 3;
	}

	//�������η� ����ֵ���� �������������б����������
	public void printAll(){ //���飬����������˵������Ĳ������Ǳ�����ѭ����
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
		System.out.println("������Ҫ��ӵ�Ա�����ţ�");
		int num = sc.nextInt();
		System.out.println("������Ҫ��ӵ�Ա��������");
		String name = sc.next();
		System.out.println("������Ҫ��ӵ�Ա���Ա�");
		String sex = sc.next();
		System.out.println("������Ҫ��ӵ�Ա�����գ�");
		String birthday = sc.next();
		
		Date birth = sdf.parse(birthday);
		
		Employee e = new Employee(num, name, sex, birth);
		
		if (index != -1) {
			emps[index] = e;
			empCount++;
		} else {
			System.out.println("����û��λ����");
		}
	}
	
	public void update(){
		System.out.println("�޸�");
	}
	
	public void delete(){
		System.out.println("ɾ��");
	}
	
	public void printByName(){
		System.out.println("����������ѯ");
	}
	
	public void printSortByAge(){
		System.out.println("������������");
	}
}
