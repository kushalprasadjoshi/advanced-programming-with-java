package chap03ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GridLayoutDemo extends JFrame implements ActionListener {
    JButton one, two, three, four;

    GridLayoutDemo() {
        one = new JButton("One");
        two = new JButton("Two");
        three = new JButton("Three");
        four = new JButton("Four");

        one.addActionListener(this);
        two.addActionListener(this);
        three.addActionListener(this);
        four.addActionListener(this);

        setLayout(new GridLayout(2, 2));
        add(one);
        add(two);
        add(three);
        add(four);

        setSize(400, 400);
        setVisible(true);
        setTitle("Grid Layout");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Random random = new Random();
        int number = random.nextInt(5);

        if(e.getSource() == one) {
            if (number == 1) {
                JOptionPane.showMessageDialog(this, "You got it right!");
            } else {
                JOptionPane.showMessageDialog(this, "You got it wrong!");
            }
        }

        if(e.getSource() == two) {
            if (number == 2) {
                JOptionPane.showMessageDialog(this, "You got it right!");
            } else {
                JOptionPane.showMessageDialog(this, "You got it wrong!");
            }
        }

        if(e.getSource() == three) {
            if (number == 3) {
                JOptionPane.showMessageDialog(this, "You got it right!");
            } else {
                JOptionPane.showMessageDialog(this, "You got it wrong!");
            }
        }

        if(e.getSource() == four) {
            if (number == 4) {
                JOptionPane.showMessageDialog(this, "You got it right!");
            } else {
                JOptionPane.showMessageDialog(this, "You got it wrong!");
            }
        }
    }

    public static void main(String[] args) {
        new GridLayoutDemo();
    }
}
