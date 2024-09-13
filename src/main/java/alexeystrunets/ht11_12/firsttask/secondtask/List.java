package alexeystrunets.ht11_12.firsttask.secondtask;

public class List {
    public static void main(String[] args) {
        Board board = new Board();

        Task firstTask = new Task("Сделай курсы.", 1, 45, true);
        Task secondtTask = new Task("Сделай лабу на Qt.", 2, 5, false);
        Task thirdTask = new Task("Сделай лабу по ОТС.", 3, 25, true);

        board.addTaskToList(firstTask);
        board.addTaskToList(secondtTask);
        board.addTaskToList(thirdTask);


        System.out.println("Количество задач: " + board.countNumberOfTasks(board.getTasks()));

        if (board.getTasks().isEmpty()) {
            System.out.println("У вас нет задач.");
        } else {
                board.countNumberOfActiveTasks();
            System.out.println("Активные задачи: " + board.countNumberOfActiveTasks());
        }

        if (board.getTasks().isEmpty()) {
            System.out.println("У вас нет задач.");
        } else {
            board.removeTask(firstTask.getCountNumber());//как здесь сделать проверку как у меня в методе в Board?
            System.out.println("Задача: " + firstTask.getDescription() + " удалена.");
        }

        System.out.println("Количество задач: " + board.countNumberOfTasks(board.getTasks()));

        System.out.println("Самая долгая задача: " + board.compareOfNumbersOfDays());
    }
}


