import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ctrl extends JPanel {

    private MineSweeper game;
    private MenuBar menuBar;

    public Ctrl() {


    }

    public void newGame() {
        game.newGame();
    }

    private class newButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String cmd = e.getActionCommand();
            if("New Game".equals(cmd)) {
                newGame();
            }
        }
    }

}
