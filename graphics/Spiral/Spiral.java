import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class Spiral extends JPanel{
    public void paintComponent(Graphics g){
        Color[] colors = {Color.BLACK, Color.BLUE, Color.CYAN, Color.GRAY, Color.MAGENTA,
            Color.PINK, Color.RED};     //array of colors that to paint the rainbow with
        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();
        final int INITIAL_X = width/4; //x co-ordinate of the bounding rectangle of the first arc (semicircle)
        final int INITIAL_Y = 0;     //y co-ordinate of the bounding rectangle of first arc (semicircle)
        int pointX = INITIAL_X;
        int pointY = INITIAL_Y;
        int diameter = (height  - INITIAL_Y) < (width - INITIAL_X )? (height  - INITIAL_Y): (width - INITIAL_X);  //diameter of the first semicircle
        int rotation = 180; 
        final int GAP = 40;  //difference of diameter between two consecutive semi-circle
        int cntr = 0;       //counts number of semicircles drawn
        while(diameter > 0){ 
            for(Color c : colors){ //loop through array of colors
                cntr++;
                g.setColor(c);
                g.fillArc(pointX, pointY, diameter, diameter, 0, rotation); //draws semi-circle
                pointY += GAP/2;    //setting y co-ordinate for the next semi-circle
                pointX += cntr%2 == 0 ? 0 : GAP;   //setting x-co-ordinate of next semi-circle
                diameter -= GAP;    //decrements diameter of next semicircle
                rotation *= -1;     //setting rotation of next semi-circle in clockwise direction
                if(diameter < 0)
                    break;          //stop looping through colors if there is no semicircle to draw
            }
        }
    }    
}