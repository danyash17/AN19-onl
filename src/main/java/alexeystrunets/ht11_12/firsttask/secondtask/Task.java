package alexeystrunets.ht11_12.firsttask.secondtask;

import java.util.Objects;

public class Task {
    private String description;
    private int countNumber;
    private int numberOfDays;
    private boolean active;

    public Task(String description, int countNumber, int numberOfDays, boolean active) {
        this.active = active;
        this.countNumber = countNumber;
        this.numberOfDays = numberOfDays;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public int getCountNumber() {
        return countNumber;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public boolean isActive() {
        return active;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCountNumber(int countNumber) {
        this.countNumber = countNumber;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return countNumber == task.countNumber && numberOfDays == task.numberOfDays && active == task.active && Objects.equals(description, task.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, countNumber, numberOfDays, active);
    }

    @Override
    public String toString() {
        return "Task{" +
                "description='" + description + '\'' +
                ", countNumber=" + countNumber +
                ", dataOfStart=" + numberOfDays +
                ", active=" + active +
                '}';
    }
}
