package EugeneFrost.lesson3;

//**task**
//Напишите программу, которая выводит на консоль таблицу
//умножения.

public class extra_task_3 {
    public static void main(String[] args) {
        int rows = 10;
        int cols = 10;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                int result=i*j;
                System.out.println(i + " * " + j + " = " + result);
            }
            System.out.println("=============");
        }
    }
}
