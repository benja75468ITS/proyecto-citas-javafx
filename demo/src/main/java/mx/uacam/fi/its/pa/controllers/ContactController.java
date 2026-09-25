package mx.uacam.fi.its.pa.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import mx.uacam.fi.its.pa.utils.SceneManager;

public class ContactController {

    @FXML
    private ComboBox<String> contactMethod;

    @FXML
    private TextArea messageArea;

    @FXML
    public void initialize() {
        contactMethod.getItems().addAll("En persona", "Teléfono", "Correo", "Redes Sociales", "Telegram");
    }

    @FXML
    void goBack(ActionEvent event) {
        SceneManager.switchScene("MainFeed.fxml", "Perfiles Cercanos");
    }

    @FXML
    void sendMessage(ActionEvent event) {
        System.out.println("Mensaje enviado vía: " + contactMethod.getValue());
        SceneManager.switchScene("MainFeed.fxml", "Perfiles Cercanos");
    }
}