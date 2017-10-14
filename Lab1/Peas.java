//Printing peas in pod
import java.util.*;
public class Peas {
 
    public static void main(String[] args) {
 
 	//Make scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of pods followed by the number of peas in a pod.");
	//set vars 
        int numberOfPods = sc.nextInt();
        int peasPerPods = sc.nextInt();
        int totalNumberofPeas = numberOfPods * peasPerPods;
 
 	//print vars
        System.out.println(numberOfPods + " pods and ");
        System.out.println(peasPerPods + " peas per pod.");
        System.out.println("The total number of peas = " + totalNumberofPeas);
    }
}