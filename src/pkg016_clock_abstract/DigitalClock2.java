package pkg016_clock_abstract;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.util.Timer;
import javax.swing.Timer;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *<h3>creates a JFrame with html</h3>
 * @author compsci
 * @version 1.0
 */
public class DigitalClock2 extends JFrame implements ActionListener {

    JLabel lblShowTime = new JLabel("");
    InheritMyTime imt = new InheritMyTime();

    /**
     *<h3> second main</h3>
     * @param args
     */
    public static void main(String[] args) {
        DigitalClock2 fr = new DigitalClock2();
        centerFrame(fr);
        fr.setVisible(true);

    }

    private static void centerFrame(DigitalClock2 fr) {
       

    }

    /**
     *<h3>creates a JFrame with html</h3>
     */
    public DigitalClock2() {
        setLayout(new FlowLayout());
        setSize(500, 200);
        setTitle("Digital Clock");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(lblShowTime);
        display();
        Timer displayTime = new Timer(1000, this);
        displayTime.start();
    }

    private void display() {
        String dt = imt.getDate();
        String tm = imt.getTime();
        String html = "<html><p style = \"font-size: 30pt; text-align: center;\">"
                + dt + "</p>";
        html += "<p style=\"font-size: 90pt; text-align: center;\">" + tm + "</p></html>";
        lblShowTime.setText(html);
    }

    public void actionPerformed(ActionEvent e) {
        display();
    }

}