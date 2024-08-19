package NikitaVecherski.lesson6;

public class creditCard {

    String checkNum;
    double money;

   public void seeMoney () {
        System.out.println("На счету: " + money);
    }

    public void seeCheckNum() {
        System.out.println("Номер счета: " + checkNum);
    }

    double getMoney(double get) {
        money = money - get;
        return money;
    }
    double addMoney(double add){
        money = money + add;
        return money;
    }

}


