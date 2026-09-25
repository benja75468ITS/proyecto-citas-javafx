package mx.uacam.fi.its.pa.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import mx.uacam.fi.its.pa.utils.SceneManager;

public class InboxController {

    @FXML
    private VBox messageBox;

    @FXML
    private HBox actionButtons;

    @FXML
    private Label contactInfoLabel;

    @FXML
    void goBack(ActionEvent event) {
        SceneManager.switchScene("MainFeed.fxml", "Perfiles Cercanos");
    }

    @FXML
    void acceptRequest(ActionEvent event) {
        // Oculta los botones y muestra los datos de contacto
        actionButtons.setVisible(false);
        actionButtons.setManaged(false);
        
        contactInfoLabel.setVisible(true);
        contactInfoLabel.setManaged(true);
    }

    @FXML
    void rejectRequest(ActionEvent event) {
        // Oculta el mensaje completo
        messageBox.setVisible(false);
        messageBox.setManaged(false);
    }
}