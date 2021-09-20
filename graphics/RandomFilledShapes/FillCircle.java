import java.awt.Graphics;

public class FillCircle extends FilledShape{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        int diameter = length < breadth ? length : breadth;
        g.fillOval(pointX, pointY, diameter, diameter);
    }
}