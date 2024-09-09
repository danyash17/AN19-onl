package ivan_m.Exceptions.Library;

public class Library {

    String searchBook(Book book, Book book1, Book book2, Book book3) {
        if (!book.equals(book1) && !book.equals(book2) && !book.equals(book3)) {
            throw new BookNotFoundException("Book not found!");
        }
        return "Take your book";

    }

}
