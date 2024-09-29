public class Book {
    String bookName;
    String isbn;
    String author;
    String publisher;

    public Book(String bookName, String isbn, String author, String publisher) {
        this.bookName = bookName;
        this.isbn = isbn;
        this.author = author;
        this.publisher = publisher;
    }
    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getBookInfo() {
        return bookName + ", " + isbn + ", " + author + ", " + publisher;
    }

    public static void main(String[] args) {
        Book book = new Book("Java Programming", "123456789", "John Doe", "Tech Books");
        System.out.println(book.getBookInfo());
        book.setBookName("Advanced Java Programming");
        book.setIsbn("987654321");
        book.setAuthor("Jane Smith");
        book.setPublisher("Expert Books");
        System.out.println("Updated Book Info: " + book.getBookName() + ", " + book.getIsbn() + ", " + book.getAuthor() + ", " + book.getPublisher());
    }
}