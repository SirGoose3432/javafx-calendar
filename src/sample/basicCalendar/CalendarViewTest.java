package sample.basicCalendar;
import java.util.Locale;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListCell;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class CalendarViewTest extends Application {

    @Override
    public void start(Stage primaryStage) {
        CalendarView calendarView = new CalendarView() ;

        Button next = new Button(">");
        next.setOnAction(e -> calendarView.nextMonth());

        Button previous = new Button("<");
        previous.setOnAction(e -> calendarView.previousMonth());

        ComboBox<Locale> localeCombo = new ComboBox<>();
        localeCombo.getItems().addAll(Locale.getAvailableLocales());
        localeCombo.setValue(Locale.getDefault());

        localeCombo.setCellFactory(lv -> new LocaleCell());
        localeCombo.setButtonCell(new LocaleCell());

        calendarView.localeProperty().bind(localeCombo.valueProperty());

        BorderPane.setAlignment(localeCombo, Pos.CENTER);
        BorderPane.setMargin(localeCombo, new Insets(10));

        BorderPane root = new BorderPane(calendarView.getView(), localeCombo, next, null, previous);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static class LocaleCell extends ListCell<Locale> {
        @Override
        public void updateItem(Locale locale, boolean empty) {
            super.updateItem(locale, empty);
            setText(locale == null ? null : locale.getDisplayName(locale));
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}