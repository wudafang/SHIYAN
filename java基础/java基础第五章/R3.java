
public class R3 {
public static void main(String[] args){
	for(int g=1;g<=100;g++){
		for(int m=1;m<=100;m++){
			for(int x=1;x<=100;x++){
				if(5*g+3*m+x/3==100&&g+m+x==100&&x%3==0){
					System.out.println("������"+g+"����"+"ĸ����"+m+"����"+"С����"+x+"��");
				}
			}
		}
	}
}
}
