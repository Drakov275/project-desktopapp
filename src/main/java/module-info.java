module com.example.interactivecalendar {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.interactivecalendar to javafx.fxml;
    exports com.example.interactivecalendar;
}