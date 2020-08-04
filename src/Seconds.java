public class Seconds
{
    double time;

    public Seconds (double t){
    time = t;
        }

    public String format()
    {
     String timeString;


     int minutes = ((int)  time) / 60;
     int seconds = ((int) time) % 60;
     int milliseconds = ((int) time) * 1000 % 1000 ;
     timeString = Integer.toString(minutes) + ":" + Integer.toString(seconds) + "." + Integer.toString(milliseconds);

        return timeString;


    }

}
