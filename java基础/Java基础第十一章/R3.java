import java.util.*;
public class R3 {
public static void main(String[] args){
//	int[] q={20,5,60,8 };
	ArrayList<Juxing> q=new ArrayList<Juxing>();
	q.add(new Juxing(2,50));
	q.add(new Juxing(20,50));
	q.add(new Juxing(5,50));
	for(int i=0;i<q.size()-1;i++){
		for (int j=0;j<q.size()-1-i;j++){
			if(q.get(j).mianji()>q.get(j+1).mianji()){
				Juxing temp;
				temp=q.get(j);
				q.set(j,q.get(j+1));
				q.set(j+1,temp);
				
				}
		}
	}
	for(int i=0;i<q.size();i++){
		System.out.println(q.get(i));
	}
}
}
