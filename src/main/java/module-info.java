module tn.maakmed.componentdiscovery {
    requires javafx.controls;
    requires javafx.fxml;

    opens tn.maakmed.components to javafx.fxml;
    exports tn.maakmed.components;

    exports tn.maakmed.entities;
    exports tn.maakmed.controllers;
    opens tn.maakmed.controllers to javafx.fxml;
    exports tn.maakmed.main;
    opens tn.maakmed.main to javafx.fxml;
}