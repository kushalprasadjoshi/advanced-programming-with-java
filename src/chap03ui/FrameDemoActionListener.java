package chap03ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FrameDemoActionListener extends JFrame implements ActionListener {
    // Declare components
    JLabel userL, passL;
    JTextField userT, passT;
    JButton loginB;

    FrameDemoActionListener() {
        // Initialize components
        userL = new JLabel("Username:");
        passL = new JLabel("Password:");
        userT = new JTextField(20);
        passT = new JTextField(20);
        loginB = new JButton("Login");

        // Add ActionListener to login button
        loginB.addActionListener(this);

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

    // Override the ActionListener method -> Compulsory
    @Override
    public void actionPerformed(ActionEvent e) {
        String name = userT.getText();
        String passwd = passT.getText();

        if(name.equals("Test") && passwd.equals("Test")) {
            JOptionPane.showMessageDialog(this, "Login success!");
        } else {
            JOptionPane.showMessageDialog(this, "Invalid");
        }
    }

    public static void main(String[] args) {
        new FrameDemoActionListener();
    }
}
