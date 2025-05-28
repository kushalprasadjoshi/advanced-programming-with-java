package chap03ui;

import javax.swing.*;
import java.awt.*;

public class FrameWithBackground extends JFrame {
    FrameWithBackground() {
        setTitle("Frame with Background Color");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Set background color
        getContentPane().setBackground(Color.CYAN);

        setVisible(true);
    }

    public static void main(String[] args) {
        new FrameWithBackground();
    }
}