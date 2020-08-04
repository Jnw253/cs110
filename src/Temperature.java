public class Temperature {
    private double degreesInKelvin;

    public Temperature() {
        double degreesInKelvin = 0;
        double degreesInCelsius = 0;
        double degreesInFahrenheit = 0;
    }

    public void setDegreesFromCelsius(double celsius) {
        degreesInKelvin = celsius + 273.15;
    }

    public void setDegreesFromFahrenheit(double fahrenheit) {
        degreesInKelvin = (.55555556 * (fahrenheit-32) + 273.15);
    }

    public double getDegreesInKelvin() {
        return degreesInKelvin;
    }
}
