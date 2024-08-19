
//Создайте двумерный массив. Выведите на консоль диагонали массива

package alexeystrunets;


public class Ht5_matrix_dop4 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int mainDiagonal, secondaryDiagonal;
        System.out.println("Диагональные элементы:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    mainDiagonal = matrix[i][j];
                    System.out.print(mainDiagonal + " ");
                }
                // Помаялся и увидел закономерность на пообочной диагонали:
                // для i и j меняются координаты зеркально(0, 1, 2 и 2, 1, 0) соответсвенно.
                else if (j == matrix.length - 1 - i) {
                    secondaryDiagonal = matrix[i][j];
                    System.out.print(secondaryDiagonal + " ");
                }
                else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}