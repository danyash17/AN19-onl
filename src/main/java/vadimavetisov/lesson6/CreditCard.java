package vadimavetisov.lesson6;

public class CreditCard {

    String account;
    Long balance;

    public CreditCard(String account, Long balance) {
        this.account = account;
        this.balance = balance;

    }

    public void moneyIn(Long amount) {

        if (amount > 0) {
            balance += amount;
        } else {
            throw new InputException("Неверная сумма");
            //Так делать приветствуется в этом классе? Или это нужно делать в классе с psvm?
            //Если желательно так делать в классе с psvm, то не могу сообразить,
            // что указывать там в условии if.
            //А ещё здесь явно можно дать второй шанс для ввода. Но не соображу, что писать в условии.
            //Если это надо делать в классе с psvm, тогда ещё больше не соображу, что писать в условии.
            //Подскажи для чайников плиз, как в таком случае можно прописать try?
        }
    }

    public void moneyOut(Long amount) {

        if (amount > 0) {
            balance -= amount;
        } else {
            throw new InputException("Неверная сумма");
        }

    }

    @Override
    public String toString() {
        return "\nКредитная карта №: " + account + "\nТекущий баланс: " + balance + "\n";
    }
}