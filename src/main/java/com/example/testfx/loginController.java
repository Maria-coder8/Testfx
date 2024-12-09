package com.example.testfx;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import org.w3c.dom.Text;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.Objects;



public class loginController {
    @FXML
    private PasswordField password;
    @FXML
    private TextField emailOrMobileNumber;
    @FXML
    private Button signInButton;
    @FXML
    private Text error;
    @FXML
    protected void resetPassword() throws IOException {
        FXMLLoader fxmlloader= new FXMLLoader(loginController.class.getResource("resetpassword.fxml"));
        Scene scene =new Scene(fxmlloader.load());
        Main.stage.setScene(scene);
        Main.stage.show();
    }
    @FXML
    private void signIn() throws IOException{
        boolean isEmailEmpty=ValideInformation.validateEmptyField(emailOrMobileNumber);
        boolean isPasswordEmpty=ValideInformation.validateEmptyField(password);
        if(!isEmailEmpty && !isPasswordEmpty){
            FXMLLoader fxmlloader = new FXMLLoader(loginController.class.getResource("Main.fxml"));
            Scene scene = new Scene(fxmlloader.load());
            Main.stage.setScene(scene);
            Main.stage.show();
        }
    }

    @FXML
    protected void signUpButton() throws IOException{
        FXMLLoader fxmlLoader=new FXMLLoader(loginController.class.getResource("Register.fxml"));
        Scene scene=new Scene(fxmlLoader.load());
        Main.stage.setScene(scene);
        Main.stage.show();
    }



}