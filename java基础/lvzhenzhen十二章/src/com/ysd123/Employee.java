package com.ysd123;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 员工实体类
 * 
 * @author zz.lv
 * 
 */
public class Employee {

	private String num;
	private String name;
	private String sex;
	private Date birthday;
	private int age;

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
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

	public void setAge(int age) {
		this.age = age;
	}

	public Employee() {

	}

	public Employee(String num, String name, String sex, Date birthday) {
		this.num = num;
		this.name = name;
		this.sex = sex;
		this.birthday = birthday;
		this.age = getAge();
	}

	/**
	 * 求一下员工的年龄
	 * 
	 * @return 年龄
	 */
	public int getAge() {
		Calendar c = Calendar.getInstance();
		int now = c.get(Calendar.YEAR);
		c.setTime(birthday);
		int bir = c.get(Calendar.YEAR);

		return now - bir;

	}

	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		return "工号：" + num + ", 姓名：" + name + ", 性别：" + sex + ", 生日："
				+ sdf.format(birthday) + ", 年龄：" + age;
	}
}
