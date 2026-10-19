import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
//make sure the class extends jPanel
public class HelloGraphics extends JPanel {


    //this method "paints" things onto the panel
    @Override
    public void paintComponent (Graphics g)	{
        g.setColor(Color.BLUE);
        g.fillRect(0,0,1000,800);

        g.setColor(Color.RED);
        g.fillOval(100, 100, 200, 200);

        g.setColor(new Color(1,1,1));
        g.fillRect(300, 100, 150, 150);

        g.setColor(Color.GREEN);
        g.drawLine(500,0,500,800);
        g.drawLine(0,400,1000,400);

        g.setColor(Color.YELLOW);
        g.drawString("Hello World",700,500);

        for (int x = 60; x < 60*5+1; x+=60) {
            g.fillOval(x,600,50,50);
        }


    }
    //Driver
    public static void main (String[] args) {
        //creates a frame and sets it's properties
        JFrame frame = new JFrame("Hello CS1!!!!!");
        frame.setSize(1000, 800);
        frame.setLocation(50, 0);

        //tells the java program to exit when the graphics window is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //put the panel on the frame and make it visible
        frame.setContentPane(new HelloGraphics());
        frame.setVisible(true);
    }
}

