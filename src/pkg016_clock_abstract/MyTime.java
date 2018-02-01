package pkg016_clock_abstract;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 *<h3> gets the time and date</h3>
 */
abstract class MyTime {

    public abstract void display();

    /**
     * <h3>this method gets the time from your computer</h3>
     * 
     * @return time in format hh:mm:ss
     * 
     */
    public static String getTime() {
        String t;
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        t = dateFormat.format(cal.getTime());
        return t;
    }

    /**
     * <h3>this method gets the date from your computer</h3>
     * 
     * @return date in format dd/mmm/yyyy
     * 
     */
    public static String getDate() {
        String d;
        DateFormat dateFormat = new SimpleDateFormat("dd/MMM/yyyy");
        Calendar cal = Calendar.getInstance();
        d = dateFormat.format(cal.getTime());
        return d;

    }
}