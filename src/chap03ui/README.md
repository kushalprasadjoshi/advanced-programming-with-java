# Chapter 3: Building Components Using Swing and JavaFX

## Java Based UI (User Interface)

### Applet

An **applet** is a small Java program that runs within a web browser or an applet viewer. Applets are subclasses of `java.applet.Applet` and are primarily used for creating interactive features on web pages. However, applets are now considered obsolete due to security concerns and lack of browser support. Depricated from JDK 9 and removed from JDK 17.

### AWT (Abstract Window Toolkit)

**AWT** is Java's original platform-dependent windowing, graphics, and user-interface widget toolkit. It provides classes for creating and managing graphical user interface (GUI) components such as windows, buttons, text fields, and event handling. AWT components rely on the underlying native system, which can lead to inconsistencies across platforms. For more advanced and consistent GUIs, Swing and JavaFX are preferred.

### Swing

![AWT Container Component](https://www3.ntu.edu.sg/home/ehchua/programming/java/images/AWT_ContainerComponent.png)

**Swing** is a part of Java's standard library that provides a rich set of GUI components for building platform-independent desktop applications. Unlike AWT, Swing components are lightweight and written entirely in Java, ensuring consistent behavior across different operating systems. Swing offers advanced features such as pluggable look-and-feel, MVC architecture, and support for complex widgets like tables, trees, and text components. The main class for creating windows in Swing is `javax.swing.JFrame`. Swing remains widely used for desktop application development, though JavaFX is now the preferred choice for modern UIs.

#### Example

```java
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
```

**Output:**
![FrameDemo](../../assets/chap03ui/FrameDemo.png)

### JavaFX

**JavaFX** is a modern Java library for building rich, visually appealing user interfaces for desktop applications. It provides a wide range of UI controls, CSS styling, animation, and multimedia capabilities. JavaFX applications use a scene graph architecture, where the UI is structured as a hierarchy of nodes. Layouts, controls, shapes, and effects can be combined to create complex interfaces. JavaFX supports FXML, an XML-based language for defining UI layouts, and integrates well with Java code. Since JDK 11, JavaFX is distributed as a separate module from the JDK, allowing for modular application development. JavaFX is the recommended toolkit for new Java desktop applications.

---

## Event Handling

### What is Event Handling?

**Event handling** in Java refers to the mechanism that controls the response to user actions such as clicks, key presses, mouse movements, or other interactions with GUI components. In Java, event handling is based on the **event delegation model**, which separates event generation from event handling.

### Event Delegation Model

![Event Delegation Model in Java](https://dotnettutorials.net/wp-content/uploads/2020/08/Event-Delegation-Model-in-Java.png)

- **Event Source:** The component (e.g., button, text field) that generates an event.
- **Event Object:** An instance of a class (like `ActionEvent`, `MouseEvent`) that encapsulates information about the event.
- **Event Listener:** An interface that defines methods to handle specific types of events (e.g., `ActionListener`, `MouseListener`). Listeners are registered with event sources.

### Example: Handling Button Click in Swing

```java
JButton button = new JButton("Click Me");
button.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button was clicked!");
    }
});
```

In this example, when the button is clicked, the `actionPerformed` method is called, and the message is printed.

### ActionListener Interface

The `ActionListener` interface is a part of the `java.awt.event` package and is used for receiving action events, such as button clicks. It contains a single method, `actionPerformed(ActionEvent e)`, which must be implemented to define the action to be performed when an event occurs. Components like `JButton`, `JMenuItem`, and others generate action events and allow you to register an `ActionListener` to handle these events. Implementing this interface enables you to specify custom behavior in response to user interactions.

**Example:**
```java
button.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        // Handle button click
    }
});
```

**Program:**
```java
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
```

**Output:**
![FrameDemoActionListener](../../assets/chap03ui/FrameDemoActionListener.png)

### Key Points

- Java provides various listener interfaces for different event types.
- You must register a listener with a component to handle its events.
- Event handling is essential for interactive GUI applications.
- Both Swing and JavaFX use event-driven programming models, though JavaFX uses lambda expressions and property bindings for more concise code.

---
