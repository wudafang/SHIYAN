//import java.util.Scanner;
public class R8 {
public static void main(String[] args){
	int ss=getMax(0,0,0);
//	int ss=getMax(100,500,50);//��һ��
	System.out.println("��������Ϊ��"+ss);
	
}
public static int getMax(int a,int b, int c){
	int d=0;
//	Scanner sn=new Scanner(System.in);//��һ��
//	System.out.println("�������һ������");//��һ��
//	a=sn.nextInt();
//	System.out.println("������ڶ�������");//��һ��
//	b=sn.nextInt();
//	System.out.println("���������������");//��һ��
//	c=sn.nextInt();//��һ��
	if(a>b&&b>c||a>c&&c>b){
		return d+=a;
	}
	if(b>a&&a>c||b>c&&c>a){
		return d+=b;
	}
	if(c>b&&b>a||c>a&&a>b){
		return d+=c;
	}
	return d;
	
}
}

