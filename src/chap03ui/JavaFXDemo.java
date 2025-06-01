package chap03ui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFXDemo extends Application {
    @Override
    public void start(Stage primaryStage) {
        TextField nameField = new TextField();
        nameField.setPromptText("Enter your name");

        Button btn = new Button("Say Hello");
        btn.setOnAction(e -> {
            String name = nameField.getText().trim();
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            if (!name.isEmpty()) {
                alert.setContentText("Hello, " + name + "!");
            } else {
                alert.setContentText("Please enter your name.");
            }
            alert.showAndWait();
        });

        VBox root = new VBox(10, nameField, btn);
        root.setStyle("-fx-padding: 20; -fx-alignment: center;");

        Scene scene = new Scene(root, 300, 200);

        primaryStage.setTitle("JavaFX Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}