package com.empresa.javafx014;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {
    @FXML
    private TextField txtEmail;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private Label lblStatus;

    @FXML
    protected void onLoginButtonClick() {
        String email = txtEmail.getText();
        String password = txtPassword.getText();

        if ("admin@gmail.com".equals(email) && "123".equals(password)) {
            lblStatus.setText("Inicio correcto");
        } else {
            lblStatus.setText("Correo o contraseña incorrectos");
        }
    }
}
