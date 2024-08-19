package EugeneFrost.lesson5;

//**task**
//Шахматная доска
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

import java.util.Arrays;

public class DynamicArray_1 {
    public static void main(String[] args) {
        String[][] array = new String[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0) {
                    array[i][j] = "W";
                } else {
                    array[i][j] = "B";
                }
                System.out.print(array[i][j]+' ');
            }
            System.out.println();
        }
        //System.out.print(Arrays.deepToString(array));
    }
}
