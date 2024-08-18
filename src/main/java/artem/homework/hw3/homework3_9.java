package artem.homework.hw3;

    /*Необходимо, чтоб программа выводила на экран вот такую
    последовательность:
            7 14 21 28 35 42 49 56 63 70 77 84 91 98.
    В решении используйте цикл while.*/

public class homework3_9 {
    public static void main(String[] args) {
      int i = 0;
      int number = 98;

      while (i < number) {
          i += 7;
          System.out.println(i);
      }
    }
}
