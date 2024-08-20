package daniils.lesson3;

import java.util.Scanner;

public class Literals {

    public static void main(String[] args) {
        //Literals

//        System.out.println("bla bla bla\t" +
//                "bla bla bla");

//        int num = 4;
//
//        //binary
//        int bin = 0b01;
//        System.out.println(bin); //1
//        //octal
//        int oct = 0111;
//        System.out.println(oct); //73
//        //decimal
//        int dec = 111;
//        System.out.println(dec); //111
//        //hex
//        int hex = 0xAF;
//        System.out.println(hex); //175

        //Floating numbers

        //What's the output of the below?
        //System.out.println(0.1 + 0.2);

        //char a = 65;
        //System.out.println(a);

//        float floatNum = 12.0f;
//        double doubleNum = 12.0d;

        // Casting
        //byte num = (byte) 1000;
        //System.out.println(num);

        //char zero = 42;
        //System.out.println(zero);
        //char minOne = -1;

        int intNum = 5 * 2 + 1 * 8;
        intNum++;

        int today = 11;

        Scanner s = new Scanner(System.in);

        System.out.println(s instanceof Scanner);

    }

}
