package ivan_m.OOP.Counter;

public class Counter {
    private double currentValue = 0;

    public double increaseValue(double number)
    {
        currentValue+=number;
        return currentValue;
    }

    public double decreaseValue(double number)
    {
        currentValue -= number;
        return currentValue;
    }

    public void startValue()
    {
        currentValue = 0;
    }

    @Override
    public String toString() {
        return "Текущее значение счётчика - " + currentValue;
    }
}
