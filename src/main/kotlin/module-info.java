module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;
    requires javafx.swing;


    opens com.example.demo to javafx.fxml;
    exports com.example.demo;
}