package chap03ui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ComboBoxDemoFX extends Application {
    @Override
    public void start(Stage stage) {
        ComboBox<String> comboBox = new ComboBox<>();
        comboBox.getItems().addAll("Java", "Python", "C++", "JavaScript");
        comboBox.setPromptText("Select Language");

        Button btn = new Button("Show Selected");
        btn.setOnAction(e -> {
            String selected = comboBox.getValue();
            String msg = (selected != null) ? selected : "None";
            new Alert(Alert.AlertType.INFORMATION, "Selected: " + msg).showAndWait();
        });

        VBox root = new VBox(10, comboBox, btn);
        root.setStyle("-fx-padding: 20;");
        stage.setScene(new Scene(root, 300, 120));
        stage.setTitle("JavaFX ComboBox Example");
        stage.show();
    }
    public static void main(String[] args) { launch(args); }
}
