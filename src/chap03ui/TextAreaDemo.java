package chap03ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TextAreaDemo extends JFrame implements ActionListener {
    JTextArea textArea;
    JButton showButton;

    TextAreaDemo() {
        setTitle("JTextArea Example");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        textArea = new JTextArea(8, 30);
        JScrollPane scrollPane = new JScrollPane(textArea);

        showButton = new JButton("Show Text");
        showButton.addActionListener(this);

        add(scrollPane);
        add(showButton);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String content = textArea.getText();
        JOptionPane.showMessageDialog(this, "You entered:\n" + content);
    }

    public static void main(String[] args) {
        new TextAreaDemo();
    }
}