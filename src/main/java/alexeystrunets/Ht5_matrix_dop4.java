package alexeystrunets;

public class Ht5_matrix_dop4 {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] diagonalArray = new int[array.length][array.length];
        for (int i = 0; i < array.length; i++) {
            diagonalArray[i][i] = array[i][i];
        }

        System.out.println("Массив с диагональными элементами:");
        for (int[] row : diagonalArray) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}