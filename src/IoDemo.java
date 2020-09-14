import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IoDemo {

    public static void main(String [] args) throws IOException {
        String filename;
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the filename?");
        //filename = scanner.next();

        File file = new File("src/" + "Quotations.txt");

        Scanner fileScanner = new Scanner(file);

        System.out.println(fileScanner.nextLine());
        String s = "";
        while(fileScanner.hasNext()) {
            s = s +fileScanner.nextLine();
        }

        System.out.print(s.toUpperCase());
        FileWriter myWriter = new FileWriter("filename.txt");
        myWriter.write(s);
        myWriter.close();


    }


}