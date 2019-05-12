
public class R1 {
//String name="霍建华";//无参使用并把main方法里的对象里的属性舍去并把public R1的注视掉。
//int heigh=180;
	
	
	String name;
	int heigh;
	public R1(String name,int heigh){
		this.name=name;
		this.heigh=heigh;
	}
public static void main(String[] args){
	R1 w=new R1("霍建华",190);
	w.sayHi();
	System.out.println();
	R1 q=new R1("林心如",168);
	q.sayHi();
	
}
public  void sayHi(){
	System.out.print("我是    "+this.name+"    身高   "+this.heigh);
}
}
