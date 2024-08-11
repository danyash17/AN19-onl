package Alex_P.lesson3;
//первые 10 чисел ряда Фибоначи
public class Homework7 {
    public static void main(String[] args) {
        int firstNumber = 0;
        int secondNumber = 1;
        int i;
        int startNumber = 10;
        System.out.println(0);
        System.out.println(1);
        for (i = 2; i < startNumber; i++){
            int Sum = firstNumber + secondNumber;
            System.out.println(Sum);
            firstNumber = secondNumber;
            secondNumber = Sum;
        }
    }
}
