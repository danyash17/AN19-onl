package NikitaVecherski.lesson9;

import java.util.Scanner;

public class Logic {
    private Double num1;
    private Double num2;

    public Double getNum1() {
        return num1;
    }

    public void setNum1(Double num1) {
        this.num1 = num1;
    }

    public Double getNum2() {
        return num2;
    }

    public void setNum2(Double num2) {
        this.num2 = num2;
    }

    public Logic(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Первое число");
        setNum1(scanner.nextDouble());
        System.out.println("Второе число");
        setNum2(scanner.nextDouble());
        try{
            double i = getNum1() / getNum2();
            System.out.println("Результат деления -> " + i);
        }catch (ArithmeticException e1){
            System.out.println("Нельзя делить на ноль");
        }finally {
            System.out.println("Операция завершена");
        }
    }


}

