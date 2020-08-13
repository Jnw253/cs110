public class Circle
{
    private double radius;
    private double pi = 3.14159;

    // constructor
    public Circle(double c) {
        radius = c;
    }

    public double getRadius(){
        return radius;
    }
    public double getArea(){
    return Math.pow(radius, 2) * pi;
    }
    public double getDiameter(){
    return 2 * radius;
    }
    public double getCircumference(){
    return 2 * pi * radius;
    }

    public void setRadius(int r) {
        radius = r;
    }



        }

