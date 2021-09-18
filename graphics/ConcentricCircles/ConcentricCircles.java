import java.awt.Graphics;
import javax.swing.JPanel;

public class ConcentricCircles extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();
        int LAST_POINT_X = width/2 - 10;
        int LAST_POINT_Y = height/2 - 10;
        final int NEXT = 30; //pixels after which the next circle comes 
        int pointX = 0, pointY = 0, diameter = height < width ? height : width; 
        while(pointX < LAST_POINT_X && pointY < LAST_POINT_Y){
            g.drawOval(pointX, pointY, diameter, diameter);
            pointX += NEXT;
            pointY += NEXT;
            diameter -= 2*NEXT;
        }

    }
}