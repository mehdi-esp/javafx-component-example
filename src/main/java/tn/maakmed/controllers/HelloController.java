package tn.maakmed.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import tn.maakmed.components.MedicationCard;
import tn.maakmed.entities.Medication;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HelloController {

    @FXML
    private VBox list;

    @FXML
    private TilePane tile;

    final private static List<Medication> meds = new ArrayList<>(Arrays.asList(
            new Medication("Aspirin", "For headaches", true),
            new Medication("Ibuprofen", "For pain", true),
            new Medication("Tylenol", "For fever", false),
            new Medication("Advil", "For pain", true),
            new Medication("Aleve", "For pain", false),
            new Medication("Benadryl", "For allergies", true),
            new Medication("Claritin", "For allergies", false),
            new Medication("Zyrtec", "For allergies", true),
            new Medication("Allegra", "For allergies", false),
            new Medication("Flonase", "For allergies", true)
    ));

    @FXML
    void addMed(ActionEvent event) throws IOException {

        // add a random medication and remove it from the list

        if (meds.isEmpty()) return;

        Medication medication = meds.remove((int) (Math.random() * meds.size()));

        MedicationCard medicationCard = new MedicationCard(
                medication
        );
        tile.getChildren().add(medicationCard);
    }
}