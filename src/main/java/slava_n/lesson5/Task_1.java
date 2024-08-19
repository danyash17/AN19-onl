package slava_n.lesson5;

public class Task_1 {
    public static void main(String[] args) {

        //Создать программу для раскраски шахматной доски с помощью цикла.
        //Создать двумерный массив String'ов 8х8. С помощью циклов задать элементам
        //циклам значения B(Black) или W(White). Результат работы программы:
        //W B W B W B W B
        //B W B W B W B W
        //W B W B W B W B
        //B W B W B W B W
        //W B W B W B W B
        //B W B W B W B W
        //W B W B W B W B
        //B W B W B W B W

        String[][] matrixChess = new String[8][8];
        for (int i = 0; i < matrixChess.length; i++) {
            for (int j = 0; j < matrixChess[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    matrixChess[i][j] = "W ";
                } else {
                    matrixChess[i][j] = "B ";
                }
                System.out.print(matrixChess[i][j]);
            }
            System.out.println();

        }

    }

}