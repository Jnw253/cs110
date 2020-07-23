public class RaceTrack
{
    public static void main(String[] args)
    {
        Car sportsCar = new Car(2010, "porsche", 5.0);

        System.out.println("Year: " + sportsCar.getYear());

        System.out.println("make: " + sportsCar.getMake());

        System.out.println("speed: " + sportsCar.getSpeed());

        sportsCar.accelerate();
        System.out.println("Accelerate, my speed is now " + sportsCar.getSpeed());



    }
}
