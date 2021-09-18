import java.awt.Graphics;
import javax.swing.JPanel;

public class Circle extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();
        int numberOfLines = 100;
        int xIncrement = width / numberOfLines;
        int x = 0, y = height - 100;
        final double Y = Math.pow(y, 2);
        for(int i = 0; i < numberOfLines; i++){
            g.drawLine(0, 0, x, y);
            x += xIncrement;
            y = (int) Math.sqrt(Y - Math.pow(x, 2));
        }
    }
}