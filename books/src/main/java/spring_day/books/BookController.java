package spring_day.books;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {
    private final BookService bookService;
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }
@GetMapping
public List<BookResponse> getBooks( String author) {
        return bookService.getAll(author);
}
    @PostMapping
    public BookResponse addBook(@RequestBody CreateBook book) {
        return bookService.addBook(book);
    }
}
