package day5TopicsCollections.listTypeOfPrblms;

public class Book 
{
	String bookName;
	Integer bookId;
	String author;
	Integer noOfCopies;
	public Book(String bookName, Integer bookId, String author, Integer noOfCopies) {
		super();
		this.bookName = bookName;
		this.bookId = bookId;
		this.author = author;
		this.noOfCopies = noOfCopies;
	}
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Integer getNoOfCopies() {
		return noOfCopies;
	}
	public void setNoOfCopies(Integer noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", bookId=" + bookId + ", author=" + author + ", noOfCopies=" + noOfCopies
				+ "]";
	}
	
}
