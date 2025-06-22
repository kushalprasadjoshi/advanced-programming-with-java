package chap03ui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class LayoutDemoFX extends Application {
    @Override
    public void start(Stage stage) {
        // HBox
        HBox hbox = new HBox(10, new Button("HBox 1"), new Button("HBox 2"));

        // VBox
        VBox vbox = new VBox(10, new Label("VBox 1"), new Label("VBox 2"));

        // GridPane
        GridPane grid = new GridPane();
        grid.add(new Label("Row 0, Col 0"), 0, 0);
        grid.add(new Label("Row 0, Col 1"), 1, 0);
        grid.add(new Label("Row 1, Col 0"), 0, 1);
        grid.add(new Label("Row 1, Col 1"), 1, 1);

        // BorderPane
        BorderPane borderPane = new BorderPane();
        borderPane.setTop(hbox);
        borderPane.setLeft(vbox);
        borderPane.setCenter(grid);

        Scene scene = new Scene(borderPane, 400, 250);
        stage.setTitle("JavaFX Layouts Demo");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) { launch(args); }
}