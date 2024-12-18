package com.example.testfx;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import org.w3c.dom.Text;

import java.io.IOException;


public class adminLoginController {
    @FXML
    private PasswordField password;
    @FXML
    private TextField emailOrMobileNumber;
    @FXML
    private Button signInButton;
    @FXML
    private Text error;
    @FXML
    private void signIn() throws IOException{
        boolean isEmailEmpty=ValideInformation.validateEmptyField(emailOrMobileNumber);
        boolean isPasswordEmpty=ValideInformation.validateEmptyField(password);
        if(!isEmailEmpty && !isPasswordEmpty){
            FXMLLoader fxmlLoader = new FXMLLoader(adminDashboardController.class.getResource("fxmlFiles/adminDashboard.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Main.stage.setScene(scene);
            Main.stage.show();
        }
    }

    @FXML
    protected void goToMain() throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(adminDashboardController.class.getResource("fxmlFiles/mainLogin.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Main.stage.setScene(scene);
        Main.stage.show();
    }
}