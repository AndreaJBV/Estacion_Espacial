module com.example.estacionespacial_sofka {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.desktop;


    //opens Controlador to javafx.fxml;
    opens com.estacionespacial_sofka to javafx.fxml;
    exports com.estacionespacial_sofka;
    exports com.estacionespacial_sofka.Controlador;
    opens com.estacionespacial_sofka.Controlador to javafx.fxml;
}