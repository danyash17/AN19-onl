package Alex_P.lesson6;

public class MachineATM {
    int banknote20;
    int banknote50;
    int banknote100;

    public MachineATM(int banknote20, int banknote50, int banknote100) {
        this.banknote20 = banknote20;
        this.banknote50 = banknote50;
        this.banknote100 = banknote100;
    }

    public void addBanknotes(int addbanknote20, int addbanknote50, int addbanknote100) {
        banknote20 += addbanknote20;
        banknote50 += addbanknote50;
        banknote100 += addbanknote100;
    }

    public boolean withdrawCash(int cashSum) {
        if (cashSum > banknote20 * 20 + banknote50 * 50 + banknote100 * 100) {
            return false;
        }

        int cash100 = 0;
        int cash50 = 0;
        int cash20 = 0;
        int currentCash = 0;
        String textInfo = "";

        if ((banknote100 * 100) / cashSum > 0) {
            cash100 = cashSum / 100;
            banknote100 -= cash100;
            textInfo += cash100 + " of 100$";
        }
        if ((banknote50 * 50) / cashSum > 0) {
            cash50 = (cashSum - cash100 * 100) / 50;
            if (cash50 != 0) {
                banknote50 -= cash50;
                if (cash100 != 0) {
                    textInfo += ", ";
                }
                textInfo += cash50 + " of 50$";
            }
        }
        if ((banknote20 * 20) / cashSum > 0) {
            cash20 = (cashSum - cash100 * 100 - cash50 * 50) / 20;
            if (cash20 != 0) {
                banknote20 -= cash20;
                if (cash100 != 0 | cash50 != 0) {
                    textInfo += ", ";
                }
                textInfo += cash20 + " of 20$";
            }
        }

        System.out.println("Take your cash: " + textInfo);

        return true;

    }
}
