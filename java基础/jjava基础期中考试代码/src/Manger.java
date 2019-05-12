import java.util.Scanner;
/**
 * 此类用来存储学生以及使用方法
 * @author Administrator
 *
 */

public class Manger {
Employee [] q=new Employee[1000];
int count=0;
Scanner sc=new Scanner(System.in);
public Manger() {
	super();
	q[0]=new Employee(001,"张三","1801","java基础",88);
	q[4]=new Employee(005,"李肃","1805","java基础",92);
	q[2]=new Employee(002,"李四","1801","HTML",68);
	q[1]=new Employee(003,"钱柳","1805","java基础",88);
	count=4;
	
}
/**
 * 输出所有的学生信息的方法
 */

public void printAll(){
	for(Employee e:q){
		if(e!=null){
			System.out.println(e);
		}
	}
}
public int  getName(String name){
	for(int i=0;i<q.length;i++){
		if(q[i]!=null&&q[i].getName().contains(name)){
			return i;
		}
			
	}
	return -1;
}
/**
 * 根据姓名查找学生的成绩的方法
 */
public void getResult(){
	System.out.println("请输入要查找学生的姓名");
	//等待输入
	String name=sc.next();
	int index= getName(name);
	if(index!=-1){
		System.out.println(q[index]);
	}else{
		System.out.println("没有找到该学生");
	}
		
			
		}
	
	
/**
 * 修改学生的信息的方法
 */
public void update(){
	System.out.println("请输入要修改学生的编号");
	int num=sc.nextInt();
	//获取不是空的下标
	int index=getIndex();
	//以下为修改后的学生信息
	if(index!=-1){
		System.out.println("请输入要修改后的姓名");
		String name=sc.next();
		System.out.println("请输入要修改后的班级");
		String banji=sc.next();
		System.out.println("请输入要修改后的科目");
		String kemu=sc.next();
		System.out.println("请输入要修改后的成绩");
		double score=sc.nextDouble();
		Employee e=new Employee(num,name,banji,kemu,score);
		q[index]=e;
		System.out.println("修改成功");
	}
	
}
/**
 * 获取学生编号的方法
 */
public int getIndex(  ){
	for(int i=0;i<q.length;i++){
		if(q[i]!=null){
			return i;
		}
	}
	return -1;
}
}
