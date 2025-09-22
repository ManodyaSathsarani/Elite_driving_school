module edu.ijse.elite_driving_schoolorm {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.ijse.elite_driving_schoolorm to javafx.fxml;
    exports edu.ijse.elite_driving_schoolorm;
}