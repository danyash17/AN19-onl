package Alex_P.lesson3;
//первые 10 чисел ряда Фибоначи
public class Homework7 {
    public static void main(String[] args) {
        int firstNumber = 0;
        int secondNumber = 1;
        int startNumber = 11;
        int sumFib = 0;
        for (int i = 0; i < startNumber; i++){
            if (i == 0){
                System.out.println(i);
            }
            else if (i == 1){
                System.out.println(i);
            }
            else {
                sumFib = firstNumber + secondNumber;
                System.out.println(sumFib);
                firstNumber = secondNumber;
                secondNumber = sumFib;
            }
        }
    }
}
