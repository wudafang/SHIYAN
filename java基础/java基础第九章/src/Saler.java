
public class Saler {
static int ticket=3;

public void Ticket(){
	if(Saler.ticket>0){
		Saler.ticket--;
		System.out.println("��Ʊ�ɹ�");
	}else{
		System.out.println("Ʊ������");
	}
}
public static void main(String[] args){
	Saler q1=new Saler();
	Saler q2=new Saler();
	Saler q3=new Saler();
	q1.Ticket();
	q1.Ticket();
	q1.Ticket();
    q2.Ticket();
}
}