module com.example.quizapplication {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.quizapplication to javafx.fxml;
    exports com.example.quizapplication;
}