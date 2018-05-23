import javax.swing.*;
import java.awt.*;

public class Tile extends JPanel {
    public JLabel num = new JLabel();

    public Tile(int x, int y) {
        super();
        this.add(num, JPanel.CENTER_ALIGNMENT);

        num.setText((int)(Math.random() * 8) + "");

        switch(num.getText()) {
            case "1":
                num.setText("0");
                break;
            case "2":
                num.setText("0");
                break;
            case "3":
                num.setText("0");
                break;
        }

        if(num.getText() == "0") {

        }

        this.setBounds(x * 25, y * 25, 25, 25);
        this.setBackground(Color.gray);
    }
}
