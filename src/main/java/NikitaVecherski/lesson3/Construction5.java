package NikitaVecherski.lesson3;

import java.util.Scanner;

public class Construction5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите температуру");
        String temperature = scanner.nextLine();
        int t = Integer.parseInt(temperature);
        if (t>-5) {
            System.out.println("На улице тепло");
        }
            if (-5>=t && t >-20) {
                System.out.println("На улице нормально");
            }
            if (-20>=t){
                    System.out.println("На улице холодно");
                }
            }
        }

