import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MineSweeper extends JFrame {
    private MenuBar menubar;
    private JPanel board;
    private Tile[][] tilelist;
    public JLabel end;

    // Game Constructor
    public MineSweeper() {
        super("MineSweeper");

        end = new JLabel("You lose!");

        board = new JPanel();
        board.setBackground(Color.darkGray);
        this.add(board);

        menubar = new MenuBar(this);
        setJMenuBar(menubar);

        newGame();
    }

    // New Game method
    public void newGame() {

        tilelist = new Tile[9][27];

        for(int r = 0; r <= 8; r++) {
            for (int c = 0; c <= 26; c++) {
                tilelist[r][c] = new Tile(this, r , c);
            }
        }
        for(Tile[] t : tilelist) {
            for(Tile x : t) {
                board.add(x);
            }
        }
        repaint();
    }

    // Board reset method (New game menu option)
    public void reset() {
        for(Tile[] x : tilelist) {
            for(Tile t : x) {
                t.setText((int) (Math.random() * 8) + "");

                switch (t.getText()) {
                    case "1":
                        t.setText("0");
                        break;
                    case "2":
                        t.setText("0");
                        break;
                    case "3":
                        t.setText("0");
                        break;
                    case "4":
                        t.setText("0");
                        break;
                    case "5":
                        t.setText("1");
                        break;
                    case "6":
                        t.setText("1");
                        break;
                    case "7":
                        t.setText("1");
                        break;
                }
            }
        }
    }

    public void ActionListener(ActionEvent e ) {
        Object src = e.getSource();
        if(src == tilelist) {

        }
    }


    public static void main(String args[]) {
        try {
            // Set System L&F
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (UnsupportedLookAndFeelException e) {
            System.out.println("LAF not supported.");
        }
        catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        }
        catch (InstantiationException e) {
            System.out.println("LAF cannot be instantiated");
        }
        catch (IllegalAccessException e) {
            System.out.println("Illegal access.");
        }

        MineSweeper window = new MineSweeper();
        window.setBounds(540, 360, 1180, 680);
        window.setDefaultCloseOperation(EXIT_ON_CLOSE);
        window.setVisible(true);
        window.setResizable(false);
    }
}
