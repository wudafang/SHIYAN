
public class R12 {
public static void main(String[] args){
	for(int i=1; i<=1000;i++){
		double g=i%10;
		double s=i/10%10;
		double b=i/100%10;
		if(i==g*g*g+s*s*s+b*b*b){
			System.out.println("水仙花数"+i);
			//以上是按照自己的思路所作没按照书上的（需要理解书上的代码再打一遍）
		}
	}
}
}
