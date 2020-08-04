import java.util.Scanner;

public class Item {

    public static void main(String[] args) {


    String getName = "What is the name of the item? ";
    System.out.println(getName);
    Scanner scanner = new Scanner(System.in);
    String name = scanner.next();

    String price = "What is the price of the item (entire price ex 12.99)? ";
    System.out.println(price);
    scanner = new Scanner(System.in);
    double getPrice = scanner.nextDouble();

    String quantity = "How many would you like? ";
    System.out.println(quantity);
    scanner = new Scanner(System.in);
    int getQuantity = scanner.nextInt();

    double getValue = (getQuantity * getPrice);
    System.out.println("Your total is " + getValue + " in " + name);
    }
}
