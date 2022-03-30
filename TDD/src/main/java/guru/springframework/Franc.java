package guru.springframework;

public class Franc {

    private int amount;
    public Franc(int amount) {
        this.amount = amount;
    }

    Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public boolean equals(Object object) {
        Franc dollar = (Franc) object;
        return amount == dollar.getAmount();
    }
}
