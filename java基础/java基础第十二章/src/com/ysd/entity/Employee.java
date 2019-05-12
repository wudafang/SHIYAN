package com.ysd.entity;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Employee { // 实体类，一般由私有属性、getter setter方法、带参构造方法、无参构造方法、toString方法
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
	//什么是构造方法？
	//没有返回值类型，并且方法名和类名保持一致
	//构造方法在被new时调用，就是用来创建对象的。
	

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
	 * 获取年龄
	 * @return
	 */
	public int getAge(){
		Calendar c = Calendar.getInstance(); //获取当前时间
		int year = c.get(Calendar.YEAR); //获取当前年份
		c.setTime(birthday);  //时间就设置为了出生时间
		int birthYear = c.get(Calendar.YEAR); //出生年份
		return year - birthYear;
	}

	@Override
	public String toString() {//如果没有toString方法，会直接输出该对象在内存中的地址，如果有toString，则会直接调用toString方法
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");             //格式化
		return "工号："+this.num+"，姓名："+this.name+"，性别："+this.sex+"，生日："+sdf.format(this.birthday)+"，年龄：" + this.getAge();
	}
	

}
