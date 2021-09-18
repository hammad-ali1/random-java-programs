import javax.swing.JFrame;

public class Main{
    public static void main(String[] args){
        JFrame window = new JFrame();
        ConcentricCircles cc = new ConcentricCircles();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.add(cc);
        window.setSize(1080, 720);
        window.setVisible(true);
    }
}