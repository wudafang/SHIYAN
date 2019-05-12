
public class Complex {
int real,img;
public Complex(int real,int img){
	this.real=real;
	this.img=img;
}
public static void main(String[] args){
	Complex q=new Complex(5,3);
	Complex a=new Complex(10,-2);
	System.out.println(q);
	System.out.println(a);
	Complex f3=q.add(10,-2);//��һ�ַ���
	Complex f33=q.add(a);
	System.out.println(f3);//��һ�ַ���
	System.out.println(f33);
	Complex f333=Complex.add(q,a);//�����ַ���
	System.out.println(f333);
}
@Override
public String toString() {
	 return  real+"+"+ img + "i";
}
//��һ�ַ���
public Complex add(int real,int img){
	return new Complex(this.real+real,this.img+img);
}
//�ڶ��ַ���
public Complex add(Complex a){
	return new Complex(this.real+a.real,this.img+a.img);
}
//�����ַ���
public static Complex add(Complex q,Complex a){
	return new Complex(q.real+a.real,q.img+a.img);
}
}
