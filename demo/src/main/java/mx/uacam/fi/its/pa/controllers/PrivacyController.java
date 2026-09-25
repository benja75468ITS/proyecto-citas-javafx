package mx.uacam.fi.its.pa.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import mx.uacam.fi.its.pa.utils.SceneManager;

public class PrivacyController {

    @FXML
    void acceptTerms(ActionEvent event) {
        System.out.println("Términos aceptados. Avanzando al registro...");
        // Transición a la vista de registro mínimo
        SceneManager.switchScene("Register.fxml", "Registro Mínimo");
    }

    @FXML
    void declineTerms(ActionEvent event) {
        System.out.println("El usuario no aceptó los términos.");
        System.exit(0); // Sale de la app si no acepta
    }
}