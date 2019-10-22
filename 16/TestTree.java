

import java.util.*;

public class TestTree {
	
	public static void main(String[] args) {
		new TestTree().go();
	}	
	
	public void go() {
		Book b1 = new Book("How Cats  Work");
		Book b2 = new Book("Remix your Body");
		Book b3 = new Book("Finding Emo");
		
		BookCompare bcompare = new BookCompare();
		TreeSet<Book> tree = new TreeSet<Book>(bcompare);
		
		tree.add(b1);
		tree.add(b2);
		tree.add(b3);
		System.out.println(tree);
	}
	
	public class BookCompare implements Comparator<Book> {
		public int compare(Book one, Book two) {
			return (one.title.compareTo(two.title));
		}
	}
}

class Book {
	String title;
	public Book(String t) {
		title = t;
	}	
	
	public String toString() {
		return title;
	}	
}