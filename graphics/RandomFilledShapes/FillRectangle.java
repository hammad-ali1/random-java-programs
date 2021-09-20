import java.awt.Graphics;

public class FillRectangle extends FilledShape{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.fillRect(pointX, pointY, breadth, length);
    }
}