package artem.homework.hw5;

    /*Напиши программу, которая принимает на вход
    матрицу поля боя типа char, на которой расположены корабли твоего оппонента.
    Вода обозначается символом ~, часть корабля символом о, подбитая часть корабля символом х.
    Пользователь последовательно вводит координаты цели, а программа отвечает "Мимо", "Ранил", "Убил",
    или "Неверные координаты".*/

import java.util.Scanner;

public class Task3 {
    static final int Field_Length = 10;
    static Scanner scanner = new Scanner(System.in);
    static char[][] playerBattleField = new char[Field_Length][Field_Length];

    public static void main(String[] args) {

        fillPlayerBattleField();

        while (true) {
            System.out.println("Введите координату Х ");
            int col = scanner.nextInt();
            System.out.println("Введите координату Y");
            int row = scanner.nextInt();

            if (row < 0 || col < 0 || row >= Field_Length || col >= Field_Length) {
                System.out.println("неверные координаты");
                continue;
            }

            if (playerBattleField[row][col] == 0) {
                System.out.println("Мимо");
            } else if (playerBattleField[row][col] == 'o') {
                playerBattleField[row][col] = 'X';
                if (checkIfShipKilled(row, col)) {
                    System.out.println("Убит");
                } else {
                    System.out.println("Ранил");
                }
            }

            printField(playerBattleField);
        }

    }

    private static boolean checkIfShipKilled(int row, int col) {
        return !(
                (row > 0 && playerBattleField[row - 1][col] == 'o') ||
                        (row < playerBattleField.length - 1 && playerBattleField[row + 1][col] == 'o') ||
                        (col > 0 && playerBattleField[row][col - 1] == 'o') ||
                        (col < playerBattleField[row].length - 1 && playerBattleField[row][col + 1] == 'o')

        );
    }

    private static void fillPlayerBattleField() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 5 - i; j > 0; j--) {
                System.out.println("Расставляем " + i + "-палубный корабль. Осталось: " + j);

                System.out.println("Введите координату x: ");
                int x = scanner.nextInt();

                System.out.println("Введите координату y: ");
                int y = scanner.nextInt();

                System.out.println("1 - по горизонтали; 2 - по вертикали ?");
                int position = scanner.nextInt();

                if (position == 1) {
                    for (int q = 0; q < i; q++) {
                        playerBattleField[y][x + q] = 'o';
                    }
                } else {
                    for (int m = 0; m < i; m++) {
                        playerBattleField[y + m][x] = 'o';
                    }
                }
                printField(playerBattleField);
            }
        }
    }

    static void printField(char[][] field) {
        for (char[] cells : field) {
            for (char cell : cells) {
                if (cell == 0) {
                    System.out.print("~|");
                } else {
                    System.out.print(cell + "|");
                }
            }
            System.out.println("");
        }
    }

}



