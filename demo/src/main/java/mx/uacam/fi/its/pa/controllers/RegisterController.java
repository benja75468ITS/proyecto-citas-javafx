package mx.uacam.fi.its.pa.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import java.io.File;
import mx.uacam.fi.its.pa.utils.SceneManager;
import mx.uacam.fi.its.pa.utils.Session;

public class RegisterController {

    @FXML
    private TextField nameField;

    @FXML
    private TextField zipCodeField;
    
    @FXML
    private ImageView profileImage;

    @FXML
    void uploadPhoto(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Seleccionar Foto de Perfil");
        fileChooser.getExtensionFilters().addAll(
            new FileChooser.ExtensionFilter("Imágenes", "*.png", "*.jpg", "*.jpeg", "*.gif")
        );
        
        // Abre la ventana de archivos de Mac
        File selectedFile = fileChooser.showOpenDialog(null);
        
        if (selectedFile != null) {
            String imageUri = selectedFile.toURI().toString();
            profileImage.setImage(new Image(imageUri));
            Session.imagePath = imageUri; // Guardamos la ruta en la sesión
        }
    }

    @FXML
    void completeRegistration(ActionEvent event) {
        String enteredName = nameField.getText().trim();
        if (!enteredName.isEmpty()) {
            Session.userName = enteredName;
        }
        SceneManager.switchScene("MainFeed.fxml", "Descubrir Perfiles");
    }
}