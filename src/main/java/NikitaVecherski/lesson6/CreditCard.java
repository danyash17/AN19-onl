package NikitaVecherski.lesson6;

public class CreditCard {


    private String cardName;
    private String checkNum;
    private double money;

    public CreditCard(String name, String checkNum, double money) {
        this.money = money;
        this.checkNum = checkNum;
        this.cardName = name;
    }

    public String toString() {
        return "Имя карты: " + cardName + "\n Номер счета: " + checkNum + "\n Сумма на счету: " + money;
    }


    public double getMoney(double get) {
        if (get > money) {
            System.out.println("Недостаточно средств на карте " + cardName);
        } else
            money = money - get;
        return money;
    }


    public double addMoney(double add) {
        if (add < 0) {
            System.out.println("Нельзя положить отрицательное число на карту");
        } else
            money = money + add;
        return money;
    }

}


