package mx.uacam.fi.its.pa.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import mx.uacam.fi.its.pa.utils.SceneManager;

public class TeamController {

    @FXML
    private void handleRegresar(ActionEvent event) {
        try {
            SceneManager.switchScene("MainFeed.fxml", "Sistema de Citas - Menú Principal");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al regresar al menú principal: " + e.getMessage());
        }
    }
}