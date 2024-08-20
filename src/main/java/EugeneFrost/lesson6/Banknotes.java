package EugeneFrost.lesson6;

public class Banknotes {
    private int twenty;
    private int fifty;
    private int hundred;

    public Banknotes(int twenty, int fifty, int hundred) {
        this.twenty = twenty;
        this.fifty = fifty;
        this.hundred = hundred;
    }

    public void AddToBankomat(int twenty, int fifty, int hundred) {
        this.twenty += twenty;
        this.fifty += fifty;
        this.hundred += hundred;
    }

    public boolean WithdrawMoney(int money) {
        if (money <= 0 || money > twenty * 20 + fifty * 50 + hundred * 100) {
            return false;
        }

        int hundredCount = money / 100;
        int remainder = money % 100;
        if (hundredCount > this.hundred) {
            hundredCount = this.hundred;
            remainder = money - hundredCount * 100;
        }

        int fiftyCount = remainder / 50;
        remainder %= 50;
        if (fiftyCount > this.fifty) {
            fiftyCount = this.fifty;
            remainder = money - hundredCount * 100 - fiftyCount * 50;
        }

        int twentyCount = remainder / 20;
        if (twentyCount > this.twenty) {
            twentyCount = this.twenty;
        }

        this.hundred -= hundredCount;
        this.fifty -= fiftyCount;
        this.twenty -= twentyCount;


        System.out.println("Выдано: " + hundredCount +
                " купюр номиналом 100, " + fiftyCount +
                " купюр номиналом 50, " + twentyCount +
                " купюр номиналом 20.");

        return true;
    }
}