
public class R6 {
public static void main(String[] args){
	for(int i=2;i<=1000;i++){
		if(isSuShu(i)==true){
			System.out.print(i+" ");
		}
		
	}
}
public static boolean isSuShu(int n){
	for(int i=2;i<=n-1;i++){
		if(n%i==0){
			return false;
		}
	}
	return true;
}
}


//public class R6{
//	public static int isSuShu(int n){
//		for(int i=2;i<=n-1;i++){
//			if(n%i==0){
//				return -1;
//			}
//		}
//		return n;
//	}
//       public static void main(String[] args){
//    	   for(int i=2;i<=1000;i++){
//    		   if(isSuShu(i)==i){
//    			   System.out.println(i+" ");
//    		   }
//    	   }
//       }
//}
