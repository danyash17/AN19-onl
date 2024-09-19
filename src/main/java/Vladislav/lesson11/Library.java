package Vladislav.lesson11;

//Создание класса Library:
//
//Используйте ArrayList для хранения списка книг.
//Реализуйте следующие методы:
//addBook(Book book): добавление книги в библиотеку.
//removeBook(String isbn): удаление книги по ISBN.
//findBookByTitle(String title): поиск книги по названию.
//listAllBooks(): вывод всех книг в библиотеке.

//Дополнительные требования:
//
//        Обработайте возможные исключения (например, при попытке удалить несуществующую книгу).
//        Добавьте возможность поиска книг по автору (метод findBooksByAuthor(String author)).


import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    public Library(){
      this.books = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void removeBook (String isbn){
        books.removeIf(book -> book.getIsbn().equals(isbn));
    }

    public Book findBookByTitle(String title) {
        for (Book book : books) {
         if (book.getTitle().equals(title)) {
             return book;
         }
        }
        return null;
    }

    public List<Book> listAllBooks() {
            return books;
    }

    public List<Book> findBooksByAuthor(String author) {
        List<Book> newList = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)){
                newList.add(book);
            }
        }
        return newList;
    }
}


