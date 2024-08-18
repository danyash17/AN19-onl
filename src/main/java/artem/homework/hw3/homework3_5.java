package artem.homework.hw3;

        /*По введенному номеру определить цвет радуги (1 –
        красный, 4 – зеленый и т. д.)*/

import java.util.Scanner;

public class homework3_5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Please, enter color number: ");
        int numberColor = console.nextInt();
        String pack;
        switch (numberColor) {
            case 1:
                pack = "Red";
                break;
            case 2:
                pack = "Orange";
                break;
            case 3:
                pack = "Yellow";
                break;
            case 4:
                pack = "Green";
                break;
            case 5:
                pack = "Blue";
                break;
            case 6:
                pack = "Indigo";
                break;
            case 7:
                pack = "Violet";
                break;
            default:
                pack = "This color does not exist";
        }
        System.out.println(pack);
    }
}
