public class App {
    public static void main(String[] args) {
        Library library = new Library("Balme  Library");
        Patron patron = new Patron("Attah-nimoh", "A22041547");

        // Adding books to the library
        library.addBook(new Book("Book 1", "Author 1", "ISBN11001"));
        library.addBook(new Book("Book 2", "Author 2", "ISBN11002"));
        library.addBook(new Book("Book 3", "Author 3", "ISBN11003"));

        // Display available books
        System.out.println("Books in the Library:");
        library.displayBooks();

        // Patron borrows a book
        patron.borrowBook(library, "ISBN11001");
        patron.viewBorrowedBooks();

        // Patron tries to borrow the same book again
        patron.borrowBook(library, "ISBN11001");

        // Patron returns the book
        patron.returnBook(library, "ISBNd11001");

        // Display available books after operations
        System.out.println("Books in the Library after transactions:");
        library.displayBooks();
    }
}