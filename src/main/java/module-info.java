module com.example.fc_10_1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fc_10_1 to javafx.fxml;
    exports com.example.fc_10_1;
}