package Day2;
import java.util.*;

class Book{
	String title;
	String author;
	String ISBN;
	
	Book(String title,String author,String ISBN){
		this.title  = title;
		this.author = author;
		this.ISBN = ISBN;
	}
	void display() {
		System.out.println("Title :"+title);
		System.out.println("Author:"+author);
		System.out.println("ISBN:"+ISBN);
	}
}

public class ISBN {

	public static void main(String[] args) {
		Book obj = new Book("The Human Torch","Stan Lee","978-1-4028-9462-6");
		Book obj1 = new Book("The Last Knight On Earth","Scott Snyder"," 1-4028-9462-7");
		
		List<Book> a = new ArrayList<>();
		
		a.add(obj);
		a.add(obj1);
		System.out.println("Before Delete : ");
		obj.display();
		System.out.println();
		obj1.display();
		System.out.println();
		a.remove(obj);
		System.out.println("After Delete : ");
		obj1.display();


	}

}
