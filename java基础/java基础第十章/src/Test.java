
public class Test {
public static void main(String[] args){
	String email="yunhua@shigu.com ";
	int index1=email.indexOf(".");
	int index2=email.indexOf("@");
	
	if(index1!=-1&&index1>index2){
		System.out.println("邮箱格式正确。请继续。 ");
	}else{
		System.out.println("邮箱格不正确,请重新输入。 ");
	}
}
}