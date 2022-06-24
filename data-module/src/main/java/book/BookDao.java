package book;

import java.util.ArrayList;
import java.util.List;

public class BookDao {

    public static List<Book> getBooks(){
        List<Book> books = new ArrayList<>();
        books.add(new Book(1,"Book 1", "Author 1", 250));
        books.add(new Book(2,"Book 2", "Author 2", 150));
        books.add(new Book(3,"Book 3", "Author 3",500));
        return books;
    }
}
