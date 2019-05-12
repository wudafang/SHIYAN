
public class R5 {
public static void main(String[] args){
	int j;
	for(int i=1;i<=7;i++){
		for(j=1;j<=7-i;j++){
			System.out.print(" ");
		}
		for(j=1;j<=i;j++){
			System.out.print(j);
		}
		for(j=i-1;j>=1;j--){
			System.out.print(j);
		}
		System.out.println();
	}
	//分分线若 把以下分割线的内容删去则是一个等腰三角形
	for(int i=7;i>=1;i--){
		for(j=1;j<=7-i;j++){
			System.out.print(" ");
		}
		for(j=1;j<=i;j++){
			System.out.print(j);
		}
		for(j=i-1;j>=1;j--){
			System.out.print(j);
		}
		System.out.println();
	}
	//分割线
}
}
