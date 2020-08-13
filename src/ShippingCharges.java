public class ShippingCharges {
    double shipping;

    public ShippingCharges(double weight, double miles) {
        if(weight <= 2 )
        {
            weight = 1.10;
        }
        else if (weight > 2 && weight < 6)
        {
            weight = 2.30;
        }
        else if (weight < 10 && weight > 6) {
            weight = 3.50;
        }
        else if (weight >= 10) {
            weight = 4.70;

        }
        shipping = weight * miles / 500;

    }

    public double getShippingCharges() {
        return shipping;
    }
}
