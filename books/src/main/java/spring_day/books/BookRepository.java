package spring_day.books;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Repository
public class BookRepository {
    private final List<Book> books=new ArrayList<>();
    public  List<Book> getBooks() {
        return books;
    }
     public void addBook(Book book) {
         books.add(book);
     }

}
