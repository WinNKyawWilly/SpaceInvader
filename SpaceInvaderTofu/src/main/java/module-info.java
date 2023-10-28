module com.se233.spaceinvadertofu {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;


    opens com.se233.spaceinvadertofu to javafx.fxml;
    exports com.se233.spaceinvadertofu;
}