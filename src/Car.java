public class Car {
    private int year;
    private String make;
    private double speed;

    public Car(int y, String m, double beginningSpeed) {
        year = y;
        make = m;
        speed = beginningSpeed;

    }

    public int getYear()
    {
        return year;
    }
    public String getMake()
    {
    return make;
    }
    public double getSpeed()
    {
    return speed;
    }
    public void accelerate()
    {
        speed += 1;
    }
}
