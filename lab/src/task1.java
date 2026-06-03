import java.util.TreeSet;
public class task1 {
        private TreeSet<String> books= new TreeSet<>();


        public void LibraryManager() {
            books = new TreeSet<>();
        }

        // Add a book
        public void addBook(String title) {
            books.add(title);
        }

        // Remove a book
        public void removeBook(String title) {
            if (books.remove(title)) {
                System.out.println(title + " removed successfully.");
            } else {
                System.out.println(title + " not found.");
            }
        }

        // Check availability
        public boolean isBookAvailable(String title) {
            return books.contains(title);
        }

        // Display all books
        public void displayAllBooks() {
            System.out.println("Library Books:");
            for (String book : books) {
                System.out.println(book);
            }
        }

        // Display books starting with a specific letter
        public void displayBooksStartingWith(char letter) {
            System.out.println("Books starting with '" + letter + "':");

            for (String book : books) {
                if (book.startsWith(String.valueOf(letter))) {
                    System.out.println(book);
                }
            }
        }
    }
