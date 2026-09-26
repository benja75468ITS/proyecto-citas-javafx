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
@FXML
    private javafx.scene.control.Button btnVerEquipo;

    @FXML
    private void handleIrAEquipo(javafx.event.ActionEvent event) {
        try {
            javafx.fxml.FXMLLoader loader = new javafx.fxml.FXMLLoader(getClass().getResource("/views/TeamView.fxml"));
            javafx.scene.Parent root = loader.load();
            
            javafx.stage.Stage stage = (javafx.stage.Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
            stage.setScene(new javafx.scene.Scene(root));
            stage.setTitle("Integrantes del Equipo");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}