//enter list of number and calculate average on numbers when negative number is passed
import java.util.*;
public class Average {

    public static void main(String[] args) {
        System.out.println("Enter a list of nonnegative scores.");
        System.out.println("Mark the end with a negative number.");
        System.out.println("I will compute the average");
        Scanner input = new Scanner(System.in); //just copy-and paste this line, you dont have to understand it yet.
        int number;
        int sum = 0;
        int Count = 0;
        int average = 0;
        do {
            Count = Count + 1;
            number = input.nextInt(); //this reads number from input and store its value in variable number
            sum += number; //here you add number to the total sum
        } while (number > -1); //just repeat cycle as long as number is abover -1
        average = sum/Count;




        System.out.println("Enter a list of nonnegative scores.");
        System.out.println("Mark the end with a negative number.");
        System.out.println("I will compute the average");
        System.out.println(average);

        /*
        This is all test code!

        System.out.println("Sum is : " + sum);
        System.out.println("Total Numbers: "+ Count);
        System.out.println("The Average of the sum of numbers is: " + average);
        */
    }
}
