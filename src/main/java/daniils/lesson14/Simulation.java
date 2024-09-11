package daniils.lesson14;

import java.util.Vector;

class BankAccount {
    private int balance = 100;

    public void withdraw(int amount) {
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " снимает " + amount);
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " завершил снятие. Остаток: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " не может снять " + amount + ". Недостаточно средств.");
        }
    }

    public int getBalance() {
        return balance;
    }
}

public class Simulation {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Runnable withdrawTask = () -> {
            for (int i = 0; i < 3; i++) {
                account.withdraw(30);
                try {
                    Thread.sleep(100); // Задержка для наглядности
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread thread1 = new Thread();
        thread1.run();
        Thread thread2 = new Thread(withdrawTask, "Поток 2");

        thread1.start();
        thread2.start();

        int count = 10;
        while (count >= 0) {
            System.out.println("Countdown: " + count);
            count--;
            try {
                Thread.sleep(1000); // Задержка в 1 секунду
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}