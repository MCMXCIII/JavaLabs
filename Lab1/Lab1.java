//Printing balance/interest

public class Lab1 {

    public static void main(String[] args) {
	// write your code here
        int balance = 375;
        int interest_rate = 9;
        double interest = balance * (interest_rate/100.0);

        System.out.println("On Balance of: " + balance);
        System.out.println("You will earn interest of: " + interest);
        System.out.println("All in just one short year.");


    }
}
