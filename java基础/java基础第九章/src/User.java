
public class User {
private String name;
private String password;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return "******";
	
}
public void setPassword(String password) {
	if(password.length()>6){
		System.out.println("��������������");
	}else{
		this.password = password;
	}
	
}
//public static void main(String[] args){
//	User q=new User();
//	q.name="������";
//	q.setPassword("123456");
//	System.out.println(q.name+"��������"+q.getPassword());
//	System.out.println(q.getPassword());
//}
}
