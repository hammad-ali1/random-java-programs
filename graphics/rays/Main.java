import javax.swing.JFrame;

public class Main{
    public static void main(String[] args){
        JFrame window = new JFrame();
        Rays rays = new Rays();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.add(rays);
        window.setSize(500, 600);
        window.setVisible(true);
    }
}