package app.controller;

import app.persistence.Book;
import app.service.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {
    BookService bookService;

    public HelloController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/")
    public String index() {
        bookService.createTwo();
        final List<Book> list = bookService.list();
        return "Greetings from Spring Boot!";
    }

}
