package sample.fullCalendar;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

public class Controller {

    @FXML
    AnchorPane calendar_anchorpane;

    @FXML
    GridPane calendar_gridpane;

    public void printChildren() {
        System.out.println("Anchor pane Children");
        System.out.println(calendar_anchorpane.getChildren());
        System.out.println("Grid pane children");
        System.out.println(calendar_gridpane);

//        for (Node node : calendar_gridpane.getChildren()) {
//            System.out.println();
//        }
    }

}
