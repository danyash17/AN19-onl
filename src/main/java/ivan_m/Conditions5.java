package ivan_m;

import java.util.Scanner;

public class Conditions5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Введите номер цвета радуги (от 1 до 7): ");
            number = scanner.nextInt();
            switch (number)
            {
                case 1: System.out.println("Цвет под номером " + number + " - красный"); break;
                case 2: System.out.println("Цвет под номером " + number + " - оранжевый"); break;
                case 3: System.out.println("Цвет под номером " + number + " - жёлтый"); break;
                case 4: System.out.println("Цвет под номером " + number + " - зелёный"); break;
                case 5: System.out.println("Цвет под номером " + number + " - голубой"); break;
                case 6: System.out.println("Цвет под номером " + number + " - синий"); break;
                case 7: System.out.println("Цвет под номером " + number + " - фиолетовый"); break;
                default: System.out.println("Цвета с данным номером не существует. Попробуйте ещё раз!"); break;
            }
        }while(number < 1 || number > 7);
    }
}
