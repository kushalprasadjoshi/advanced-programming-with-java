package chap03ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CheckBoxDemo extends JFrame implements ActionListener {
    JCheckBox java, python, cpp;
    JButton submit;

    CheckBoxDemo() {
        setTitle("JCheckBox Example");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        java = new JCheckBox("Java");
        python = new JCheckBox("Python");
        cpp = new JCheckBox("C++");

        submit = new JButton("Submit");
        submit.addActionListener(this);

        add(java);
        add(python);
        add(cpp);
        add(submit);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String msg = "Selected: ";
        if (java.isSelected()) msg += "Java ";
        if (python.isSelected()) msg += "Python ";
        if (cpp.isSelected()) msg += "C++ ";
        if (!java.isSelected() && !python.isSelected() && !cpp.isSelected()) msg += "None";
        JOptionPane.showMessageDialog(this, msg);
    }

    public static void main(String[] args) {
        new CheckBoxDemo();
    }
}