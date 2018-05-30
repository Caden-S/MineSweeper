import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Tile extends JButton implements ActionListener{
    public JLabel num = new JLabel();
    public int r, c, type;
    private MineSweeper game;
    public int count;

    // Tile Constructor
    public Tile(MineSweeper g, int x, int y) {
        super();
        this.add(num, JPanel.CENTER_ALIGNMENT);

        game = g;
        r = x;
        c = y;

        num.setText((int)(Math.random() * 8) + "");

        switch(num.getText()) {
            case "0":
                num.setText("   ");
                this.type = 0;
                break;
            case "1":
                num.setText("   ");
                this.type = 0;
                break;
            case "2":
                num.setText("   ");
                this.type = 0;
                break;
            case "3":
                num.setText("   ");
                this.type = 0;
                break;
            case "4":
                num.setText("   ");
                this.type = 0;
                break;
            case "5":
                num.setText("   ");
                this.type = 1;
                break;
            case "6":
                num.setText("   ");
                this.type = 1;
                break;
            case "7":
                num.setText("   ");
                this.type = 1;
                break;
        }

        this.addActionListener(this);
        this.setBounds(x * 25, y * 25, 25, 25);
        this.setBackground(Color.gray);

    }

    // Returns tile row
    public int getRow() {
        return this.r;
    }

    // Returns tile type
    public int getType() { return this.type; }

    // Returns tile column
    public int getColumn() {
        return this.c;
    }

    public void numMines() {
        count = 0;
        if(this.getType() == 0) {
            if (this.getRow() == 8) {
                //bottom left
                if (this.getColumn() == 0) {
                    if (game.tilelist[this.getRow() - 1][this.getColumn()].getType() == 1) {
                        count++;
                    } else if (game.tilelist[this.getRow() - 1][this.getColumn() + 1].getType() == 1) {
                        count++;
                    } else if (game.tilelist[this.getRow()][this.getColumn() + 1].getType() == 1) {
                        count++;
                    }
                }

                //bottom right
                else if (this.getColumn() == 26) {
                    if (game.tilelist[this.getRow() - 1][this.getColumn()].getType() == 1) {
                        count++;
                    } else if (game.tilelist[this.getRow() - 1][this.getColumn() - 1].getType() == 1) {
                        count++;
                    } else if (game.tilelist[this.getRow()][this.getColumn() - 1].getType() == 1) {
                        count++;
                    }
                }

                //bottom not corners
                else {
                    if (game.tilelist[this.getRow() - 1][this.getColumn() - 1].getType() == 1) {
                        count++;
                    }
                    if (game.tilelist[this.getRow() - 1][this.getColumn()].getType() == 1) {
                        count++;
                    }
                    if (game.tilelist[this.getRow() - 1][this.getColumn() + 1].getType() == 1) {
                        count++;
                    }
                    if (game.tilelist[this.getRow()][this.getColumn() - 1].getType() == 1) {
                        count++;
                    }
                    if (game.tilelist[this.getRow()][this.getColumn() + 1].getType() == 1) {
                        count++;
                    }
                }
            } else if (this.getRow() == 0) {
                //top left
                if (this.getColumn() == 0) {
                    if (game.tilelist[this.getRow() + 1][this.getColumn()].getType() == 1) {
                        count++;
                    } else if (game.tilelist[this.getRow() + 1][this.getColumn() + 1].getType() == 1) {
                        count++;
                    } else if (game.tilelist[this.getRow()][this.getColumn() + 1].getType() == 1) {
                        count++;
                    }
                }

                //top right
                else if (this.getColumn() == 26) {
                    if (game.tilelist[this.getRow()][this.getColumn() - 1].getType() == 1) {
                        count++;
                    }
                    else if (game.tilelist[this.getRow() + 1][this.getColumn() - 1].getType() == 1) {
                        count++;
                    }
                    else if (game.tilelist[this.getRow() + 1][this.getColumn()].getType() == 1) {
                        count++;
                    }
                }

                //top not corners
                else {
                    if (game.tilelist[this.getRow()][this.getColumn() - 1].getType() == 1) {
                        count++;
                    }
                    if (game.tilelist[this.getRow() + 1][this.getColumn() - 1].getType() == 1) {
                        count++;
                    }
                    if (game.tilelist[this.getRow() + 1][this.getColumn()].getType() == 1) {
                        count++;
                    }
                    if (game.tilelist[this.getRow() + 1][this.getColumn() + 1].getType() == 1) {
                        count++;
                    }
                    if (game.tilelist[this.getRow()][this.getColumn() + 1].getType() == 1) {
                        count++;
                    }
                }
            }

            //left side
            else if (this.getColumn() == 0 && this.getRow() != 8 && this.getRow() != 0) {
                if (game.tilelist[this.getRow() - 1][this.getColumn()].getType() == 1) {
                    count++;
                }
                else if (game.tilelist[this.getRow() - 1][this.getColumn() + 1].getType() == 1) {
                    count++;
                }
                else if (game.tilelist[this.getRow()][this.getColumn() + 1].getType() == 1) {
                    count++;
                }
                else if (game.tilelist[this.getRow() + 1][this.getColumn() + 1].getType() == 1) {
                    count++;
                }
                else if (game.tilelist[this.getRow() + 1][this.getColumn()].getType() == 1) {
                    count++;
                }
            }

            //right side
            else if (this.getColumn() == 26 && this.getRow() != 8 && this.getRow() != 0) {
                if (game.tilelist[this.getRow() - 1][this.getColumn()].getType() == 1) {
                    count++;
                }
                else if (game.tilelist[this.getRow() - 1][this.getColumn() - 1].getType() == 1) {
                    count++;
                }
                else if (game.tilelist[this.getRow()][this.getColumn() - 1].getType() == 1) {
                    count++;
                }
                else if (game.tilelist[this.getRow() + 1][this.getColumn() - 1].getType() == 1) {
                    count++;
                }
                else if (game.tilelist[this.getRow() + 1][this.getColumn()].getType() == 1) {
                    count++;
                }
            }
            //Every block not on edge
            //top left
            if(this.getRow() > 0 && this.getRow() < 8 && this.getColumn() > 0 && this.getColumn() < 26 ) {
                if (game.tilelist[this.getRow() - 1][this.getColumn() - 1].getType() == 1) {
                    count++;
                }
                //top middle
                else if (game.tilelist[this.getRow() - 1][this.getColumn()].getType() == 1) {
                    count++;
                }
                //top right
                else if (game.tilelist[this.getRow() - 1][this.getColumn() + 1].getType() == 1) {
                    count++;
                }
                //middle left
                else if (game.tilelist[this.getRow()][this.getColumn() - 1].getType() == 1) {
                    count++;
                }
                //middle right
                else if (game.tilelist[this.getRow()][this.getColumn() + 1].getType() == 1) {
                    count++;
                }
                //bottom left
                else if (game.tilelist[this.getRow() + 1][this.getColumn() - 1].getType() == 1) {
                    count++;
                }
                //bottom middle
                else if (game.tilelist[this.getRow() + 1][this.getColumn()].getType() == 1) {
                    count++;
                }
                //bottom right
                else if (game.tilelist[this.getRow() + 1][this.getColumn() + 1].getType() == 1) {
                    count++;
                }
            }
            this.setText(count + "");
        }
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Object src = actionEvent.getSource();
        if(src==this) {
            if(this.getType() == 1){
                game.lose();
            }
        }
    }
}