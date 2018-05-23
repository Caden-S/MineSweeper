import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MineSweeper extends JFrame {
    private MenuBar menubar;
    private Ctrl ctrl;
    private JPanel board;
    private ArrayList<Tile> tilelist;

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
        tilelist = new ArrayList<>();
        System.out.println("called");
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

    // Board reset method
    public void reset() {
        for(Tile t : tilelist) {
            t.num.setText((int) (Math.random() * 8) + "");

            switch(t.num.getText()) {
                case "1":
                    t.num.setText("0");
                    break;
                case "2":
                    t.num.setText("0");
                    break;
                case "3":
                    t.num.setText("0");
                    break;
            }
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
        window.setBounds(540, 360, 1150, 600);
        window.setDefaultCloseOperation(EXIT_ON_CLOSE);
        window.setVisible(true);
        window.setResizable(false);
    }
}
