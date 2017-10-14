import java.util.*;

public class Lister {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	//5 scores
	int numberOfScores = 5;

	//Create a String array for 5 numbers
        int arrayOfNames[] = new int[numberOfScores];
        System.out.println("Enter 5 Scores.");
        for(int i = 0; i < arrayOfNames.length; i++){
            System.out.println("Enter a score " + (i+1) + ":");
            arrayOfNames[i] = sc.nextInt();

        }

        //Find the biggest number.
        int largest = arrayOfNames[0];

        for(int i = 1; i < arrayOfNames.length; i++){
            if(arrayOfNames[i] > largest)
                largest = arrayOfNames[i];
        }

        //List the scores and give the Largest term.

            //System.out.println(arrayOfNames[i] + "\n");
            System.out.println("The Highest Score is: " + largest);

        //print the difference between the largest number and that term.
        System.out.println("The scores are:");
        for(int i = 0; i < arrayOfNames.length; i++){
            System.out.println(arrayOfNames[i] + " Differs from the max by " + (largest - arrayOfNames[i]));
        }

        

    }
}
