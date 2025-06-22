package chap03ui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class RadioButtonDemoFX extends Application {
    @Override
    public void start(Stage stage) {
        RadioButton rb1 = new RadioButton("Option 1");
        RadioButton rb2 = new RadioButton("Option 2");
        RadioButton rb3 = new RadioButton("Option 3");

        ToggleGroup group = new ToggleGroup();
        rb1.setToggleGroup(group);
        rb2.setToggleGroup(group);
        rb3.setToggleGroup(group);

        Button btn = new Button("Show Selected");
        btn.setOnAction(e -> {
            RadioButton selected = (RadioButton) group.getSelectedToggle();
            String msg = (selected != null) ? selected.getText() : "None";
            new Alert(Alert.AlertType.INFORMATION, "Selected: " + msg).showAndWait();
        });

        VBox root = new VBox(10, rb1, rb2, rb3, btn);
        root.setStyle("-fx-padding: 20;");
        stage.setScene(new Scene(root));
        stage.setTitle("JavaFX RadioButton Example");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}