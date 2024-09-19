package NikitaVecherski.lesson12;

public class NoSuchBookException extends RuntimeException{
        public NoSuchBookException(){
                System.out.println("Данной книги нет в библиотеке");
        }
}
