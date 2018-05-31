import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuBar extends JMenuBar implements ActionListener {
    private MineSweeper game;
    private JMenu help, preferences;
    private JMenuItem howtoplay, newgame;

    public MenuBar(MineSweeper game) {

        Dimension x = new Dimension(20, 50);
        Dimension y = new Dimension(100, 50);
        Dimension z = new Dimension(50, 50);

        Font f = new Font("serif", Font.PLAIN, 17);
        UIManager.put("Menu.font", f);

        this.game = game;
        this.setPreferredSize(x);

        help = new JMenu("Help");
        help.addActionListener(this);
        help.setPreferredSize(z);
        this.add(help);

        howtoplay = new JMenuItem("How to Play");
        howtoplay.addActionListener(this);
        howtoplay.setPreferredSize(y);
        help.add(howtoplay);

        preferences = new JMenu("New Game");
        preferences.addActionListener(this);
        preferences.setPreferredSize(y);
        this.add(preferences);

        newgame = new JMenuItem("New Game");
        newgame.addActionListener(this);
        newgame.setPreferredSize(y);
        preferences.add(newgame);
    }

    public void actionPerformed(ActionEvent e) {
        JMenuItem src = (JMenuItem)e.getSource();
        if(src == howtoplay) {
            HowTo h = new HowTo();
            h.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            h.setVisible(true);
            h.setBounds(540, 360, 1000, 300);
            h.setResizable(false);
        }
        if(src == newgame) {
            game.reset();
        }
    }
}