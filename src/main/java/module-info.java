module com.example.big_project1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.big_project1 to javafx.fxml;
    exports com.example.big_project1;
}