package mx.uacam.fi.its.pa;

import javafx.application.Application;
import javafx.stage.Stage;
import mx.uacam.fi.its.pa.utils.SceneManager;

public class App extends Application {
    @Override
    public void start(Stage primaryStage) {
        SceneManager.setStage(primaryStage);
        // Iniciamos con el Aviso de Privacidad como pide el documento
        SceneManager.switchScene("Privacy.fxml", "Aviso de Privacidad");
    }

    public static void main(String[] args) {
        launch(args);
    }
}
