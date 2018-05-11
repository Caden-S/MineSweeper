import javax.swing.*;
import java.awt.*;

public class Tile extends JPanel {
    private JLabel num = new JLabel();

    public Tile(int x, int y) {
        super();
        this.add(num, JPanel.CENTER_ALIGNMENT);

        num.setText((int)(Math.random() * 6) + "");

        this.setBounds(x * 25, y * 25, 25, 25);
        this.setBackground(Color.gray);
    }
}
