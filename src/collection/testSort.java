package collection;

import java.util.*;  
class testSort{  
	public static void main(String args[]){  

		ArrayList<String> al=new ArrayList<String>();  
		al.add("Viru");  
		al.add("Saurav");  
		al.add("Mukesh");  
		al.add("Tahir");  

		Collections.sort(al); 
		Collections.sort(al,Collections.reverseOrder());
		Iterator itr=al.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  
	}  
}  