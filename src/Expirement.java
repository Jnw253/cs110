import java.util.Scanner;

public class Expirement {

    public static void main(String[] args) {
        String chicken = "green";
        System.out.println(chicken);

        int number = 6;

        int number1 = 8;

        System.out.println(number + number1);

        double number2 = 2.3;
        System.out.println(number + number1 + number2);

        Boolean fiftyfifty = false;
        System.out.println(fiftyfifty);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input an int");

        int num = scanner.nextInt();

        System.out.println(String.format("Your int is %d", num));

        String scannedString = scanner.next();

        System.out.println(scannedString);

        String concat = "this" + " is " + "concatinated " + chicken;
        System.out.println(concat);
    }



}
