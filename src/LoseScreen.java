import javax.swing.*;
import java.awt.*;

public class LoseScreen extends JFrame {
    private JPanel text;
    private JLabel loss;

    public LoseScreen() {
        super("Uh Oh!");

        text = new JPanel();
        loss = new JLabel("You lost!");
        text.add(loss);
        loss.setFont(new Font("Serif", Font.BOLD, 50));

        this.add(text);
    }
}
