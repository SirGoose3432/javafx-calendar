package sample.fullCalendar;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.time.YearMonth;

public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        YearMonth yearMonth = YearMonth.now();
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(new FullCalendarView(yearMonth).getView()));
        primaryStage.show();
    }



    public static void main(String[] args) {
        launch(args);
    }
}
