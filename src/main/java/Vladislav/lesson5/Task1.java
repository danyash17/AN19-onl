package Vladislav.lesson5;

//1. Шахматная доска
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

public class Task1 {
    public static void main(String[] args) {
        String[][] chess = new String[8][8];
        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess.length; j++) {
                if ((i + j) % 2 == 0) chess[i][j] = "W";
                else chess[i][j] = "B";
                System.out.print(" " + chess[i][j]);
            }
            System.out.println();
        }
    }
}
