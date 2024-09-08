package EugeneFrost.lesson11;

//Создание класса Library:
//Используйте ArrayList для хранения списка книг.
//Реализуйте следующие методы:
//addBook(Book book): добавление книги в библиотеку.
//removeBook(String isbn): удаление книги по ISBN.
//findBookByTitle(String title): поиск книги по названию.
//listAllBooks(): вывод всех книг в библиотеке.

//Дополнительные требования:
//Обработайте возможные исключения (например, при попытке удалить несуществующую книгу).
//Добавьте возможность поиска книг по автору (метод findBooksByAuthor(String author)).

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books;

    public Library() {
        this.books = new ArrayList<Book>();
    }

    public void addBook(Book book){
        this.books.add(book);
    }

    public boolean removeBook(String isbn) {
        Book bookToRemove = null;
        for (Book book : this.books) {
            if (book.getIsbn().equals(isbn)) {
                bookToRemove = book;
                break;
            }
        }

        if (bookToRemove == null) {
            return false;
        } else {
            this.books.remove(bookToRemove);
            return true;
        }
    }

    public Book findBookByTitle(String title) {
        for (Book book : this.books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    public boolean listAllBooks() {
        if (this.books.isEmpty()) {
            return false;
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
            return true;
        }
    }

    public Book findBooksByAuthor(String author){
        for(Book book : this.books){
            if (book.getAuthor().equals(author)){
                return book;
            }
        }
        return null;
    }
}
