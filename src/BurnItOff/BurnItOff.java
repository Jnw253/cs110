package BurnItOff;

import java.util.Scanner;

public class BurnItOff{

    public static void main(String[] args)
    {

        double bigMacs = 0;
        double caloriesConsumed = 0;
        double milesToWalk = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("How Big Macs did you eat? ");
        bigMacs = keyboard.nextDouble();

        caloriesConsumed = bigMacs * 590;
        milesToWalk = caloriesConsumed / 93.5;

        System.out.println("wow, you consumed " + caloriesConsumed + "calories");
        System.out.println("You need to walk " + milesToWalk + " miles");

        }
        }



