import java.util.ArrayList;
import java.util.List;

public class Patron {
    private String name;
    private String id;
    private List<Book> borrowedBooks;

    public Patron(String name, String id) {
        this.name = name;
        this.id = id;
        this.borrowedBooks = new ArrayList<>();
    }

    public void borrowBook(Library library, String isbn) {
        if (library.lendBook(isbn)) {
            Book book = library.searchBook(isbn);
            borrowedBooks.add(book);
            System.out.println(name + " borrowed " + book.getTitle());
        } else {
            System.out.println("Book not available.");
        }
    }

    public void returnBook(Library library, String isbn) {
        Book book = borrowedBooks.stream()
                .filter(b -> b.getIsbn().equals(isbn))
                .findFirst()
                .orElse(null);

        if (book != null) {
            borrowedBooks.remove(book);
            library.returnBook(isbn);
            System.out.println(name + " returned " + book.getTitle());
        } else {
            System.out.println("Book not found in borrowed books.");
        }
    }

    public void viewBorrowedBooks() {
        System.out.println("Borrowed Books:");
        for (Book book : borrowedBooks) {
            System.out.println(book);
        }
    }
}