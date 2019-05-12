import java.util.Scanner;


public class R2 {
public static void main(String[] args){
	double x;
	double y;
	Scanner s=new Scanner(System.in);
	while(true){
		System.out.println("请输入1500米长跑的时间：");
		x=s.nextDouble();
		System.out.println("请输入投掷铅球的距离：");
		y=s.nextDouble();
		if(x<4&&y>8){
			System.out.println("大功告成，不必练习啦！");
			break;
		}else{
			System.out.println("革命尚未成功，早上练习跑步晚上练习引体向上。");
			break;
		}
	}
	
//分割线	
//	System.out.println("请输入1500米长跑的时间：");
//	x=s.nextDouble();
//	System.out.println("请输入投掷铅球的距离：");
//	y=s.nextDouble();
//	if(x<4&&y>8){
//		System.out.println("大功告成，不必练习啦！");
//
//	}else{
//		System.out.println("革命尚未成功，早上练习跑步晚上练习引体向上。");
//		
//	}
//分割线
}
}
