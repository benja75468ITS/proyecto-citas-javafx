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
        String interestText = (interestFilter != null) ? interestFilter.getText() : "";
        System.out.println("Aplicando filtros: Género=" + genderFilter.getValue() + 
                           ", Edad=" + ageFilter.getText() + 
                           ", Interés=" + interestText);
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

    @FXML
    void goToTeam(ActionEvent event) {
        try {
            javafx.fxml.FXMLLoader loader = new javafx.fxml.FXMLLoader(getClass().getResource("/views/TeamView.fxml"));
            javafx.scene.Parent root = loader.load();
            
            javafx.stage.Stage stage = (javafx.stage.Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
            stage.setScene(new javafx.scene.Scene(root));
            stage.setTitle("Integrantes del Equipo");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al cargar la vista de equipo: " + e.getMessage());
        }
    }
}