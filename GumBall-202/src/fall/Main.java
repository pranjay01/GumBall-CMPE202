package fall;

public class Main {
    public static void main(String[] args) {
        System.out.println("Create machine with 3 gumballs");
        GumballMachine machine1 = new GumballMachine(new GumMachine25(), 1);
        GumballMachine machine2 = new GumballMachine(new GumMachine50(), 1);
        GumballMachine machine3 = new GumballMachine(new GumMachineMulti(), 1);
        System.out.println(
                "---------------------------------------------------------------------------------------------");
        System.out.println("Scenario for turning crank without inserting money");
        System.out.println("Scenario Testing for 25 quarter Machine");
        machine1.turnCrank();
        System.out.println("Scenario Testing for 50 quarter Machine accepting ony 25 quarters");
        machine2.turnCrank();
        System.out.println(" Scenario Testing for 50 quarter Machine accepting any coin");
        machine3.turnCrank();
        System.out.println(
                "---------------------------------------------------------------------------------------------");
        System.out.println("Positive Scenario Testing for 25 quarter Machine");
        machine1.insertCoin(25);
        machine1.turnCrank();
        System.out.println("Positive Scenario Testing for 50 quarter Machine accepting ony 25 quarters");
        machine2.insertCoin(25);
        machine2.insertCoin(25);
        machine2.turnCrank();
        System.out.println("Positive Scenario Testing for 50 quarter Machine accepting any coin");
        machine3.insertCoin(5);
        machine3.turnCrank();
        machine3.insertCoin(10);
        machine3.turnCrank();
        machine3.insertCoin(10);
        machine3.turnCrank();
        machine3.insertCoin(10);
        machine3.turnCrank();
        machine3.insertCoin(5);
        machine3.insertCoin(10);
        machine3.turnCrank();
        System.out.println(
                "---------------------------------------------------------------------------------------------");
        System.out.println("Testing scenarios if machine is empty");
        System.out.println("Positive Scenario Testing for 25 quarter Machine");
        machine1.insertCoin(25);
        machine1.turnCrank();
        System.out.println("Positive Scenario Testing for 50 quarter Machine accepting ony 25 quarters");
        machine2.insertCoin(25);
        machine2.insertCoin(25);
        machine2.turnCrank();
        System.out.println("Positive Scenario Testing for 50 quarter Machine accepting any coin");
        machine3.insertCoin(5);
        machine3.turnCrank();
        machine3.insertCoin(10);
        machine3.turnCrank();
        machine3.insertCoin(10);
        machine3.turnCrank();
        machine3.insertCoin(10);
        machine3.turnCrank();
        machine3.insertCoin(5);
        machine3.insertCoin(10);
        machine3.turnCrank();
        System.out.println(
                "---------------------------------------------------------------------------------------------");
        System.out.println("Testing scenarios for trying other than 25 quarter coins in machine 1 and machine 2");
        machine1.insertCoin(5);
        machine2.insertCoin(10);

    }
}
