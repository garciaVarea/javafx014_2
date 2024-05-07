package com.empresa.javafx014;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private TextField txtCorreo;

    @FXML
    private TextField txtContraseña;

    @FXML
    private TextField txtContraseña2;

    @FXML
    private CheckBox cbPrivacidad;

    @FXML
    protected void onHelloButtonClick() {
        if (!txtCorreo.getText().isEmpty() && !txtContraseña.getText().isEmpty() && !txtContraseña2.getText().isEmpty() && cbPrivacidad.isSelected()) {
            welcomeText.setText("Usuario registrado");
        } else {
            welcomeText.setText("Faltan datos");
        }
    }

    @FXML
    protected void onLoginButtonClick() throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("login-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 300, 200);
        stage.setTitle("Iniciar sesión");
        stage.setScene(scene);
        stage.show();
    }
}