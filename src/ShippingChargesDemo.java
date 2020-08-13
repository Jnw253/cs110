import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ShippingChargesDemo {

    public static JOptionPane WindowsDemo;

    public static void main(String [] args)
    {
        double weight;
        int miles;

        Scanner keyboard = new Scanner(System.in);

        DecimalFormat money = new DecimalFormat("0.00");

        System.out.println("Enter the package weight: ");

        weight = keyboard.nextDouble();

        System.out.print("Enter the miles shipped: ");
        miles = keyboard.nextInt();

        ShippingCharges myPackage = new ShippingCharges (weight, miles);

        System.out.println("Total Charges will be $" +
                money.format(myPackage.getShippingCharges()));

    }
}



