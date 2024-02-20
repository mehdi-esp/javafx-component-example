package tn.maakmed.components;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

import java.io.IOException;

import tn.maakmed.entities.Medication;

public class MedicationCard extends VBox {

    public MedicationCard() throws IOException {
        // Load the FXML file
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("medication-card.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        fxmlLoader.load();
    }


    public MedicationCard(
            Medication medication
    ) throws IOException {
        this();
        setDescription(medication.getDescription());
        setName(medication.getName());
        setInsured(medication.isInsured());
    }

    @FXML
    private Text description;

    @FXML
    private CheckBox insured;

    @FXML
    private Label name;

    @FXML
    void initialize() {
        // disabling the checkbox
        insured.addEventFilter(MouseEvent.MOUSE_PRESSED, MouseEvent::consume);
        insured.addEventFilter(MouseEvent.MOUSE_RELEASED, MouseEvent::consume);
    }

    public String getName() {
        return name.getText();
    }

    public void setName(String name) {
        this.name.setText(name);
    }

    public String getDescription() {
        return description.getText();
    }

    public void setDescription(String description) {
        this.description.setText(description);
    }

    public boolean isInsured() {
        return insured.isSelected();
    }

    public void setInsured(boolean insured) {
        this.insured.setSelected(insured);
    }
}
