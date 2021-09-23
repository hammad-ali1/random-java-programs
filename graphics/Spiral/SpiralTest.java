import javax.swing.JFrame;

public class SpiralTest {
    public static void main(String[] args) {
       JFrame window = new JFrame();
       Spiral spiral = new Spiral();
       window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       window.add(spiral);
       window.setExtendedState(JFrame.MAXIMIZED_BOTH);
       window.setVisible(true);
    }
}
