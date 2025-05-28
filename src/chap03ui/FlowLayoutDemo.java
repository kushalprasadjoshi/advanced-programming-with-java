package chap03ui;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutDemo extends JFrame {
    FlowLayoutDemo() {
        setTitle("FlowLayout Example");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Set FlowLayout
        setLayout(new FlowLayout());

        // Add components
        add(new JButton("Button 1"));
        add(new JButton("Button 2"));
        add(new JButton("Button 3"));

        setVisible(true);
    }

    public static void main(String[] args) {
        new FlowLayoutDemo();
    }
}