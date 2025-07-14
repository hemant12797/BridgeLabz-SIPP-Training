import java.util.*;

class Book {
    private String title;
    private String author;
    
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Book)) return false;
        Book other = (Book) obj;
        return title.equalsIgnoreCase(other.title) && author.equalsIgnoreCase(other.author);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(title.toLowerCase(), author.toLowerCase());
    }
    
    @Override
    public String toString() {
        return "\"" + title + "\" by " + author;
    }
}

class BookShelf {
    private Map<String, LinkedList<Book>> genreCatalog;
    private Map<String, HashSet<Book>> genreBookSet;

    public BookShelf() {
        genreCatalog = new HashMap<>();
        genreBookSet = new HashMap<>();
    }

    public void addBook(String genre, Book book) {
        genreCatalog.putIfAbsent(genre, new LinkedList<>());
        genreBookSet.putIfAbsent(genre, new HashSet<>());

        if (!genreBookSet.get(genre).contains(book)) {
            genreCatalog.get(genre).add(book);
            genreBookSet.get(genre).add(book);
            System.out.println(book + " added to " + genre);
        } else {
            System.out.println(book + " already exists in " + genre);
        }
    }

    public void removeBook(String genre, Book book) {
        if (genreCatalog.containsKey(genre) && genreBookSet.get(genre).contains(book)) {
            genreCatalog.get(genre).remove(book);
            genreBookSet.get(genre).remove(book);
            System.out.println(book + " removed from " + genre);
        } else {
            System.out.println(book + " not found in " + genre);
        }
    }

    public void displayCatalog() {
        System.out.println("Library Catalog:");
        for (String genre : genreCatalog.keySet()) {
            System.out.println("Genre: " + genre);
            for (Book book : genreCatalog.get(genre)) {
                System.out.println("  - " + book);
            }
        }
    }
}

public class LibraryOrganizer {
    public static void main(String[] args) {
        BookShelf shelf = new BookShelf();
        
        Book b1 = new Book("The Hobbit", "J.R.R. Tolkien");
        Book b2 = new Book("The Fellowship of the Ring", "J.R.R. Tolkien");
        Book b3 = new Book("1984", "George Orwell");
        Book b4 = new Book("Animal Farm", "George Orwell");

        shelf.addBook("Fantasy", b1);
        shelf.addBook("Fantasy", b2);
        shelf.addBook("Dystopian", b3);
        shelf.addBook("Dystopian", b4);

        shelf.addBook("Fantasy", b1);

        shelf.displayCatalog();
        shelf.removeBook("Fantasy", b2);
        shelf.displayCatalog();
    }
}
