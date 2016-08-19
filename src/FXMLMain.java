import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.time.YearMonth;

public class FXMLMain extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("fullCalendar.fxml"));
        primaryStage.setTitle("Full Calendar FXML Example");
        primaryStage.setScene(new Scene(loader.load()));
        // Get the controller and add the calendar view to it
        Controller controller = loader.getController();
        controller.calendarPane.getChildren().add(new FullCalendarView(YearMonth.now()).getView());
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
