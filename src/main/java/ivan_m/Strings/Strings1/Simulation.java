package ivan_m.Strings.Strings1;
/*Написать программу со следующим функционалом:
На вход передать строку (будем считать, что это номер документа).
Номер документа имеет формат xxxx-yyy-xxxx-yyy-xyxy, где x — это число,
а y — это буква.*/
public class Simulation {
    public static void main(String[] args) {
        String string ="5257-ABC-2638-xyz-1f2w";

        //1 - Вывести на экран в одну строку два первых блока по 4 цифры
        System.out.println(MyStrings.doTask1(string));

        //2 - Вывести на экран номер документа, но блоки из трех букв заменить
        //на *** (каждая буква заменятся на *).
        System.out.println(MyStrings.doTask2(string));

        //3 - Вывести на экран только одни буквы из номера документа в
        //формате yyy/yyy/y/y в нижнем регистре.
        System.out.println(MyStrings.doTask3(string));

        //4 - Вывести на экран буквы из номера документа в формате
        //"Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью
        //класса StringBuilder).
        System.out.println(MyStrings.doTask4(string));

        //5 - Проверить содержит ли номер документа последовательность abc и
        //вывети сообщение содержит или нет(причем, abc и ABC считается
        //одинаковой последовательностью).
        System.out.println(MyStrings.doTask5(string));

        //6 - Проверить начинается ли номер документа с последовательности
        //555.
        System.out.println(MyStrings.doTask6(string));

        //7 - Проверить заканчивается ли номер документа на
        //последовательность 1a2b
        System.out.println(MyStrings.doTask7(string));
    }
}


