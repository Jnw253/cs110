import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {

        String dayQuestion = "How many days";
        String hourQuestion = "How many hours";
        String minuteQuestion = "How many minutes";
        String secondQuestion = "How may seconds";

        int seconds = 0;
        int minutes = 0;
        int hours = 0;
        int days = 0;

        days += 1;
        days -= 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println(dayQuestion);

        days = scanner.nextInt();

        System.out.println(hourQuestion);

        hours = scanner.nextInt();

        System.out.println(minuteQuestion);

        minutes = scanner.nextInt() ;
        System.out.println(secondQuestion);

        seconds = scanner.nextInt();

        int totalSeconds = getSeconds(1, 2, 2, 2);

        System.out.println(String.format("The total time in seconds is: %d", totalSeconds));

    }

    public static int getSeconds(int days, int hours, int minutes, int seconds) {
        int total = (days * 24 * 60 * 60) + (hours * 60 * 60) + (minutes * 60) + seconds;
        return total;
    }

}