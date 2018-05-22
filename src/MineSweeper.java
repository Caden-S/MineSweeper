import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MineSweeper extends JFrame {
    private MenuBar menubar;
    private Ctrl ctrl;
    private JPanel board;

    public MineSweeper() {
        super("MineSweeper");

        board = new JPanel();
        board.setBackground(Color.darkGray);
        this.add(board);

        menubar = new MenuBar(this);
        setJMenuBar(menubar);

        newGame();
    }

    public void newGame() {
        ArrayList<Tile> tilelist = new ArrayList<>();
        for(int r = 0; r <= 9; r++) {
            for (int c = 0; c <= 27; c++) {
                tilelist.add(new Tile(r, c));
            }
        }
        for(Tile t : tilelist) {
            board.add(t);
        }
        repaint();
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
        window.setBounds(540, 360, 1150, 600);
        window.setDefaultCloseOperation(EXIT_ON_CLOSE);
        window.setVisible(true);
        window.setResizable(false);
    }
}
