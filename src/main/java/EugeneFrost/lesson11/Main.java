package EugeneFrost.lesson11;

//Создание класса Main:
//Реализуйте меню, позволяющее пользователю выполнять следующие действия:
//Добавить книгу
//Удалить книгу
//Найти книгу по названию
//Вывести список всех книг
//Завершить программу

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Library library = new Library();

        while (true) {
            System.out.print("Выберите действие которое необходимо выполнить: "+"\n"+
                    "1 - Добавить книгу"+"\n"+
                    "2 - Удалить книгу"+"\n"+
                    "3 - Найти книгу по названию"+"\n"+
                    "4 - Найти книгу по автору"+"\n"+
                    "5 - Вывести список всех книг"+"\n"+
                    "6 - Завершить программу"+"\n");
            int choiceID = sc.nextInt();
            sc.nextLine();

            switch (choiceID) {
                case 1: {
                    System.out.println("Введите название книги: ");
                    String titleBook = sc.nextLine();

                    System.out.println("Введиет автора книги: ");
                    String authorBook = sc.nextLine();

                    System.out.println("Введите isbn книги: ");
                    String isbnBook = sc.nextLine();

                    System.out.println("Введите год книги: ");
                    int yearBook = sc.nextInt();

                    Book bookToAdd =new Book(titleBook, authorBook, isbnBook, yearBook);
                    library.addBook(bookToAdd);
                    break;
                }
                case 2: {
                    System.out.println("Введите ISBN книги, которую необходимо удалить: ");
                    String removeWithIsbn = sc.nextLine();
                    if (library.removeBook(removeWithIsbn)) {
                        System.out.println("Книга удалена.");
                    } else {
                        throw new NoneBookException();
                    }
                    break;
                }
                case 3: {
                    System.out.println("Введите название книги, которую необходимо найти: ");
                    String searchIsbn = sc.nextLine();
                    System.out.println(library.findBookByTitle(searchIsbn));
                    break;
                }case 4: {
                    System.out.println("Введите автора книги, которую необходимо найти: ");
                    String searchAuthor = sc.nextLine();
                    System.out.println(library.findBooksByAuthor(searchAuthor));
                    break;
                }
                case 5: {
                    System.out.println("Список всех книг: ");
                    if(!library.listAllBooks()){
                        System.out.println("Библиотека пуста.");
                    }
                    break;
                }
                case 6: {
                    return;
                }
                default: {
                    System.out.println("Неверная команда!");
                    break;
                }
            }
        }
    }
}
