import java.util.*;

public class HashMapObject {

	public static void main(String[] args) {
		Map<String, Book> bookCheckOut = new HashMap<String, Book>();
		// Creating Books
		Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		Book b2 = new Book(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
		Book b3 = new Book(104, "Operating System", "Galvin", "Wiley", 6);
		Book b4 = new Book(103, "Big Java - Late Objects", "Cay Horstmann", "Wiley", 2);
		Book b5 = new Book(105, "Head First - Design Patterns", "Freeman & Freeman", "O'Reilly", 7);
		Book b6 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		
		// Adding Books to list
		bookCheckOut.put("John", b3);
		bookCheckOut.put("Dave",b1);
		bookCheckOut.put("Mary",b4);
		bookCheckOut.put("Sophie",b2);
		bookCheckOut.put("Brian",b5);
		bookCheckOut.put("John",b6);    // Overwrites first association
		
		if (bookCheckOut.containsKey("John"))
			System.out.println("List already contains Book : " + b6.getName() );
		
		System.out.println("The list contains "+ bookCheckOut.size() + " books\n\n");
		
		// Traversing Map
		for (String key : bookCheckOut.keySet()) {
			Book b = bookCheckOut.get(key);
			System.out.println(key + " checked out " + b.name + " by " + b.author);
		}
		
	}

}
