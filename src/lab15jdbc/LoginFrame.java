package lab15jdbc;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * JavaFX UI for user registration.
 * Provides fields for ID, Name, Email, and Password.
 * Handles user registration and displays messages for success or duplicate users.
 */
public class LoginFrame extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("User Registration");

        // Create and configure the layout grid
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20));
        grid.setVgap(10);
        grid.setHgap(10);

        // ID label and text field
        Label idLabel = new Label("ID:");
        TextField idField = new TextField();
        grid.add(idLabel, 0, 0);
        grid.add(idField, 1, 0);

        // Name label and text field
        Label nameLabel = new Label("Name:");
        TextField nameField = new TextField();
        grid.add(nameLabel, 0, 1);
        grid.add(nameField, 1, 1);

        // Email label and text field
        Label emailLabel = new Label("Email:");
        TextField emailField = new TextField();
        grid.add(emailLabel, 0, 2);
        grid.add(emailField, 1, 2);

        // Password label and password field
        Label passwdLabel = new Label("Password:");
        PasswordField passwdField = new PasswordField();
        grid.add(passwdLabel, 0, 3);
        grid.add(passwdField, 1, 3);

        // Register button
        Button registerButton = new Button("Register");
        grid.add(registerButton, 1, 4);

        // Message label for feedback
        Label messageLabel = new Label();
        grid.add(messageLabel, 1, 5);

        // Event handler for register button using lambda expression
        registerButton.setOnAction(e -> {
            String id = idField.getText();
            String name = nameField.getText();
            String email = emailField.getText();
            String password = passwdField.getText();

            UserDAO userDAO = new UserDAO();
            // Check if user already exists
            if (userDAO.userExists(id)) {
                messageLabel.setText("User already exists!");
            } else {
                // Insert new user and show success message
                userDAO.insertUser(id, name, email, password);
                messageLabel.setText("User registered successfully!");
            }
        });

        // Set up the scene and show the stage
        Scene scene = new Scene(grid, 350, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        // Create a database
        DatabaseCreator.createDatabase("mydatabase");
        // Ensure users table exists before launching the UI
        DatabaseHelper.createTable();
        launch(args);
    }
}