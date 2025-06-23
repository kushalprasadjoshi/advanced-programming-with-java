package lab10gridpane;

import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;

public class GridPaneExample {
    public GridPane createGridPane() {
        GridPane grid = new GridPane();

        Button btn1 = new Button("Button 1");
        Button btn2 = new Button("Button 2");
        Button btn3 = new Button("Button 3");
        Button btn4 = new Button("Button 4");

        grid.add(btn1, 0, 0);
        grid.add(btn2, 1, 0);
        grid.add(btn3, 0, 1);
        grid.add(btn4, 1, 1);

        grid.setHgap(10);
        grid.setVgap(10);

        return grid;
    }
}