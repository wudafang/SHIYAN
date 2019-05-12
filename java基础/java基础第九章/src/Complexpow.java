
public class Complexpow {
int real,img;
public Complexpow(int real,int img){
	this.real=real;
	this.img=img;
}


@Override
public String toString() {
	return real+" +"+ img + "i";
}


public static void main(String[] args){
	Complexpow q=new Complexpow(5,3);
	System.out.println(q);
	Complexpow s=new Complexpow(10,-2);
	System.out.println(s);
	//第一种方法
	Complexpow f=q.pow(10,-2);
	System.out.println(f);
	//第一种方法结束
	//第二种方法开始
	Complexpow ff=q.pow(s);
	System.out.println(ff);
	//第二种方法结束
	//第三种方法开始
	Complexpow fff=Complexpow.pow(q,s);
	System.out.println(fff);
}

//第一种方法
public Complexpow pow(int real,int img){
	return  new Complexpow(this.real*real,this.img*img);
}
//第一种方法结束
//第二中方法开始
public Complexpow pow(Complexpow s){
	return new Complexpow(this.real*s.real,this.img*s.img);
}
//第二种方法结束
public static Complexpow pow(Complexpow q,Complexpow s){
	return new Complexpow(q.real*s.real,q.img*s.img);
}
}
