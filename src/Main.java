import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        List<Student> studentList = new ArrayList<>();
        
        Library library = new Library(); // Create the base Library instance

        library = new LoggingLibraryDecorator(library); // Add the decorator here
        library = new AuthorizationLibraryDecorator(library, true); // Add the decorator here
        library = new CachingLibraryDecorator(library); // Add the decorator here

        library.LibraryInfo();

        while (true) {
            System.err.println("Enter key number");
            int n = new Scanner(System.in).nextInt();
            switch (n) {
                case 1 -> library.addNewStudent(studentList);
                case 2 -> library.addNewBook(bookList);
                case 3 -> library.StudentsINFO(studentList);
                case 4 -> library.booksINFO(bookList);
                case 5 -> library.giveBook(studentList, bookList);
                case 6 -> library.returnBook(studentList, bookList);
                case 7 -> library.close(studentList, bookList);
                default -> System.out.println("Incorrect number");
            }
        }
    }
}
