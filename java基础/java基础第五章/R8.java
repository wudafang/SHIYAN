
public class R8 {
public static void main(String[] args){
	double p=1,q=1,f;
	System.out.print(p+","+q);
	for(int i=3;i<=20;i++){	
		f=p+q;
		System.out.print(","+f);
		p=q;
		q=f;
	}
}
}
