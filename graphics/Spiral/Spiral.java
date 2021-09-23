import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class Spiral extends JPanel{
    public void paintComponent(Graphics g){
        Color[] colors = {Color.BLACK, Color.BLUE, Color.CYAN, Color.GRAY, Color.MAGENTA,
            Color.PINK, Color.RED};
        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();
        final int INITIAL_X = width/2 - 10; //x co-ordinate of the starting point of spiral
        final int INITIAL_Y = height/2;     //y co-ordinate of the starting point of spiral
        int pointX = INITIAL_X;
        int pointY = INITIAL_Y;
        int diameter = 20;  //diameter of the first semicircle
        int rotation = 180; 
        final int GAP = 40;  //difference of diameter between two consecutive semi-circle
        int cntr = 0;       //counts number of semicircles drawn
        while(diameter < height && diameter < width){ 
            //loop stops if the next semi-circle goes out of the width or height of the frame
            for(Color c : colors){
                cntr++;
                g.setColor(c);
                g.drawArc(pointX, pointY, diameter, diameter, 0, rotation); //draws semi-circle
                pointY -= GAP/2;    //setting y co-ordinate for the next semi-circle
                pointX += cntr%2 == 0 ? 0 : -GAP;   //setting x-co-ordinate of next semi-circle
                diameter += GAP;    //increments diameter of next semicircle
                rotation *= -1;     //setting rotation of next semi-circle in clockwise direction
            }
        }
    }    
}