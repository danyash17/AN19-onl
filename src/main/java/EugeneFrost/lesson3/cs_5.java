package EugeneFrost.lesson3;

import java.util.Scanner;

public class cs_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите номер цвета от 1 до 7: ");
        int color = sc.nextInt();

        switch (color) {
            case 1:{
                System.out.println("Красный");
                break;
            }
            case 2:{
                System.out.println("Оранжевый");
                break;
            }
            case 3:{
                System.out.println("Жётлый");
                break;
            }
            case 4:{
                System.out.println("Зелёный");
                break;
            }
            case 5:{
                System.out.println("Голубой");
                break;
            }
            case 6:{
                System.out.println("Синий");
                break;
            }
            case 7:{
                System.out.println("Фиолетовый");
                break;
            }
            default: System.out.println("Некорректный ввод");
        }
    }
}

