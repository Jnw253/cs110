import java.util.Scanner;

public class EndingTime
{
public static void main(String [] args)
{
    Scanner scanner = new Scanner(System.in);
    System.out.println("How many Hours?");

    int hours = scanner.nextInt();
    System.out.println(hours + " hours");

    Scanner scanner1 = new Scanner(System.in);
    System.out.println("How many minutes?");

    int minutes = scanner1.nextInt();

    System.out.println(minutes + " minutes");
    int startTime = (hours * 60) + (minutes);

    System.out.println("start time is " + startTime + " minutes");


    Scanner scanner2 = new Scanner(System.in);
    System.out.println("How long of a duration? (in minutes)");

    int duration = scanner2.nextInt();

    Scanner scanner3 = new Scanner(System.in);
    System.out.println(duration + startTime + " minutes");

    int endingTime = (duration + startTime);

    System.out.println("The end time is " + endingTime + " minutes.");

    int convertTime = endingTime / 60;
    int remainingMinutes = endingTime % 60;

    int militaryHours = 00;
    int militaryMinutes = 00;

   int endMilitaryHours = militaryHours + convertTime;
   int endMilitaryMinutes = militaryMinutes + remainingMinutes;

    if (endMilitaryHours > 24){
        endMilitaryHours = endMilitaryHours % 24;

    System.out.println(endMilitaryHours + ":" + endMilitaryMinutes);


    }




  //  System.out.println("Now I will the end time back into hours. The answer is " + convertTime + " hours and, " + remainingMinutes + " minutes");


















}
}


