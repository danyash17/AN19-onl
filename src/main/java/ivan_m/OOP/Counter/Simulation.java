package ivan_m.OOP.Counter;

import java.util.Scanner;

public class Simulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Counter number = new Counter();
        double delta;
        int actionNumber;

        do {
            System.out.println("Что Вы хотите сделать?\n" +
                    "1 - Увеличить счётчик\n" +
                    "2 - Уменьшить счётчик\n" +
                    "3 - Обнулить счётчик\n" +
                    "4 - Узнать значение счётчика\n" +
                    "5 - Выйти");
            actionNumber = scanner.nextInt();

            switch (actionNumber)
            {
                case 1 :
                    System.out.println("Введите число, на которое хотите увеличить счётчик :");
                    delta = scanner.nextDouble();
                    System.out.println("Текущее значение - " + number.increaseValue(delta)); break;
                case 2 :
                    System.out.println("Введите число, на которое хотите уменьшить счётчик :");
                    delta = scanner.nextDouble();
                    System.out.println("Текущее значение - " + number.decreaseValue(delta)); break;
                case 3:
                    number.startValue();
                    System.out.println("Cчётчик обнулён! Текущее значение - 0"); break;
                case 4:
                    System.out.println(number.toString()); break;
                case 5:
                    System.out.println("До свиданья!"); break;
            }
        }while(actionNumber != 5);

    }
}
