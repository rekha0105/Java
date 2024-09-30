class Book {
    private String bookName;
 
    private String authorName;
    
    private String publisher;

  
    public Book(String bookName,  String authorName, String publisher) {
        this.bookName = bookName;
        
        this.authorName = authorName;
        this.publisher = publisher;
    }

    
    public String getBookName() { return bookName; }
    
    public String getAuthorName() { return authorName; }
    public String getPublisher() { return publisher; }
    
    public void setBookName(String bookName) { this.bookName = bookName; }
    
    public void setAuthorName(String authorName) { this.authorName = authorName; }
    public void setPublisher(String publisher) { this.publisher = publisher; }

    public String getBookInfo() {
        return String.format("Book Name: %s\nAuthor: %s\nPublisher: %s", 
                             bookName,authorName, publisher);
    }
}

public class BookApp {
    public static void main(String[] args) {
        Book book1 = new Book("life a book of learning", "apj", "ratan");


        System.out.println(book1.getBookInfo());

        book1.setAuthorName("apj");
        System.out.println("\nUpdated Book Info:");
        System.out.println(book1.getBookInfo());
    }
}
