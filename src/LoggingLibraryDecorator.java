public class LoggingLibraryDecorator extends LibraryDecoratorBase {
    public LoggingLibraryDecorator(LibraryService libraryService) {
        super(libraryService);
    }

    @Override
    public void addNewStudent(List<Student> StudentList) {
        System.out.println("Logging: Adding a new student");
        super.addNewStudent(StudentList);
    }

    @Override
    public void giveBook(List<Student> Students, List<Book> books) {
        System.out.println("Logging: Giving a book to a student");
        super.giveBook(Students, books);
    }

    // Implement other methods with logging as needed
}
