

public class Juxing {
int cd,kd;
public Juxing(int cd,int kd){
	this.cd=cd;
	this.kd=kd;
}
public int mianji(){
	int mianji=cd*kd;
	return mianji;
}
public Juxing(){
	
}
@Override
public String toString() {
	return " ���� "+cd + "��� "+kd+"���"+mianji();
}
//public static void main(String[] args){
//	Juxing q=new Juxing();
//}
}
