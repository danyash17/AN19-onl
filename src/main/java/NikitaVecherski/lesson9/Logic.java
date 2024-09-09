package NikitaVecherski.lesson9;

import java.util.Scanner;

class Logic {
    private double num1;
    private double num2;


    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public void doLogic() throws ArithmeticException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Первое число");
        setNum1(scanner.nextDouble());
        System.out.println("Второе число");
        setNum2(scanner.nextDouble());
        try {
            if (getNum2() == 0) {
                throw new ArithmeticException();
            } else {
                double i = getNum1() / getNum2();
                System.out.println("Результат деления -> " + i);
            }
        } catch (ArithmeticException e1) {
            System.out.println("Нельзя делить на ноль");
        } finally {
            System.out.println("Операция завершена");
        }
    }
}

