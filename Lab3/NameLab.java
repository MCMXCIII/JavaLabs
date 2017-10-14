//List and format the pass names
import java.util.*;

import java.util.StringTokenizer;
 
public class NameLab {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your last name.");
        String lastName = sc.nextLine() + " ";
        System.out.println("Followed by your first and middle names.");
        System.out.println("If you don\"t\" have a middle name enter \"None\".");
        String firstName= sc.nextLine() + " ";
        String middleName = sc.nextLine() + " ";
        String fullName = firstName + middleName + lastName;
        //String msg = "This program gives sample code for String Tokenizer";
        StringTokenizer st = new StringTokenizer(fullName," ");
        System.out.println("Your Name is: ");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}

