package Vladislav.lesson9.Task2;

//Описание: Напишите метод, который делит два числа. Используйте конструкцию try-catch-finally, чтобы обработать возможные ошибки.
//Задание:
//Если делитель равен нулю, выбрасывайте ArithmeticException.
//В блоке finally выводите сообщение о завершении операции.
//В методе main протестируйте метод с различными значениями.

public class ArithmeticException extends Exception {
    public ArithmeticException(String message) {
        super(message);
    }
}
