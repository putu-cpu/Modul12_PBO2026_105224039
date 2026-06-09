package service;
import model.Book;

public class BookService {
    public Book findBookByTitle(String title) {
       
        return new Book(title);
    }
}
