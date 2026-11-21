package spring_day.books;

import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class BookRepository {
    private final Map<Integer,Book> books=new LinkedHashMap<>();
    public  List<Book> getBooks() {
        return new ArrayList<>(books.values());
    }
     public Book addBook(Book book) {
         books.put(book.getId(), book);
         return book;
     }

     public Book getById(int id) {
        return books.get(id);
     }

}
