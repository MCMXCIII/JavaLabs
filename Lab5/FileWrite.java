import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWrite {

    public static void main(String[] args) throws IOException {

        //starting off with IOE exception
            //line cases
            String firstLine = "Writing to file.";
            String secLine = "The quick brown fox";
            String thrLine = "jumped over the lazy dog.";
            String endLine = "End of program.";

            //using Filewriter and Printwriter
            FileWriter fw = new FileWriter("stuff.txt");
            PrintWriter pw = new PrintWriter(fw);
            //printing case lines with pw from Printwriter
            pw.println(firstLine);
            pw.println(secLine);
            pw.println(thrLine);
            pw.println(endLine);
	    pw.close();




        }

}