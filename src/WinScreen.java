import javax.swing.*;
import java.awt.*;

public class WinScreen extends JFrame {
    private JPanel text;
    private JLabel win;

    public WinScreen() {
        super("Congrats");

        text = new JPanel();
        win = new JLabel("Congratulations!");
        text.add(win);
        win.setFont(new Font("Serif", Font.BOLD, 30));

        this.add(text);
    }
}
