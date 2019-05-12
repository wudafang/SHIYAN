//import java.util.Scanner;
public class R8 {
public static void main(String[] args){
	int ss=getMax(0,0,0);
//	int ss=getMax(100,500,50);//第一种
	System.out.println("最大的数字为："+ss);
	
}
public static int getMax(int a,int b, int c){
	int d=0;
//	Scanner sn=new Scanner(System.in);//第一种
//	System.out.println("请输入第一个数字");//第一种
//	a=sn.nextInt();
//	System.out.println("请输入第二个数字");//第一种
//	b=sn.nextInt();
//	System.out.println("请输入第三个数字");//第一种
//	c=sn.nextInt();//第一种
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

