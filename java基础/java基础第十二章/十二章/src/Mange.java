
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;



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

	public int getindex() {
		for (int i = 0; i < q.length; i++) {
			if (q[i] == null) {
				return i;
			}

		}
		return -1;

	}

	public void add() throws ParseException  {
		int i=getindex();
		System.out.println("请输入新员工的工号。");
		int num=r.nextInt();
		System.out.println("请输入新员工的姓名。");
		String name=r.next();
		System.out.println("请输入新员工的性别。");
		String sex=r.next();
		System.out.println("请输入新员工的生日。");
		String birthday=r.next();
		Date bir=d.parse(birthday);
		if(i>=0){ 
			q[i]=new Emploee(num,name,sex,bir);
			
			count++;
		}else{
			System.out.println(" 数组已经没有空间储存新员工了。");
		}
		
		
		
         
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
System.out.println("请输入要修改员工工号。");
int n=r.nextInt();
int  index=getqIndexBynum( n);
if(index!=-1){
	System.out.println("请输入新员工的工号");
	int num = r.nextInt();
	System.out.println("请输入新员工的姓名");
	String name = r.next();
	System.out.println("请输入新员工的性别");
	String sex = r.next();
	System.out.println("请输入新员工的生日");
	String birthday = r.next();
	Date bir=d.parse(birthday);
	Emploee e = new Emploee(num, name, sex, bir);
	q[index] = e;
	
	
}else{
	System.out.println("未找到员工的信息");
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
		System.out.println("排序后的员工数据(由小到大)");
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
