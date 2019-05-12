
public class R1 {
public static void main(String[] args){
	for(int i=1;i<=100;i++){
		if(i%3==0){
			System.out.println(i+" Flip");
			
		}
		if(i%5==0){
			System.out.println(i+" Flop");
		}
		if(i%3==0&&i%5==0){
			System.out.println(i+" FlipFlop");
		}
	}
}
}
