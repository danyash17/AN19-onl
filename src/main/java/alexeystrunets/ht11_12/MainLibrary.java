package alexeystrunets.ht11_12;

public class MainLibrary {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book("Смысл жизни", "Alex", "asddfgdfhgfhfghfhfgh", 2019));
        library.addBook(new Book("1984", "George Orwell", "asbdfhasgfhagf", 1949));
        library.addBook(new Book("Brave New World", "Aldous Huxley", "dsafghsdgfshdfg", 1932));

        System.out.println(library.listAllBooks());

        System.out.println("\nПоиск книги '1984':");
        Book foundBook = library.findBookByTitle("1984");
        if (foundBook != null) {
            System.out.println("Книга найдена: " + foundBook);
        } else {
            System.out.println("Книга с названием '1984' не найдена.");
        }

        try {
            System.out.println("\nУдаление книги с ISBN '123456789':");
            library.removeBook("123456789");
            System.out.println("Книга с ISBN '123456789' удалена.");
        } catch (BookNotFoundException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nСписок всех книг в библиотеке после удаления:");
        System.out.println(library.listAllBooks());

        System.out.println("Подождите, идет поиск книги...");
        System.out.println(library.findBooksByAuthor("Alex"));
        System.out.println(library.findBooksByAuthor(""));
    }
}