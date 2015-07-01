package week2.Day3;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class Book {
	private String title;
    private String author;
	private String edition;
	private String pageCount;
	private boolean hardcover;
	private double price;
	
	public Book(String title, String author, String edition) {
		this.title = title;
		this.author = author;
		this.edition = edition;
	}
	
	public Book(String title, String author, String edition, String pageCount, boolean hardcover, double price) {
		this.title = title;
		this.author = author;
		this.edition = edition;
		this.pageCount = pageCount;
		this.hardcover = hardcover;
		this.price = price;
	}
	
	@Override
	public boolean equals(Object obj) {
		 if(this == obj)
			 return true;
		if(obj==null)
			return false;
		if(!(obj instanceof Book))
			return false;
		Book book = (Book)obj;
		if(book.title.equals(this.title) && book.author.equals(this.author) && book.edition.equals(this.edition))
		   return true;
	   else
		   return false;
	}
	
	@Override
	public int hashCode()
	{
		int hash = 5;
		hash = 11 * hash + title.hashCode() * author.hashCode() * edition.hashCode(); 
		return hash;
	}
	
	public String toString()
	{
	String info = "Title: " + this.title + ", Author: " + this.author + 
				  ", Edition: " + this.edition + " Page Count: " + this.pageCount +
				  ", Hard Cover: " + this.hardcover;
	return info;
	}
	
	public Object clone() throws CloneNotSupportedException {
		Book clone=(Book)super.clone();
		return clone;
	}
	
	public static void main(String[] args) {
		Book ob1 = new Book("Kite runner", "Khalid Hussain","3", "500", true, 450.0);
		Book ob2 = new Book("Kite runner", "Khalid Hussain","3", "500", false, 200.0);
		Book ob3 = new Book("Kite runner", "Khalid Hussain", "2");
		Book ob4 = ob1;
		
        if (ob1.equals(ob2))
        System.out.println("Ob1 and Ob2 are Equals --> True");
        else
        	System.out.println("Ob1 and Ob2 are not Equal --> False");	
        if (ob1.equals(ob3))
            System.out.println("Ob1 and Ob3 are Equals --> True");
            else
           	System.out.println("Ob1 and Ob3 are not Equal --> False");	
        System.out.println();
        System.out.println(ob1);
        System.out.println("Hash code Obj1 : " + ob1.hashCode());

        System.out.println();
        System.out.println(ob2);
        System.out.println("Hash code Obj2 : " +ob2.hashCode()); 

        System.out.println();
        System.out.println(ob3);
        System.out.println("Hash code Obj3 : " +ob3.hashCode());
        
        System.out.println();
        System.out.println(ob4);
        System.out.println("Hash code Obj4 : " +ob4.hashCode());
	}
	
}

// Output

/*	
    Ob1 and Ob2 are Equals --> True
	Ob1 and Ob3 are not Equal --> False
	
	Title: Kite runner, Author: Khalid Hussain, Edition: 3 Page Count: 500, Hard Cover: true
	Hash code Obj1 : -1288709077
	
	Title: Kite runner, Author: Khalid Hussain, Edition: 3 Page Count: 500, Hard Cover: false
	Hash code Obj2 : -1288709077
	
	Title: Kite runner, Author: Khalid Hussain, Edition: 2 Page Count: null, Hard Cover: false
	Hash code Obj3 : 841935855
	
	Title: Kite runner, Author: Khalid Hussain, Edition: 3 Page Count: 500, Hard Cover: true
	Hash code Obj4 : -1288709077
*/
