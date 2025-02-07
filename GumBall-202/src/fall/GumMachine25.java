package fall;

public class GumMachine25 extends GumMachine {

    // private int totalMoney;

    public GumMachine25() {
        super();
    }

    @Override
    public boolean insertMoney(int coin) {
        if (totalMoney == 25) {
            System.out.println(
                    "Not accepting money, as required money already inserted, Please turn crank before inserting more money");
            return true;
        }
        if (coin == 25) {
            totalMoney += coin;
            System.out.println("Success, money accepted");
            return true;
        }
        System.out.println("Only Quarter Coins are Accepted, your coin is rejected");
        return false;

    }

}
