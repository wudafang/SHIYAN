
public class Saler {
static int ticket=3;

public void Ticket(){
	if(Saler.ticket>0){
		Saler.ticket--;
		System.out.println("售票成功");
	}else{
		System.out.println("票已售完");
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