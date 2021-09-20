import java.util.Random;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class FilledShape extends JPanel{
    protected int width, height, pointX, pointY, length, breadth;
    private Random random = new Random();
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();
        int R = random.nextInt(256);
        int G = random.nextInt(256);
        int B = random.nextInt(256);
        pointX = random.nextInt(width);
        pointY = random.nextInt(height);
        length = random.nextInt( height - pointY);
        breadth = random.nextInt(width - pointX);
        Color color = new Color(R, G, B);
        g.setColor(color);
    }
}