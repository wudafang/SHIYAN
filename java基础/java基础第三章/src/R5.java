import java.util.Scanner;
public class R5 {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	System.out.println("������ɼ���");
	double q=s.nextDouble();
	if(q==100){
		System.out.println("�����˲ι�һ��");
	}else if(q>=90){
		System.out.println("����ˮ��һ��");
	}else if(q>=60){
		System.out.println("��ι������");
	}else{
		System.out.println("����������ʱ��" );
	}
}
}
