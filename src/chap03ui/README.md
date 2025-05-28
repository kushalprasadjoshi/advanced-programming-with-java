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

## Creating Menus in Swing

Swing provides the `JMenuBar`, `JMenu`, and `JMenuItem` classes to create menus for desktop applications. Menus are typically placed at the top of a window and allow users to perform actions such as opening files, saving, or exiting the application.

### Example: Adding a Menu Bar

```java
package chap03ui;

import javax.swing.*;

public class MenuDemo extends JFrame {
    MenuDemo() {
        // Create menu bar
        JMenuBar menuBar = new JMenuBar();

        // Create menus
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");

        // Create menu items
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem exitItem = new JMenuItem("Exit");

        // Add menu items to File menu
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);

        // Add menus to menu bar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);

        // Set the menu bar for the frame
        setJMenuBar(menuBar);

        // Add action listener for Exit
        exitItem.addActionListener(e -> System.exit(0));

        setSize(300, 200);
        setTitle("Menu Demo");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MenuDemo();
    }
}
```

**Output:**

![MenuDemo](../../assets/chap03ui/MenuDemo.png)

**Note:** Menus enhance usability by organizing commands and actions in a structured way. You can add more menus and items as needed, and attach action listeners to handle user interactions.


### Setting Background Color of a JFrame

You can set the background color of a JFrame by accessing its content pane and using the `setBackground` method. For example:

```java
getContentPane().setBackground(Color.LIGHT_GRAY);
```

#### Example: Setting Background Color

```java
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
```

**Output:**

![FrameWithBackground](../../assets/chap03ui/FrameWithBackground.png)


### Example: Menu With Actions

```java
package chap03ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuWIthActions extends JFrame implements ActionListener {
    JMenuBar jmb;
    JMenu col;
    JMenuItem blue, red, green;

    MenuWIthActions() {
        jmb = new JMenuBar();
        col = new JMenu("Color");
        blue = new JMenuItem("BLue");
        red = new JMenuItem("Red");
        green = new JMenuItem("Green");

        col.add(blue);
        col.add(red);
        col.add(green);

        blue.addActionListener(this);
        red.addActionListener(this);
        green.addActionListener(this);

        jmb.add(col);
        setJMenuBar(jmb);

        setSize(400, 400);
        setTitle("Menu Frame");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == blue) {
            this.getContentPane().setBackground(Color.BLUE);
        } else if (e.getSource() == red) {
            this.getContentPane().setBackground(Color.RED);
        } else if (e.getSource() == green) {
            this.getContentPane().setBackground(Color.GREEN);
        }
    }

    public static void main(String[] args) {
        new MenuWIthActions();
    }
}
```

**Output:**

![MenuWithActions](../../assets/chap03ui/MenuWithActions.png)

---

## Setting Tool Tip Text of Components

Tool tips provide helpful hints or descriptions when the user hovers the mouse pointer over a component. In Swing, you can set a tool tip for any component by calling the `setToolTipText(String text)` method.

**Example:**

```java
JButton button = new JButton("Hover Me");
button.setToolTipText("Click this button to perform an action");
```

When the user moves the mouse over the button, the specified text will appear in a small pop-up box.

**Key Points:**
- Tool tips enhance user experience by providing contextual information.
- Most Swing components support tool tips.
- Tool tips can be set or changed at runtime.

**Output:**

When hovering over the button, a small pop-up displays:  
`Click this button to perform an action`

---

## Layout Manager in Swing

A **layout manager** in Swing is an object that controls the size and position of components within a container (such as a `JFrame` or `JPanel`). Layout managers automate the arrangement of components, making GUIs flexible and adaptable to different screen sizes and resolutions. Swing provides several built-in layout managers, including `FlowLayout`, `BorderLayout`, `GridLayout`, and others.

### Common Layout Managers

- **FlowLayout:** Arranges components in a left-to-right flow, much like lines of text in a paragraph.
- **BorderLayout:** Divides the container into five regions: North, South, East, West, and Center.
- **GridLayout:** Arranges components in a grid of rows and columns.
- **GridBagLayout:** Provides a flexible and complex way to arrange components in a grid of rows and columns, allowing components to span multiple rows or columns and have different sizes. It is the most powerful and customizable layout manager in Swing, suitable for advanced layouts where precise control is needed.
- **CardLayout:** Allows multiple components (cards) to share the same display space, showing only one at a time. It's useful for implementing wizards, tabbed panes, or step-by-step interfaces where you need to switch between different panels dynamically.
- **BoxLayout:** Arranges components either vertically or horizontally.

### Example: Using FlowLayout

```java
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
```

**Output:**

![FlowLayoutDemo](../../assets/chap03ui/FlowLayoutDemo.png)

### Example: Using GridLayout

```java
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
```

**Output:**

![GridLayoutDemo](../../assets/chap03ui/GridLayoutDemo.png)

**Note:**  
Choosing the right layout manager is essential for creating user-friendly and responsive GUIs. You can also nest containers with different layout managers for more complex interfaces.

---

