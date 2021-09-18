import javax.swing.JFrame;

public class Main{
    public static void main(String[] args){
        JFrame window = new JFrame();
        Circle circle = new Circle();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.add(circle);
        window.setSize(500, 600);
        window.setVisible(true);
    }
}