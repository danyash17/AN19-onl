package Alex_P.lesson12;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Book bookOne = new Book("Алфавит", "Союзпечать", 2011);
        Book bookTwo = new Book("Геометрия", "Союзпечать", 2001);
        Book bookTree = new Book("Алгебра", "Союзпечать", 2010);

        Library library = new Library();
        library.addBook(bookOne);
        library.addBook(bookTwo);
        library.addBook(bookTree);


        for(;;) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\nВы можете выполнить следеющие действия:" +
                    "\nВведите 1 чтобы добавить книгу" +
                    "\nВведите 2 чтобы удалить книгу" +
                    "\nВведите 3 чтобы найти книгу" +
                    "\nВведите 4 чтобы вывести список всех книг в библиоете" +
                    "\nВведите 5 чтобы закончить работу");
            int inputInt = scanner.nextInt();
            switch (inputInt) {
                case 1:
                    System.out.println("Введите название книги");
                    String title = scanner.next();
                    System.out.println("Введите автора книги");
                    String author = scanner.next();
                    System.out.println("Введите год выпуска книги");
                    int year = scanner.nextInt();
                    Book book = new Book(title, author, year);
                    library.addBook(book);
                    System.out.println("Ваша книга добавлена в библиотеку");
                    break;
                case 2:
                    System.out.println("Введите isbn книги");
                    library.removeBook(scanner.next());
                    System.out.println("Книга удалена из библиотеки");
                    break;
                case 3:
                    System.out.println("Введите название книги");
                    System.out.println("Вы искали эту книгу " + library.findBookByTitle(scanner.next()));
                case 4:
                    System.out.println("Список всех книг: " + library.listAllBooks());
                    break;
                case 5:
                    System.exit(0);
            }
        }

    }
}
