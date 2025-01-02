module org.example.kalkulatorsederhana {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.kalkulatorsederhana to javafx.fxml;
    exports org.example.kalkulatorsederhana;
}