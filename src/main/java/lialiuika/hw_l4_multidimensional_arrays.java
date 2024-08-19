package lialiuika;

public class hw_l4_multidimensional_arrays {
    public static void main(String[] args) {


//        Шахматная доска
//        Создать программу для раскраски шахматной доски с помощью цикла.
//                Создать двумерный массив String'ов 8х8. С помощью циклов задать элементам
//        циклам значения B(Black) или W(White)

////        создание масива
        String [][] chessBoard = new String[8][8];
//        проходка по строкам
        for (int i = 0; i < chessBoard.length; i++) {
//            проходка по колонкам
            for (int j = 0; j < chessBoard[0].length; j++) {
//                присваивание значений
                if ((i + j) % 2 == 0) chessBoard[i][j] = "B" ;
                else chessBoard[i][j] = "W";
            }
        }
//вывод
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[0].length; j++) {
                System.out.print(" " + chessBoard[i][j] + " ");
            }
            System.out.println();
        }

    }
}
