package spring_day.books;

public class CreateBook {
    private final String title;
    private final String author;
    public CreateBook(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
}
