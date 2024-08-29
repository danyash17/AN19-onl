package artem.homework.hw5;


    /*Создайте двумерный массив целых чисел. Выведите на консоль сумму всех
    элементов массива.*/

public class Task2 {
    public static void main(String[] args) {
        int[][] matrixMain = {{1, 2}, {3, 4}};
        int matrixSum = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrixSum = matrixSum + matrixMain[i][j];
            }
        }
        System.out.println(matrixSum);

    }
}
