package spring_day.books;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Objects;

@Service
public class BookService {
    private final BookRepository bookRepository;
    private int nextId=1;
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List <BookResponse> getAll(String author) {
        return bookRepository.getBooks().stream().filter(book->author == null || Objects.equals(book.getAuthor(), author))
                .map(book-> new BookResponse(book.getId(), book.getTitle(), book.getAuthor())).toList();

    }
    public BookResponse getBookById(int id) {
        return  toResponse(bookRepository.getById(id));
    }
    public BookResponse addBook(CreateBook book) {
        Book book1= new Book(nextId++,book.getTitle(),book.getAuthor());
        bookRepository.addBook(book1);
        return toResponse(book1);
    }
    public  BookResponse toResponse(Book book) {
        return new BookResponse(book.getId(), book.getTitle(), book.getAuthor());
    }

}
