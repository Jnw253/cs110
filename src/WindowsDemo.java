import javax.swing.*;
import java.text.DecimalFormat;
public class WindowsDemo{

public static void main(String [] args)
        {
    JFrame w;
    JFrame m;


        double weight;
        double miles;

            w = new JFrame();
            weight = Double.parseDouble(JOptionPane.showInputDialog(w, "Enter the package weight: "));

            DecimalFormat money = new DecimalFormat("0.00");

            m = new JFrame();
            miles = Double.parseDouble(JOptionPane.showInputDialog(m, "Enter the miles shipped: "));

            ShippingCharges myPackage = new ShippingCharges (weight, miles);

            JFrame t;
            t = new JFrame();
            JOptionPane.showMessageDialog(t, "Your total is $" + money.format(myPackage.getShippingCharges()));




}
}
