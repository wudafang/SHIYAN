import java.util.Scanner;
public class R1 {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	System.out.println("请输入视力值(0~2)");
	double q=s.nextDouble();
	System.out.println("请输入身高值：");
	int w=s.nextInt();
	if(q>1.5&&(w>160&&w<170)){
		System.out.println("恭喜被录取");
	}
}
}
