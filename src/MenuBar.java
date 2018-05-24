import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuBar extends JMenuBar implements ActionListener {
    private MineSweeper game;
    private JMenu help, preferences;
    private JMenuItem howtoplay, newgame;

    public MenuBar(MineSweeper game) {
        this.game = game;

        help = new JMenu("Help");
        help.addActionListener(this);
        this.add(help);

        howtoplay = new JMenuItem("How to Play");
        howtoplay.addActionListener(this);
        help.add(howtoplay);

        preferences = new JMenu("Preferences");
        preferences.addActionListener(this);
        this.add(preferences);

        newgame = new JMenuItem("New Game");
        newgame.addActionListener(this);
        preferences.add(newgame);
    }

    public void actionPerformed(ActionEvent e) {
        JMenuItem src = (JMenuItem)e.getSource();
        if(src == howtoplay) {

        }
        if(src == newgame) {
            game.reset();
        }
    }
}
