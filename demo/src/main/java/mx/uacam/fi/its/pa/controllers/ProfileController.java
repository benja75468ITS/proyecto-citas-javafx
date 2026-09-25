package mx.uacam.fi.its.pa.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import mx.uacam.fi.its.pa.utils.SceneManager;

public class ProfileController {

    @FXML
    private TextField hobbiesField;

    @FXML
    private TextField techField;

    @FXML
    private TextArea bioArea;

    @FXML
    void goBack(ActionEvent event) {
        SceneManager.switchScene("MainFeed.fxml", "Perfiles Cercanos");
    }

    @FXML
    void saveProfile(ActionEvent event) {
        System.out.println("Perfil actualizado correctamente.");
        SceneManager.switchScene("MainFeed.fxml", "Perfiles Cercanos");
    }
}