package com.ysd.entity;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Employee { // ʵ���࣬һ����˽�����ԡ�getter setter���������ι��췽�����޲ι��췽����toString����
	private int num;
	private String name;
	private String sex;
	private Date birthday;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	//ʲô�ǹ��췽����
	//û�з���ֵ���ͣ����ҷ���������������һ��
	//���췽���ڱ�newʱ���ã�����������������ġ�
	

	public Employee() {
		System.out.println(1);
	}

	public Employee(int num, String name, String sex, Date birthday) {
		super();
		this.num = num;
		this.name = name;
		this.sex = sex;
		this.birthday = birthday;
	}
	
	/**
	 * ��ȡ����
	 * @return
	 */
	public int getAge(){
		Calendar c = Calendar.getInstance(); //��ȡ��ǰʱ��
		int year = c.get(Calendar.YEAR); //��ȡ��ǰ���
		c.setTime(birthday);  //ʱ�������Ϊ�˳���ʱ��
		int birthYear = c.get(Calendar.YEAR); //�������
		return year - birthYear;
	}

	@Override
	public String toString() {//���û��toString��������ֱ������ö������ڴ��еĵ�ַ�������toString�����ֱ�ӵ���toString����
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");             //��ʽ��
		return "���ţ�"+this.num+"��������"+this.name+"���Ա�"+this.sex+"�����գ�"+sdf.format(this.birthday)+"�����䣺" + this.getAge();
	}
	

}
