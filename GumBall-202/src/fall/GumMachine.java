package fall;

public abstract class GumMachine {
    protected int totalMoney;

    public GumMachine() {
        this.totalMoney = 0;
    }

    public abstract boolean insertMoney(int coin);

    public void clear() {
        this.totalMoney = 0;
    }

}