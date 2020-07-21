import javax.swing.*;
import java.util.Scanner;

public class NameMaker {
public static void main(String[] args) {
    String firstName = "Enter your first name:";
    System.out.println(firstName);
    Scanner scanner = new Scanner(System.in);
    String name = scanner.next();


    String middleName = "Enter your middle name:";
    System.out.println(middleName);
    Scanner scanner1 = new Scanner(System.in);
    String mName = scanner1.next();


    String lastName = "Enter your last name:";
    System.out.println(lastName);
    Scanner scanner2= new Scanner(System.in);
    String lName = scanner1.next();

    String concat = "hello " + name + " " + mName + " " + lName;

    System.out.println(concat);

    name.charAt(0);

    char firstInitial = name.toUpperCase().charAt(0);

    mName.charAt(0);
    char secondInitial = mName.charAt(0);

    lName.charAt(0);
    char lastInitial = lName.charAt(0);

    String concat1 = "your initials are " + firstInitial + secondInitial + lastInitial;
    System.out.println(concat1);

    String uppercaseFN = name.toUpperCase();
    String uppercaseSN = mName.toUpperCase();
    String uppercaseLN = lName.toUpperCase();

    System.out.println("upper case is " + uppercaseFN + " " + uppercaseSN + " " + uppercaseLN);

    String lowercaseFN = name.toLowerCase();
    String lowercaseSN = mName.toLowerCase();
    String lowercaseLN = lName.toLowerCase();

    System.out.println("lower case is " + lowercaseFN + " " + lowercaseSN + " " + lowercaseLN);

    int num = name.length();
    int num2 = mName.length();
    int num3 = lName.length();
    int totalLetters = num + num2 + num3;

    System.out.println("your full name has " + totalLetters + " Characters");


    String someText = JOptionPane.showInputDialog("enter some text");

    System.out.println(someText);











}
}
