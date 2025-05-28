package chap03ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ComboBoxDemo extends JFrame implements ActionListener {
    JComboBox<String> languageBox;
    JButton showButton;

    ComboBoxDemo() {
        setTitle("JComboBox Example");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        String[] languages = {"Java", "Python", "C++", "JavaScript"};
        languageBox = new JComboBox<>(languages);

        showButton = new JButton("Show Selected");
        showButton.addActionListener(this);

        add(languageBox);
        add(showButton);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String selected = (String) languageBox.getSelectedItem();
        JOptionPane.showMessageDialog(this, "Selected: " + selected);
    }

    public static void main(String[] args) {
        new ComboBoxDemo();
    }
}