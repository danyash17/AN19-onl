package ivan_m.PillarsOfOOP.Robot;
/*Создайте класс Robot с методом performTask().
Реализуйте подклассы CleaningRobot, CookingRobot, которые будут по-разному выполнять задачи. (Полиморфизм)*/
import java.util.Scanner;

public class Simulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Robot robot = null;
        int robotNumber;
        do {
            System.out.println("What do you wanna do?\n" +
                    "1 - Clean the house\n" +
                    "2 - Cook a dinner");
            robotNumber = scanner.nextInt();

            switch (robotNumber) {
                case 1:
                    robot = new CleaningRobot();
                    break;
                case 2:
                    robot = new CookingRobot();
                    break;
                default:
                    System.out.println("Incorrect number! Try again");
                    break;
            }
        } while (robotNumber != 1 && robotNumber != 2);

        System.out.println(robot.doSomething());
    }
}
