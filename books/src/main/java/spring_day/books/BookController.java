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
    @GetMapping("/{id}")
    public BookResponse getBooksById(@PathVariable int id) {
        return  bookService.getBookById(id);
    }
@GetMapping
public List<BookResponse> getBooks(@RequestParam(required = false) String author) {
        return bookService.getAll(author);
}
    @PostMapping
    public BookResponse addBook(@RequestBody CreateBook book) {
        return bookService.addBook(book);
    }
}
