import java.util.Scanner;
/**
 * ���������洢ѧ���Լ�ʹ�÷���
 * @author Administrator
 *
 */

public class Manger {
Employee [] q=new Employee[1000];
int count=0;
Scanner sc=new Scanner(System.in);
public Manger() {
	super();
	q[0]=new Employee(001,"����","1801","java����",88);
	q[4]=new Employee(005,"����","1805","java����",92);
	q[2]=new Employee(002,"����","1801","HTML",68);
	q[1]=new Employee(003,"Ǯ��","1805","java����",88);
	count=4;
	
}
/**
 * ������е�ѧ����Ϣ�ķ���
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
 * ������������ѧ���ĳɼ��ķ���
 */
public void getResult(){
	System.out.println("������Ҫ����ѧ��������");
	//�ȴ�����
	String name=sc.next();
	int index= getName(name);
	if(index!=-1){
		System.out.println(q[index]);
	}else{
		System.out.println("û���ҵ���ѧ��");
	}
		
			
		}
	
	
/**
 * �޸�ѧ������Ϣ�ķ���
 */
public void update(){
	System.out.println("������Ҫ�޸�ѧ���ı��");
	int num=sc.nextInt();
	//��ȡ���ǿյ��±�
	int index=getIndex();
	//����Ϊ�޸ĺ��ѧ����Ϣ
	if(index!=-1){
		System.out.println("������Ҫ�޸ĺ������");
		String name=sc.next();
		System.out.println("������Ҫ�޸ĺ�İ༶");
		String banji=sc.next();
		System.out.println("������Ҫ�޸ĺ�Ŀ�Ŀ");
		String kemu=sc.next();
		System.out.println("������Ҫ�޸ĺ�ĳɼ�");
		double score=sc.nextDouble();
		Employee e=new Employee(num,name,banji,kemu,score);
		q[index]=e;
		System.out.println("�޸ĳɹ�");
	}
	
}
/**
 * ��ȡѧ����ŵķ���
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
