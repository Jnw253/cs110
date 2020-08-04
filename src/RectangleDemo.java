import java.awt.*;

public class RectangleDemo {
 public static void main(String[] args)
 {
     Rectangle box1 = new Rectangle(50, 30, 100, 50);
     System.out.println("box 1 is at (" + box1.getXCoordinate() + "," +
             box1.getYCoordinate() + ")");
     System.out.println("height = " + box1.getHeight());
     System.out.println("width = " + box1.getWidth());
    System.out.println("color = " + box1.getColor());

   box1.setXCoordinate(100);
   box1.setYCoordinate(200);
     box1.setColor("#FF0000");  // red
     box1.setHeight(20);
     box1.setWidth(15);

     System.out.println();
     System.out.println("box 1 is at (" + box1.getXCoordinate() + "," +
             box1.getYCoordinate() + ")");
     System.out.println("height = " + box1.getHeight());
     System.out.println("width = " + box1.getWidth());
    System.out.println("color = " + box1.getColor());







 }
}

