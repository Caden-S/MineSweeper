import javax.swing.*;

public class HowTo extends JFrame {
    private JPanel Text;
    private JLabel t, t2, t3, t4;

    public HowTo() {
        super("How to play");

        Text = new JPanel();
        t = new JLabel("Blanks Squares mean there are no bombs near that square.");
        t2 = new JLabel(" If a square has a number on it, then that means there are that ");
        t3 = new JLabel("many bombs in a 3x3 square around that square with that block being");
        t4 = new JLabel("the center of the square");
        Text.add(t);
        Text.add(t2);
        Text.add(t3);
        Text.add(t4);
        this.add(Text);
    }
}
