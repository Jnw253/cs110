import java.util.Scanner;
    import java.util.Scanner;

    public class TestSeconds {
        public static void main(String args[]) {

            double localTime;


            Scanner keyboard = new Scanner(System.in);


            System.out.print("Enter a time in seconds: ");
            localTime = keyboard.nextDouble();


            Seconds time = new Seconds(localTime);


            System.out.println(time.format());


        }
    }
