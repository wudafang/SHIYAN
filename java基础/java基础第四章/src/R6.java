import java.util.Scanner;
public class R6 {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	int i=1;
	String sex="";
	while(i<=2){
		System.out.println("��¼��������");
		String xm=s.next();
		System.out.println("��¼���Ա�");
		 sex=s.next();
		if(sex.equals("Ů")){
			System.out.println("ֻ�����б���");
			continue;
		}
		System.out.println("��¼����ߣ�");
		int sg=s.nextInt();
		System.out.println("��¼�����䣺");
		int nl=s.nextInt();
		if(nl>18&&nl<50){
			System.out.println("��ϲ���ɹ�����");
			System.out.println("����"+xm+"�Ա�"+sex+"���"+sg+"����"+nl);
		}
		
		
		i++;
	}
}
}
