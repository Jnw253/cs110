import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        String weightQuestion = "How much do you weigh (in pounds)?";
        System.out.println(weightQuestion);
        Scanner scanner = new Scanner(System.in);
        int weight = scanner.nextInt();

        String heightQuestion = "How tall are you (in inches)?";
        System.out.println(heightQuestion);
        Scanner scanner1 = new Scanner(System.in);
        int height = scanner1.nextInt();

        int bmi = (weight * 703) / (height * height);
        System.out.println("Your BMI is " + bmi);
    }
}
