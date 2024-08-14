package vadimavetisov.lesson5;

public class lesson5_homework1 {
    private static final String ANSI_RESET = "\u001B[0m";
    ;
    private static final String ANSI_WHITE = "\u001B[37m";
    ;
    private static final String ANSI_BLACK = "\u001B[30m";
    ;
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

    public static void main(String[] args) {

        String[][] intArray = new String[8][8];

        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray.length; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(ANSI_WHITE + "W" + " " + ANSI_RESET);
                } else {
                    System.out.print(ANSI_BLACK + "B" + " " + ANSI_RESET);
                }
            }
            System.out.println();
        }
    }
}
