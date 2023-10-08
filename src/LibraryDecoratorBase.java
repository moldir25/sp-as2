public abstract class LibraryDecoratorBase implements LibraryDecorator {
    protected final LibraryService libraryService;

    public LibraryDecoratorBase(LibraryService libraryService) {
        this.libraryService = libraryService;
    }

    @Override
    public void LibraryInfo() {
        libraryService.LibraryInfo();
    }

    @Override
    public void StudentsINFO(List<Student> list) {
        libraryService.StudentsINFO(list);
    }

    @Override
    public void booksINFO(List<Book> list) {
        libraryService.booksINFO(list);
    }

    @Override
    public void addNewStudent(List<Student> StudentList) {
        libraryService.addNewStudent(StudentList);
    }

    @Override
    public void addNewBook(List<Book> bookList) {
        libraryService.addNewBook(bookList);
    }

    @Override
    public void giveBook(List<Student> Students, List<Book> books) {
        libraryService.giveBook(Students, books);
    }

    @Override
    public void returnBook(List<Student> Students, List<Book> books) {
        libraryService.returnBook(Students, books);
    }

    @Override
    public void close(List<Student> studentList, List<Book> bookList) {
        libraryService.close(studentList, bookList);
    }
}