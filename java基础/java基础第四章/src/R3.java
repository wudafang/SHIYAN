import java.util.Scanner;
public class R3 {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	System.out.println("������༶����������");
	int num=s.nextInt();
	int i=1;
	int total=0;
	while(i<=num){
		System.out.println("������"+i+"���˵ĳɼ���");
		double fs=s.nextDouble();
	  total +=fs;
		i++;
	}
	double avg=total/num;
	System.out.println("ƽ���ɼ���"+avg);
}
}
