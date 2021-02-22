package day5TopicsCollections.listTypeOfPrblms;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LibraryBook 
{
	Scanner scan = new Scanner(System.in);
	
	ArrayList<Book> bookList=new ArrayList<Book>();
	
	public void addBook()
	{
		Book b= new Book();
		
		System.out.println("Enter the BookName..");
		String book=scan.next();
		b.setBookName(book);
		System.out.println("Enter the BookId..");
		Integer id=scan.nextInt();
		b.setBookId(id);
		System.out.println("Enter the AuthouName..");
		String name=scan.next();
		b.setAuthor(name);
		System.out.println("Enter the NoOfCopies..");
		Integer copies=scan.nextInt();
		b.setNoOfCopies(copies);
		bookList.add(b);
	}
	
	public void searchBook() throws InputMismatchException
	{
		System.out.println("Enter the BookName");
		String book =scan.next();
		
		for(Book b : bookList)
		{
			if (b.getBookName().equalsIgnoreCase(book)) 
			{
				System.out.println(b);
			}
			else
			{
				throw new InputMismatchException("Invalid BookName");
			}
		}
		
	}
}
