import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.util.Random;

public class Spiral extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();
        final int INITIAL_X = width/4; //x co-ordinate of the bounding rectangle of the first arc (semicircle)
        final int INITIAL_Y = 0;     //y co-ordinate of the bounding rectangle of first arc (semicircle)
        int pointX = INITIAL_X;
        int pointY = INITIAL_Y;
        int diameter = (height  - INITIAL_Y) < (width - INITIAL_X )? (height  - INITIAL_Y): (width - INITIAL_X);  //diameter of the first semicircle
        final int GAP = 40;  //difference of diameter between two consecutive semi-circle
        int cntr = 0;       //counts number of semicircles drawn
        Random random = new Random();
        int R, G, B;
        Color c;
        int incrementAngle = 30, startAngle = 0;
        while(diameter > 0){ 
            startAngle = 0;
            while(Math.abs(startAngle) < 180){ //draws semi-circle filled with random colors    
                R = random.nextInt(255); G = random.nextInt(255); B = random.nextInt(255);
                c = new Color(R, G, B);
                g.setColor(c);  //assigning color
                g.fillArc(pointX, pointY, diameter, diameter, startAngle, incrementAngle); //draws a part of semi-circle
                startAngle += incrementAngle;
            }
            cntr++;     //counting number of semi-circle drawn
            pointY += GAP/2;    //setting y co-ordinate for the next semi-circle
            pointX += cntr%2 == 0 ? 0 : GAP;   //setting x-co-ordinate of next semi-circle
            diameter -= GAP;    //decrements diameter of next semicircle
            incrementAngle *= -1;     //setting startAngle and incrementAngle of next semi-circle in clockwise direction
            startAngle *= -1;
        }
    }    
}