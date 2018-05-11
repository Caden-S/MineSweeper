import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuBar extends JMenuBar implements ActionListener {
    private MineSweeper game;
    private JButton newgame;
    private JMenu help;
    private JMenuItem howtoplay;

    public MenuBar(MineSweeper game) {
        JMenuBar menu = new JMenuBar();

        newgame = new JButton("New Game");
        newgame.addActionListener(this);

        help = new JMenu("Help");
        help.addActionListener(this);
        howtoplay = new JMenuItem("How to Play");
        howtoplay.addActionListener(this);

        help.add(howtoplay);

        menu.add(help);

        this.add(menu);

    }

    public void actionPerformed(ActionEvent e) {
        JMenuItem src = (JMenuItem)e.getSource();
        if(src == howtoplay) {

        }
    }
}
