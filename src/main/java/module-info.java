module com.sofka.software.introduccionjava {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.sofka.software.introduccionjava to javafx.fxml;
    exports com.sofka.software.introduccionjava;
}