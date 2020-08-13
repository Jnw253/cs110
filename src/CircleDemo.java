import java.util.Scanner;

public class CircleDemo {
    public static void main(String args[]){
        System.out.println("Enter the radius of a circle: ");

        Scanner s = new Scanner(System.in);

        double radius = s.nextDouble();

        System.out.println("The circle's radius is " + radius);

        Circle newCircle = new Circle(radius);

        System.out.println("The circle's area is     " + newCircle.getArea());
        System.out.println("The circle's diameter is     " + newCircle.getDiameter());
        System.out.println("The Circle's Circumference is     " + newCircle.getCircumference());

    }


}
