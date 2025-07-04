package org.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/pantalla.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root, 400, 200);

        Controlador controlador = loader.getController();
        controlador.seleccionarmatriz(scene);

        stage.setScene(scene);
        stage.setTitle("BMO-Calculator");

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
