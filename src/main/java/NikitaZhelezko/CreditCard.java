package NikitaZhelezko;

class CreditCard {
    public String accountNumber;
    public double balance;
    public CreditCard(String accountNumber, double startBalance){
        this.accountNumber = accountNumber;
        this.balance = startBalance;
    }
    public void deposit(double amount){
        if(amount>0) {
            balance += amount;
            System.out.println("На счёт " + accountNumber + " начислено " + amount);

        }
        else{
            System.out.println("Сумма пополнения должная быть больше 0");}
    }
    public void withdraw(double amount) {
    if (amount > 0 && amount <= balance){
        balance -= amount;
        System.out.println("С со счёта " + accountNumber + " снято " + amount);
    }
    else  {
        System.out.println("Недостаточно средств");
    }
    }
    public void printInfo(){
        System.out.println("Номер счёта " + accountNumber + ", текущая сумма " + balance);
    }
}
