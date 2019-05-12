
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
		System.out.println("请重新输入密码");
	}else{
		this.password = password;
	}
	
}
//public static void main(String[] args){
//	User q=new User();
//	q.name="霍建华";
//	q.setPassword("123456");
//	System.out.println(q.name+"的密码是"+q.getPassword());
//	System.out.println(q.getPassword());
//}
}
