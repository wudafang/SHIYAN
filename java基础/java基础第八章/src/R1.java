
public class R1 {
//String name="������";//�޲�ʹ�ò���main������Ķ������������ȥ����public R1��ע�ӵ���
//int heigh=180;
	
	
	String name;
	int heigh;
	public R1(String name,int heigh){
		this.name=name;
		this.heigh=heigh;
	}
public static void main(String[] args){
	R1 w=new R1("������",190);
	w.sayHi();
	System.out.println();
	R1 q=new R1("������",168);
	q.sayHi();
	
}
public  void sayHi(){
	System.out.print("����    "+this.name+"    ���   "+this.heigh);
}
}
