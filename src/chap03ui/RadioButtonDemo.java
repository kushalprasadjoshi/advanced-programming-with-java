package chap03ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RadioButtonDemo extends JFrame implements ActionListener {
    JRadioButton male, female, other;
    JButton submit;

    RadioButtonDemo() {
        setTitle("JRadioButton Example");
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        other = new JRadioButton("Other");

        // Group the radio buttons
        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);
        bg.add(other);

        submit = new JButton("Submit");
        submit.addActionListener(this);

        add(male);
        add(female);
        add(other);
        add(submit);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String msg = "Selected: ";
        if (male.isSelected()) msg += "Male";
        else if (female.isSelected()) msg += "Female";
        else if (other.isSelected()) msg += "Other";
        else msg += "None";
        JOptionPane.showMessageDialog(this, msg);
    }

    public static void main(String[] args) {
        new RadioButtonDemo();
    }
}