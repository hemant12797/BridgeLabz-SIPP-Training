
public class Book {

    static String libraryName = "City Library";
    final String isbn;
    String title, author;

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    void displayDetails() {
        if (this instanceof Book) {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        }
    }

    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "James", "ISBN001");
        Book b2 = new Book("Python Guide", "Guido", "ISBN002");

        b1.displayDetails();
        System.out.println();
        b2.displayDetails();

        Book.displayLibraryName();
    }
}
