

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
	return " 长度 "+cd + "宽度 "+kd+"面积"+mianji();
}
//public static void main(String[] args){
//	Juxing q=new Juxing();
//}
}
