package NikitaVecherski.lesson12;

//Создание класса Library:
//Используйте ArrayList для хранения списка книг.
//Реализуйте следующие методы:
//addBook(Book book): добавление книги в библиотеку.
//removeBook(String isbn): удаление книги по ISBN.
//findBookByTitle(String title): поиск книги по названию.
//listAllBooks(): вывод всех книг в библиотеке.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class Library {

    private ArrayList<Book> arrayList = new ArrayList();

    public void addBook(String title, String author, Integer year) {
        this.arrayList.add(new Book(title, author, year));
    }

    public void removeBook(String isbn) {
        boolean checker = false;
        for (Book book : arrayList) {
            if (book.getIsbn().equals(isbn)) {
                arrayList.remove(book);
                checker = true;
                return;
            }

        }
        if (checker == false) {
            throw new NoSuchBookException();
        }
    }

    public Book findBookByTitle(String title) {
        boolean checker = false;
        Book thatOne = null;
        for (Book book : this.arrayList) {
            if (book.getTitle().equals(title)) {
                checker = true;
                return book;
            }

        }
        if (checker == false) {
            throw new NoSuchBookException();

        }
        return null;
    }


    public String listAllBooks() {
        String a = Arrays.deepToString(Stream.of(arrayList).toArray());
        return a;
    }

    public void addBooks(Book... books) {
        arrayList.addAll(List.of(books));
    }

    public Book findBookByAuthor(String author) {
        boolean checker = false;
        for (Book book : this.arrayList) {
            if (book.getAuthor().equals(author)) {
                checker = true;
                return book;
            }

        }
        if (checker == false) {
            throw new NoSuchBookException();
        }
        return null;
    }

}

