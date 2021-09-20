import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main{
    public static void main(String[] args){
        int option = Integer.parseInt(JOptionPane.showInputDialog("Press 1 to randomly draw a circle\n2 to randomly draw a ractangle"));
        JFrame window = new JFrame();
        FillCircle c = new FillCircle();
        FillRectangle r = new FillRectangle();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        switch(option){
            case 1:
                window.add(c);
                break;
            case 2: 
                window.add(r);
                break;
        }
        window.setSize(1440, 720);
        window.setVisible(true);
    }
}