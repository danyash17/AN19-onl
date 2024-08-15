/*Шахматная доска
Создать программу для раскраски шахматной доски с помощью цикла.
Создать двумерный массив String'ов 8х8. С помощью циклов задать элементам
циклам значения B(Black) или W(White). Результат работы программы:
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W*/
package ivan_multidimArraysHomework;

import java.util.Arrays;

public class Arrays1 {
    public static void main(String[] args) {
        String[][] array = new String[8][8];

        for (int i = 0; i < 8; i++)
        {
            for (int j = 0; j < 8; j++)
            {
                if (i % 2 == 0)
                {
                    if (j % 2 == 0)
                    {
                        array[i][j] = "W";
                    }
                    else
                    {
                        array[i][j] = "B";
                    }
                }
                else
                {
                    if (j % 2 == 0)
                    {
                        array[i][j] = "B";
                    }
                    else
                    {
                        array[i][j] = "W";
                    }
                }
            }
        }

        for (int i = 0; i < 8; i++)
        {
            for (int j = 0; j < 8; j++)
            {
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
