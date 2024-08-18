package EugeneFrost.lesson5;

import java.util.Scanner;

public class MorskoiBoi {
    public static void main(String[] args) {

        final char water = '~';
        final char ship = 'o';
        final char wastedShip = 'x';

        char[][] field = {
                {'~', '~', '~', '~', '~'},
                {'~', 'o', 'o', 'o', '~'},
                {'~', '~', '~', '~', '~'},
                {'~', 'o', '~', '~', '~'},
                {'~', 'o', '~', '~', '~'}
        };

        int rows = field.length;
        int cols = field[0].length;
        System.out.println("Размер поля боя: " + rows + " x " + cols);

        Scanner sc = new Scanner(System.in);

        while (!isGameOver(field, ship)) {
            System.out.print("Введите координаты по вертикали: ");
            int x = sc.nextInt();
            System.out.print("Введите координаты по горизонтали: ");
            int y = sc.nextInt();

            if (x >= 0 && x < rows && y >= 0 && y < cols) {
                if (field[x][y] == water) {
                    System.out.println("Мимо!");
                } else if (field[x][y] == ship) {
                    if (searchShip(field, x, y, water, wastedShip, ship)) {
                        System.out.println("Ранил!");
                    } else {
                        System.out.println("Убил!");
                    }
                    field[x][y] = wastedShip; // Отмечаем уничтоженную часть корабля
                }
            } else {
                System.out.println("Неверно введены координаты!");
            }
        }
    }

    public static boolean searchShip(char[][] field, int x, int y, char water, char wastedShip, char ship) {
        if (x < 0 || x >= field.length || y < 0 || y >= field[0].length) {
            return false;
        }

        if (field[x][y] != water && field[x][y] != wastedShip) {
            if (x > 0 && field[x - 1][y] == ship) {
                return true;
            }
            if (x < field.length - 1 && field[x + 1][y] == ship) {
                return true;
            }
            if (y > 0 && field[x][y - 1] == ship) {
                return true;
            }
            if (y < field[0].length - 1 && field[x][y + 1] == ship) {
                return true;
            }
        }
        System.out.println("Game Over!");
        return false;
    }

    public static boolean isGameOver(char[][] field, char ship) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                if (field[i][j] == ship) {
                    return false;
                }
            }
        }
        return true;
    }
}
