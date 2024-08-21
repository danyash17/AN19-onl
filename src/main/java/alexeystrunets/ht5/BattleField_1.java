package alexeystrunets.ht5;

import java.util.Scanner;

public class BattleField_1 {
    public static void main(String[] args) {
        char[][] gameField = {
                {'~', '~', '~', '~', '~'},
                {'~', 'o', '~', '~', '~'},
                {'~', '~', '~', 'o', '~'},
                {'~', '~', '~', '~', 'o'},
                {'~', '~', '~', '~', '~'}
        };

        Scanner scanner = new Scanner(System.in);
        boolean allShipsSunk = false;

        while (!allShipsSunk) {
            System.out.print("Введите координаты выстрела (строка, столбец): ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (row < 0 || row >= gameField.length || col < 0 || col >= gameField[0].length) {
                System.out.println("Неверные координаты!");
            } else if (gameField[row][col] == '~') {
                System.out.println("Мимо!");
                gameField[row][col] = '.';
            } else if (gameField[row][col] == 'o') {
                gameField[row][col] = 'x';
                System.out.println("Убил!");
            } else if (gameField[row][col] == 'x') {
                System.out.println("Уже потоплен!");
            } else {
                System.out.println("Неверные координаты!");
            }
            allShipsSunk = true;
            for (int i = 0; i < gameField.length; i++) {
                for (int j = 0; j < gameField[0].length; j++) {
                    if (gameField[i][j] == 'o') {
                        allShipsSunk = false;
                        break;
                    }
                }
                if (!allShipsSunk) {
                    break;
                }
            }

            if (allShipsSunk) {
                System.out.println("Все корабли противника потоплены! Вы победили!");
            }
        }
    }
}