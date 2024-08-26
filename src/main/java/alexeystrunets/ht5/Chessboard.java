package alexeystrunets.ht5;

import java.util.Arrays;

public class Chessboard {
    public static void main(String[] args) {
        String[][] chessboard = new String[8][8];
        for (int row = 0; row < 8; row++) {
            for (int column = 0; column < 8; column++) {
                if ((row + column) % 2 == 0) {
                    chessboard[row][column] = "W";
                } else {
                    chessboard[row][column] = "B";
                }
            }
        }

        for (String[] row : chessboard) {
            System.out.println(Arrays.toString(row));
        }
    }
}