
public class R12 {
public static void main(String[] args){
	for(int i=1; i<=1000;i++){
		double g=i%10;
		double s=i/10%10;
		double b=i/100%10;
		if(i==g*g*g+s*s*s+b*b*b){
			System.out.println("ˮ�ɻ���"+i);
			//�����ǰ����Լ���˼·����û�������ϵģ���Ҫ������ϵĴ����ٴ�һ�飩
		}
	}
}
}
