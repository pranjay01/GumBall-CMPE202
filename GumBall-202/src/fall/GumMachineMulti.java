package fall;

public class GumMachineMulti implements GumMachine {
    private int totalMoney;

    public GumMachineMulti() {
        this.totalMoney = 0;
    }

    @Override
    public boolean insertMoney(int coin) {
        if (totalMoney == 50) {
            System.out.println(
                    "Not accepting money, as required money already inserted, Please turn crank before inserting more money");
            return true;
        }
        totalMoney += coin;
        System.out.println("Success, money accepted");
        if (totalMoney == 50) {
            return true;
        }

        return false;

    }

    @Override
    public void clear() {
        this.totalMoney -= 50;

    }
}
