package artem.homework.hw5;

    /*Шахматная доска
    Создать программу для раскраски шахматной доски с помощью цикла.
    Создать двумерный массив String'ов 8х8. С помощью циклов задать элементам
    циклам значения B(Black) или W(White). Результат работы программы:*/

public class task1 {
    public static void main(String[] args) {
        String [][] chessBoard = new String[8][8];
        for (int i = 0; i< chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[0].length; j++) {
                if ((i + j) % 2 == 0) chessBoard[i][j] = "W";
                else chessBoard[i][j] = "B";
                System.out.print(" " + chessBoard[i][j] + " ");
            }
            System.out.println();

        }
    }
}
