package chap03ui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CheckBoxDemoFX extends Application {
    @Override
    public void start(Stage stage) {
        CheckBox cb1 = new CheckBox("Java");
        CheckBox cb2 = new CheckBox("Python");
        CheckBox cb3 = new CheckBox("C++");

        Button btn = new Button("Show Selected");
        btn.setOnAction(e -> {
            StringBuilder sb = new StringBuilder("Selected: ");
            if (cb1.isSelected()) sb.append("Java ");
            if (cb2.isSelected()) sb.append("Python ");
            if (cb3.isSelected()) sb.append("C++ ");
            if (!cb1.isSelected() && !cb2.isSelected() && !cb3.isSelected()) sb.append("None");
            new Alert(Alert.AlertType.INFORMATION, sb.toString()).showAndWait();
        });

        VBox root = new VBox(10, cb1, cb2, cb3, btn);
        root.setStyle("-fx-padding: 20;");
        stage.setScene(new Scene(root));
        stage.setTitle("JavaFX CheckBox Example");
        stage.show();
    }
    public static void main(String[] args) { launch(args); }
}
