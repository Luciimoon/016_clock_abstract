package pkg016_clock_abstract;

import java.util.Timer;
import java.util.TimerTask;

/**
 * <p>Creates a clock which displays the time, either in console or with a JFrame</p>
 * 
 * 
 * <p> uses abstracts, which is half way between a normal class and an interface.</p>
 * <p> can have either no code or full code</p>
 *
 * 
 * 
 * 
 * @author compsci
 * @version 1.0
 */
public class DigitalClock1 extends MyTime implements NewInterface {

    /**
     *<h3>first main</h3>
     * @param args
     */
    public static void main(String[] args) {
        final DigitalClock1 dc1 = new DigitalClock1();
        Timer clock = new Timer();
        TimerTask tt = new TimerTask() {
            @Override
            public void run() {
                dc1.display();
            }
        };
        dc1.display();
        clock.scheduleAtFixedRate(tt, 1000, 1000);

    }

    /**
     *<p>implemented method</p>
     */
    @Override
    public void first() {
        //throw new UnsupportedOperationException("Not supported yet");
    }

    /**
     *
     * @param x
     * @return
     */
    @Override
    public String second(int x) {
        //throw new UnsupportedOperationException("Not supported yet");
        return null;
    }

    /**
     * <h3>Prints the time in the console every second</h3>
     */
    public void display() {
        String dt = MyTime.getDate();
        String tm = MyTime.getTime();
        String time = dt + " ~ " + tm;
        System.out.println(time);

    }
}