package ivan_m.OOP.ATM;
/*Создать класс, описывающий банкомат.
Набор купюр, находящихся в банкомате, должен задаваться тремя
свойствами:
количеством купюр номиналом 20, 50 и 100.
Сделать метод для добавления денег в банкомат.
TeachMeSkills.by
Сделать функцию, снимающую деньги, которая принимает сумму денег,
а возвращает булевое значение - успешность выполнения операции.
При снятии денег функция должна распечатывать каким количеством
купюр какого номинала выдаётся сумма.
Создать конструктор с тремя параметрами - количеством купюр каждого
номинала.*/
public class ATM {
    private int twenties;
    private int fifties;
    private int oneHundreds;

    public ATM(int twenties, int fifties, int oneHundreds) {
        this.twenties = twenties;
        this.fifties = fifties;
        this.oneHundreds = oneHundreds;
    }

    public void AddMoney(int t20s, int f50s, int o100s)
    {
        twenties+=t20s;
        fifties+=f50s;
        oneHundreds+=o100s;
    }

    public boolean MoneyOutput(int money){
        int amount20s = 0;
        int amount50s = 0;
        int amount100s = 0;
        int sum = twenties * 20 + fifties * 50 + oneHundreds * 100;
        if (sum < money)
        {
            return false;
        }
        else
        {
            int balance = money;
            while (balance >= 100 && oneHundreds!=0)
            {
                balance -= 100;
                amount100s++;
                oneHundreds--;
            }
            while (balance >= 50 && fifties!=0)
            {
                balance -= 50;
                amount50s++;
                fifties--;
            }
            while (balance >= 20 && twenties!=0)
            {
                balance -= 20;
                amount20s++;
                twenties--;
            }
            if (balance == 0)
            {
                System.out.println("Cумма выдана следующим количеством купюр :\n" +
                        "Количество 20ок - " + amount20s +"\n"+
                        "Количество 50ок - " + amount50s +"\n"+
                        "Количество 100ок - " + amount100s);
                return true;
            }
            else
            {
                oneHundreds+=amount100s;
                fifties+=amount50s;
                twenties+=amount20s;
                return false;
            }
        }
    }

    @Override
    public String toString() {
        return "ATM{" +
                "twenties=" + twenties +
                ", fifties=" + fifties +
                ", oneHundreds=" + oneHundreds +
                '}';
    }
}
