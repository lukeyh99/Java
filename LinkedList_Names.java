import java.util.*;

public class LinkedList_Names {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();  
        System.out.println("Initial list of names: "+ll);  
        ll.add("John");  
        ll.add("Dave");  
        ll.add("Barry");  
        System.out.println("After invoking add(E e) method: "+ll);  
        
        //Adding an element at the specific position  
        ll.add(1, "Paul");  
        System.out.println("After invoking add(int index, E element) method: "+ll);  
        
        LinkedList<String> ll2=new LinkedList<String>();  
        ll2.add("Mary");  
        ll2.add("Helen");  
        
        //Adding second list elements to the first list  
        ll.addAll(ll2);  
        System.out.println("After invoking addAll(Collection<? extends E> c) method: "+ll);  
        
        LinkedList<String> ll3=new LinkedList<String>();  
        ll3.add("Fido");  
        ll3.add("Fifi");  
        
        //Adding second list elements to the first list at specific position  
        ll.addAll(1, ll3);  
        System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: "+ll);  
        
        //Adding an element at the first position  
        ll.addFirst("Bob");  
        System.out.println("After invoking addFirst(E e) method: "+ll);  
        
        //Adding an element at the last position  
        ll.addLast("Frank");  
        System.out.println("After invoking addLast(E e) method: "+ll);  

	}

}
