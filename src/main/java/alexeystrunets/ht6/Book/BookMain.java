//1. Создание класса "Книга"
//Создайте класс Book, который будет иметь поля: title, author, price и publicationYear. Реализуйте конструктор,
//методы для получения информации о книге и переопределите метод toString() для удобного отображения информации о книге.

package alexeystrunets.ht6.Book;

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book("Гарри Поттер и Философский камень", "Джоан Роулинг", 9.99, 1997);
        System.out.println(book1);
        System.out.println("Название: " + book1.getTitle());
        System.out.println("Автор: " + book1.getAuthor());
        System.out.println("Цена: " + book1.getPrice());
        System.out.println("Год издания: " + book1.getPublicationYear());
    }
}
