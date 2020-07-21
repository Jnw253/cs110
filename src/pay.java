import java.util.Scanner;

public class pay
{
        public static void main(String [] args)
        {

            // Declare Variables
            double hoursWorked;
            double hourlyPayRate;
            double grossPay;

            // Create a Scanner object
            Scanner keyboard = new Scanner(System.in);

            // Get the hours worked and the hourly pay rate

            System.out.print("How many hours did you work? ");
            double hours = keyboard.nextDouble();
            System.out.print("How much do you get paid per hour? ");
            hourlyPayRate = keyboard.nextDouble();

            // Calculate gross pay
            if (hours <= 40)
            {
                grossPay = hours * hourlyPayRate;
            }
            else
            {
                grossPay =  (hours) * (1.5 * hourlyPayRate);
            }

            // Display the results
            System.out.println("You earned $" + grossPay);
        }
    }

