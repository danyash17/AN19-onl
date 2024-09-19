package alexeystrunets.ht11_12.firsttask.secondtask;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<Task> tasks = new ArrayList<>();

    public List<Task> getTasks() {
        return tasks;
    }

    public int countNumberOfTasks(List<Task> tasks) {
        return tasks.size();
    }

    public List<Task> countNumberOfActiveTasks() {
        List<Task> activeTasks = new ArrayList<>();
        for (Task task : tasks) {
            if (task.isActive()) {
                activeTasks.add(task);
            }
        }
        return activeTasks;
    }

    @Override
    public String toString() {
        return "Board{" +
                "tasks=" + tasks +
                '}';
    }

    public void removeTask(int taskNumber) {
        Task taskToRemove = null;
        for (Task task : tasks) {
            if (task.getCountNumber() == taskNumber) {
                taskToRemove = task;
                break;
            }
        }
        if (taskToRemove != null) {
            tasks.remove(taskToRemove);
        } else {
            System.out.println("Задача с номером " + taskNumber + " не найдена.");
        }
    }

    public void addTaskToList(Task task) {
        tasks.add(task);
    }

    public Task compareOfNumbersOfDays() {
        Task longestTaskLiving = tasks.get(0);
        for (Task number : tasks) {
            if (number.getNumberOfDays() > longestTaskLiving.getNumberOfDays()) {
                longestTaskLiving = number;
            }
        }
        return longestTaskLiving;
    }
}
