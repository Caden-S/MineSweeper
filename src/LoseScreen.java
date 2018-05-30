import javax.swing.*;

public class LoseScreen extends JFrame {
    private JPanel text;
    private JLabel loss;

    public LoseScreen() {
        super("Uh Oh!");

        text = new JPanel();
        loss = new JLabel("You lost!");
        text.add(loss);

        this.add(text);
    }
}
