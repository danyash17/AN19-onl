package ivan_m.Collections.Library;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Library {
    List<Book> books = new ArrayList<Book>();


    public void addBook(Book book){
        books.add(book);
    }

    public void removeBookByISBN(String ISBN){
        if (ISBN == null){
            throw new IllegalArgumentException("ISBN is null");
        }

        for(Book book: books){
            if (book.getIsbn().equals(ISBN)){
                books.remove(book);
                return;
            }
        }
        throw new BookNotFoundException("Book with ISBN " + ISBN + " was not found");
    }

    public Book findBookByTitle(String title){
        for(Book book: books){
            if (book.getTitle().equals(title)){
                return book;
            }
        }
        throw new BookNotFoundException("Book with title " + title + " was not found");
    }

    public String listAllBooks(){
        return books.toString();
    }
}
