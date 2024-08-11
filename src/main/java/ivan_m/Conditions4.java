package ivan_m;

import java.util.Scanner;

public class Conditions4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temperature;
        System.out.println("Введите температуру на улице: ");
        temperature = scanner.nextDouble();
        if (temperature > -5)
        {
            System.out.println("Тепло");
        }
        else if (temperature > -20 && temperature <= -5)
        {
            System.out.println("Нормально");
        }
        else if (temperature <= -20)
        {
            System.out.println("Холодно");
        }
    } // Расценка ощущения температуры воздуха явно не для нашего климатического пояса :)
}
