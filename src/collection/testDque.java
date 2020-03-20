package collection;

import java.util.*;  
public class testDque{  
	public static void main(String[] args) {  
		//Creating Deque and adding elements  
		Deque<String> deque = new ArrayDeque<String>();  
		deque.add("Gautam");  
		deque.add("Karan");  
		deque.add("Ajay");
		deque.addFirst("MJ");
		deque.addLast("RJ");
		
		//Traversing elements  
		for (String str : deque) {  
			System.out.println(str);  
		}  
	}  
}  