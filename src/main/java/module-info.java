module com.example.studentmanger {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.studentmanger to javafx.fxml;
    exports com.example.studentmanger;
}