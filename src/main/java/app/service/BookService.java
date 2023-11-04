package app.service;

import app.persistence.Book;
import app.repository.BookRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BookService {
    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> list() {
        return bookRepository.findAll();
    }

    public void createTwo(){
        final Book book1 = new Book();
        final Book book2 = new Book();
        book1.setName("book1");
        book2.setName("book2");

        bookRepository.save(book1);
        bookRepository.save(book2);
    }
}
