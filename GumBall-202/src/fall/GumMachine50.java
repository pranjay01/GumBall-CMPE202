package fall;

public class GumMachine50 extends GumMachine {

    public GumMachine50() {
        super();
    }

    @Override
    public boolean insertMoney(int coin) {
        if (totalMoney == 50) {
            System.out.println(
                    "Not accepting money, as required money already inserted, Please turn crank before inserting more money");
            return true;
        }
        if (coin == 25) {
            totalMoney += coin;
            System.out.println("Success, money accepted");
        } else {
            System.out.println("Only Quarter Coins are Accepted, your coin is rejected");
        }
        if (totalMoney == 50) {
            return true;
        }
        return false;

    }

}
