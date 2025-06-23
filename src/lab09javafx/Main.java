package lab09javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        SumCalculator calculator = new SumCalculator();
        Scene scene = new Scene(calculator.getView(), 300, 200);
        primaryStage.setTitle("Sum Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}