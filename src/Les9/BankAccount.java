package Les9;

public class BankAccount {

    private int amountOfMoney;

    public BankAccount(int amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }

    public int getAmountOfMoney() {
        return amountOfMoney;
    }

    public int withdrawMoney(int amountOfMoney) {
        return this.amountOfMoney -= amountOfMoney;
    }
}

