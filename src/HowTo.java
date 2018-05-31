import javax.swing.*;
import java.awt.*;

public class HowTo extends JFrame {
    private JPanel Text;
    private JLabel t, t2, t3, t4;

    public HowTo() {
        super("How to play");

        Text = new JPanel();
        t = new JLabel("Squares marked with 0's mean there are no bombs near that square.");
        t.setFont(new Font("Serif", Font.BOLD, 30));
        t2 = new JLabel(" If a square has a number on it, then that means there are that");
        t2.setFont(new Font("Serif", Font.BOLD, 30));
        t3 = new JLabel("many bombs in a 3x3 square around that square with that block being");
        t3.setFont(new Font("Serif", Font.BOLD, 30));
        t4 = new JLabel("the center of the square.");
        t4.setFont(new Font("Serif", Font.BOLD, 30));

        Text.add(t);
        Text.add(t2);
        Text.add(t3);
        Text.add(t4);

        this.add(Text);
    }
}
