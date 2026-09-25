package mx.uacam.fi.its.pa.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import mx.uacam.fi.its.pa.utils.SceneManager;

public class MainFeedController {

    @FXML
    private ComboBox<String> genderFilter;

    @FXML
    private TextField ageFilter;

    @FXML
    private TextField interestFilter;

    @FXML
    public void initialize() {
        // Inicializamos las opciones del filtro al cargar la vista
        genderFilter.getItems().addAll("Todos", "Mujeres", "Hombres", "Otro");
        genderFilter.getSelectionModel().selectFirst();
    }

    @FXML
    void applyFilters(ActionEvent event) {
        System.out.println("Aplicando filtros: Género=" + genderFilter.getValue() + 
                           ", Edad=" + ageFilter.getText() + 
                           ", Interés=" + interestFilter.getText());
    }

    @FXML
    void contactPerson(ActionEvent event) {
        // Al dar clic en un dummy, vamos al formulario de contacto
        SceneManager.switchScene("ContactForm.fxml", "Formulario de Contacto");
    }

    @FXML
    void goToInbox(ActionEvent event) {
        SceneManager.switchScene("Inbox.fxml", "Bandeja de Entrada");
    }

    @FXML
    void goToProfile(ActionEvent event) {
        SceneManager.switchScene("Profile.fxml", "Editar Mi Perfil");
    }
}