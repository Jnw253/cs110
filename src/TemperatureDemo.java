import java.text.DecimalFormat;
import java.util.Scanner;

public class TemperatureDemo

{
   public static void main(String args[])

   {

       DecimalFormat finalTemp = new DecimalFormat("#0.000");
       double degrees;
       Temperature temperature1 = new Temperature();
       Temperature temperature2 = new Temperature();
       Scanner keyboard = new Scanner(System.in);

       System.out.print("enter a temperature in celsius: ");
       degrees = keyboard.nextDouble();
       temperature1.setDegreesFromCelsius(degrees);

       System.out.println("Temperature 1 is " + finalTemp.format(temperature1.getDegreesInKelvin()) + " degrees kelvin");

       System.out.println("enter a temperature in fahrenheit: ");
       degrees = keyboard.nextDouble();
       temperature2.setDegreesFromFahrenheit(degrees);

       System.out.println("Temperature 2 is " + finalTemp.format(temperature2.getDegreesInKelvin()) + " degrees kelvin");

       double difference;
       difference = Math.abs(temperature1.getDegreesInKelvin() - temperature2.getDegreesInKelvin());

       if (difference< .001)
       {
       System.out.println("The two temperatures are equal");
       }
   }
}
