import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuBar extends JMenuBar implements ActionListener {
    private MineSweeper game;
    private JMenu help, preferences;
    private JMenuItem howtoplay, newgame, savegame;

    public MenuBar(MineSweeper game) {

        help = new JMenu("Help");
        this.add(help);

        howtoplay = new JMenuItem("How to Play");
        help.add(howtoplay);

        preferences = new JMenu("Preferences");
        this.add(preferences);

        newgame = new JMenuItem("New Game");
        preferences.add(newgame);

        savegame = new JMenuItem("Save Game");
        preferences.add(savegame);


    }

    public void actionPerformed(ActionEvent e) {
        JMenuItem src = (JMenuItem)e.getSource();
        if(src == howtoplay) {

        }
    }
}
