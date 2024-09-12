package NikitaVecherski.lesson12;

//Создайте программу для управления библиотекой, используя коллекции Java. Ваша программа должна включать следующие функции:
//Создание класса Book:
//Поля: title, author, isbn, year.
//Конструктор и геттеры/сеттеры для всех полей.
//Переопределите метод toString() для удобного отображения информации о книге.
//Переопределите методы equals(), hashCode()
//Создание класса Library:
//Используйте ArrayList для хранения списка книг.
//Реализуйте следующие методы:
//addBook(Book book): добавление книги в библиотеку.
//removeBook(String isbn): удаление книги по ISBN.
//findBookByTitle(String title): поиск книги по названию.
//listAllBooks(): вывод всех книг в библиотеке.
//Создание класса Main:
//Реализуйте меню, позволяющее пользователю выполнять следующие действия:
//Добавить книгу
//Удалить книгу
//Найти книгу по названию
//Вывести список всех книг
//Завершить программу
//Дополнительные требования:
//Обработайте возможные исключения (например, при попытке удалить несуществующую книгу).
//Добавьте возможность поиска книг по автору (метод findBooksByAuthor(String author)).


import java.util.Scanner;

public class Simulator {
    public static void main(String[] args) {

        Library library = new Library();
        library.addBook("Исскуство вранья", "Троцкий Л.Д", 1917);
        library.addBook("Метро 2033", "Глуховский Д.А", 2005);
        library.addBook("Горизонт событий", "Недоруб С.И", 2011);
        library.addBook("Лунь", "Клочков С.А", 2010);

        Scanner menu = new Scanner(System.in);
        Scanner forTitle = new Scanner(System.in);
        Scanner forAuthor =new Scanner(System.in);
        Scanner forYear = new Scanner(System.in);

        boolean workInProgress = true;
        while (workInProgress == true) {
            System.out.println("Выберите действие из предложенных: \n 1)Добавить книгу \n 2)Удалить книгу \n 3)Найти книгу по названию" +
                    "\n 4)Вывести список всех книг \n 5)Найти книгу по автору" + "\n 6)Выйти");
            String initial = menu.next();
                char check = initial.charAt(0);
                if (!Character.isDigit(check)) {
                    System.out.println("Неверный формат ввода, попробуйте еще раз\n");
                } else {
                    Integer workingInIt = Integer.parseInt(initial);
                    if ((workingInIt < 1) || (workingInIt > 5)) {
                        System.out.println("Данное действие недоступно, или отсутсвует в списке предложенных");
                        workInProgress = false;
                    } else {
                        switch (workingInIt) {
                            case 1:
                                System.out.println("Введите название книги: ");
                                String title = forTitle.nextLine();
                                System.out.println("Введите автора: ");
                                String author = forAuthor.nextLine();
                                System.out.println("Введите год издания: ");
                                String yearCheck = forYear.nextLine();
                                for (int i = 0; i < yearCheck.length(); i++) {
                                    char a = yearCheck.charAt(i);
                                    if (!Character.isDigit(a)) {
                                        System.out.println("Неверный формат ввода года");
                                        break;
                                    }
                                }
                                Integer year = Integer.parseInt(yearCheck);
                                library.addBook(title, author, year);
                                break;
                            case 2:
                                System.out.println("Введите код ISBN: ");
                                String isbn = menu.next();
                                library.removeBook(isbn);
                                break;
                            case 3:
                                System.out.println("Введите название книги: ");
                                String title1 = menu.next();
                                library.findBookByTitle(title1);
                                break;
                            case 4:
                                library.listAllBooks();
                                break;
                            case 5:
                                System.out.println("Введите полное имя автора в формате Фамилия И.О");
                                String authorScan = forAuthor.nextLine();
                                library.findBookByAuthor(authorScan);
                                break;
                            case 6:
                                workInProgress = false;
                                break;
                        }


                    }
                }
            }
        }
    }
