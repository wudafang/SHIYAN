
public class Dan2 {
    public static void main(String[] args) {

	String email = "laurenyang@imooc.com";
//	int index = email.lastIndexOf(".");
//	System.out.println(index);
	int index2 = email.indexOf("@"); 
	int index3 = email.indexOf('.');
	if (index2 != -1 && index3 > index2) {
		System.out.println("邮箱格式正确");
	} else {
		System.out.println("邮箱格式无效");
	}
   }
}



