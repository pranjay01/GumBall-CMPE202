package fall;

public class GumballMachine {

    private int num_gumballs;
    private boolean moneySufficient;
    private GumMachine machine;

    public GumballMachine(GumMachine mach, int size) {
        // initialise instance variables
        machine = mach;
        this.num_gumballs = size;
        this.moneySufficient = false;
    }

    public void insertCoin(int coin) {
        this.moneySufficient = machine.insertMoney(coin);
    }

    public void turnCrank() {
        if (this.moneySufficient) {
            if (this.num_gumballs > 0) {
                this.num_gumballs--;
                this.moneySufficient = false;
                this.machine.clear();
                System.out.println("Thanks for your Money.  Gumball Ejected!");
            } else {
                this.machine.clear();
                System.out.println("No More Gumballs!  Please Collect your money.");
            }
        } else {
            System.out.println("Please insert a money");
        }
    }
}