
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
	//��һ�ַ���
	Complexpow f=q.pow(10,-2);
	System.out.println(f);
	//��һ�ַ�������
	//�ڶ��ַ�����ʼ
	Complexpow ff=q.pow(s);
	System.out.println(ff);
	//�ڶ��ַ�������
	//�����ַ�����ʼ
	Complexpow fff=Complexpow.pow(q,s);
	System.out.println(fff);
}

//��һ�ַ���
public Complexpow pow(int real,int img){
	return  new Complexpow(this.real*real,this.img*img);
}
//��һ�ַ�������
//�ڶ��з�����ʼ
public Complexpow pow(Complexpow s){
	return new Complexpow(this.real*s.real,this.img*s.img);
}
//�ڶ��ַ�������
public static Complexpow pow(Complexpow q,Complexpow s){
	return new Complexpow(q.real*s.real,q.img*s.img);
}
}
