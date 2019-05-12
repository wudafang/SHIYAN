import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import sun.util.calendar.LocalGregorianCalendar.Date;

public class Mange {
	Scanner r = new Scanner(System.in);
	Emploee[] q = new Emploee[100];
	int count = 0;
	SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd");
	private int num;

	public Mange() throws ParseException {

		q[0] = new Emploee(001, "霍建华", "男", d.parse("1999-01-02"));

		q[1] = new Emploee(002, "林心如", "女", d.parse("1999-02-02"));

		q[5] = new Emploee(003, "赵敏", "女", d.parse("1999-12-12"));
		count = 3;
	}

	public void printall() {
		for (Emploee e : q) {
			if (e != null) {
				System.out.println(e);
			}
		}
	}

	public int getindex(int num) {
		for (int i = 0; i < q.length; i++) {
			if (q[i] == null) {
				return i;
			}

		}
		return -1;

	}

	public void add() throws ParseException {
		int i = getqIndexBynum(num);
		System.out.println("请输入新员工的工号");
		int num = r.nextInt();
		System.out.println("请输入新员工的姓名");
		String name = r.next();
		System.out.println("请输入新员工的性别");
		String sex = r.next();
		System.out.println("请输入新员工的生日");
		String birthday = r.next();
		java.util.Date bir=d.parse(birthday);
		Emploee e = new Emploee(num, name, sex, bir);
		q[i] = e;
         count++;
         
	}

	public int getqIndexBynum(int num) {
		for (int i = 0; i < q.length; i++) {
			if (q[i] != null && q[i].getNum() == num) {
				return i;

			}
		}
		return -1;

	}

	public void update() throws ParseException {

		System.out.println("请输入新员工的工号");
		int num = r.nextInt();
		int index = getqIndexBynum(num);
		for (int i = 0; i < q.length; i++) {
			if (index != -1) {
				System.out.println("请输入员工的新姓名");
				String name = r.next();
				System.out.println("请输入员工的性别");
				String sex = r.next();
				System.out.println("请输入员工的生日");
				String birthday = r.next();

				java.util.Date birth = d.parse(birthday);
				Emploee e = new Emploee(num, name, sex, birth);
				q[index] = e;
				count++;
			} else {
				System.out.println("未找到该员工");
			}

		}

	}

	public void delet() {
		System.out.println("请输入要删除员工的工号");
		int num = r.nextInt();
		int index = getqIndexBynum(num);
		if (index >= 0) {
			q[index] = null;
			count--;
		}
	}

	public void getresult() {
		System.out.println("请输入显示的员工姓名");
		String name = r.next();
		for (Emploee e : q) {
			if (e != null && e.getName().contains(name)) {
				System.out.println(e);
			}
		}
	}

	public void getsort() {
		System.out.println("排序前的员工数据");
		printall();
		Emploee[] arr = new Emploee[count];
		int m = 0;
		for (Emploee e : q) {
			if (e != null) {
				arr[m] = e;
				m++;
			}
		}
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j].getAge() > arr[j + 1].getAge()) {
					Emploee emp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = emp;

				}
			}
		}
		for (Emploee t : arr) {
			System.out.println(t);
		}
	}

}
