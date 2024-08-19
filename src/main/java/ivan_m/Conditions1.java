package ivan_m;

import java.util.Scanner;

public class Conditions1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfMonth;

        do {
            System.out.println("Введите номер месяца: ");
            numberOfMonth = scanner.nextInt();
            switch (numberOfMonth)
            {
                case 12:
                case 1:
                case 2: System.out.println("Зима"); break;
                case 3:
                case 4:
                case 5: System.out.println("Весна"); break;
                case 6:
                case 7:
                case 8: System.out.println("Лето"); break;
                case 9:
                case 10:
                case 11: System.out.println("Осень"); break;
                default: System.out.println("Месяца с таким номером не существует. Попрубуйте ещё раз!"); break;
            }
        }while(numberOfMonth < 1 || numberOfMonth > 12);

    }
}
