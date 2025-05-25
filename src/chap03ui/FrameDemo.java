package chap03ui;

import javax.swing.*;
import java.awt.*;

public class FrameDemo extends JFrame {
    // Declare components
    JLabel userL, passL;
    JTextField userT, passT;
    JButton loginB;

    FrameDemo() {
        // Initialize components
        userL = new JLabel("Username:");
        passL = new JLabel("Password:");
        userT = new JTextField(20);
        passT = new JTextField(20);
        loginB = new JButton("Login");

        // Add components
        add(userL);
        add(userT);
        add(passL);
        add(passT);
        add(loginB);

        // Define layout
        setLayout(new FlowLayout());
        setSize(400, 400);
        setTitle("Login Frame");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FrameDemo();
    }
}
