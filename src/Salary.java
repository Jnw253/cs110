import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        double salary = 1000.00;
        int n = 1;
        int yearsWorked;



        Scanner scanner = new Scanner(System.in);
        System.out.println("How many years will you work? ");
        yearsWorked = scanner.nextInt();


        while (n <= yearsWorked) {


            System.out.println(n + "     $" + (salary));

            salary= salary *2;
            n++;

            }


        }
    }

