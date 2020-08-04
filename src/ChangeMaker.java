import java.util.Scanner;

public class ChangeMaker {

    public static void main(String[] args) {
        String customerPaid = "Enter the amount the customer paid:";
        System.out.println(customerPaid);
        Scanner scanner = new Scanner(System.in);
        int paid = scanner.nextInt();

        String customerOwe = "Enter the amount the customer owed:";
        System.out.println(customerOwe);
        Scanner scanner1 = new Scanner(System.in);
        int owe = scanner1.nextInt();

        System.out.println("Their change is " + (paid - owe));
        int exactChange = (paid - owe);
        int dollar = exactChange / 100;
        int looseChange = exactChange % 100;

        int quarters = looseChange / 25;
        looseChange = looseChange % 25;

        int dimes = looseChange  / 10;
        looseChange = looseChange % 10;

        int nickels = looseChange / 5;
        looseChange = looseChange % 5;

        int pennies = looseChange / 1;




        System.out.println(dollar + " dollars, " + quarters + " quarters, " + dimes + " dimes, " + nickels + " nickels, " + "and " + pennies + "pennies");



    }
}
