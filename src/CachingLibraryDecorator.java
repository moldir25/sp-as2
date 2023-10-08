public class CachingLibraryDecorator extends LibraryDecoratorBase {
    private Map<String, Object> cache = new HashMap<>();

    public CachingLibraryDecorator(LibraryService libraryService) {
        super(libraryService);
    }

    @Override
    public void StudentsINFO(List<Student> list) {
        String cacheKey = "StudentsINFO";
        if (cache.containsKey(cacheKey)) {
            System.out.println("Cache Hit: Returning students' information from cache.");
        } else {
            super.StudentsINFO(list);
            cache.put(cacheKey, list);
        }
    }

    @Override
    public void booksINFO(List<Book> list) {
        String cacheKey = "booksINFO";
        if (cache.containsKey(cacheKey)) {
            System.out.println("Cache Hit: Returning books' information from cache.");
        } else {
            super.booksINFO(list);
            cache.put(cacheKey, list);
        }
    }

    // Implement other caching logic for different methods
}
