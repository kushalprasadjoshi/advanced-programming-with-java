package chap03ui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TextAreaDemoFX extends Application {
    @Override
    public void start(Stage stage) {
        TextArea textArea = new TextArea();
        textArea.setPromptText("Enter your comments here...");
        textArea.setPrefRowCount(6);

        Button btn = new Button("Show Text");
        btn.setOnAction(e -> {
            String content = textArea.getText();
            new Alert(Alert.AlertType.INFORMATION, "You entered:\n" + content).showAndWait();
        });

        VBox root = new VBox(10, textArea, btn);
        root.setStyle("-fx-padding: 20;");
        stage.setScene(new Scene(root, 350, 200));
        stage.setTitle("JavaFX TextArea Example");
        stage.show();
    }
    public static void main(String[] args) { launch(args); }
}
