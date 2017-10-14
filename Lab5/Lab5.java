import java.util.Scanner;
import java.util.InputMismatchException;

public class Lab5 {

    public static void main(String[] args) {
	//Build Scanner and set oolean for finishing input after catch 
        Scanner input = new Scanner(System.in);
	//boolean for catch
        boolean tryAgain = true;
	//do try logic
        do try {
            System.out.println("Please enter an Whole Number: ");
            int wholeNum = input.nextInt();
            input.close();
	
	//If number is detected pass print and change boolean to pass catch
            if(wholeNum > 0 ){
                System.out.println("You entered " + wholeNum);
                tryAgain = false;
            }

	//catch logic
        } catch (InputMismatchException e1) { // Something other than a number
            System.out.println("* You did not enter an integer.  Try again.");
            System.out.println();
            input.nextLine();
	//break catch condition.
        } while(tryAgain);
    }

}
