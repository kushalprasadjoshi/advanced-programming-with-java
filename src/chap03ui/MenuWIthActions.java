package chap03ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuWIthActions extends JFrame implements ActionListener {
    JMenuBar jmb;
    JMenu col;
    JMenuItem blue, red, green;

    MenuWIthActions() {
        jmb = new JMenuBar();
        col = new JMenu("Color");
        blue = new JMenuItem("BLue");
        red = new JMenuItem("Red");
        green = new JMenuItem("Green");

        col.add(blue);
        col.add(red);
        col.add(green);

        blue.addActionListener(this);
        red.addActionListener(this);
        green.addActionListener(this);

        jmb.add(col);
        setJMenuBar(jmb);

        setSize(400, 400);
        setTitle("Menu Frame");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == blue) {
            this.getContentPane().setBackground(Color.BLUE);
        } else if (e.getSource() == red) {
            this.getContentPane().setBackground(Color.RED);
        } else if (e.getSource() == green) {
            this.getContentPane().setBackground(Color.GREEN);
        }
    }

    public static void main(String[] args) {
        new MenuWIthActions();
    }
}
