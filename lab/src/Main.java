public class Main {
    public static void main(String[] args) {
        System.out.println("program started");

        task1 library = new task1();

        library.addBook("Java Programming");
        library.addBook("Data Structures");
        library.addBook("Operating Systems");
        library.addBook("Algorithms");
        library.addBook("Java Programming"); // Duplicate

        library.displayAllBooks();

        System.out.println("\nAvailable: " +
                library.isBookAvailable("Algorithms"));

        library.removeBook("Operating Systems");

        System.out.println();
        library.displayAllBooks();

        System.out.println();
        library.displayBooksStartingWith('J');
    }
}