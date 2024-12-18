package com.example.testfx;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import org.w3c.dom.Text;

import java.io.IOException;

public class userLoginController {
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
        FXMLLoader fxmlLoader = new FXMLLoader(userLoginController.class.getResource("resetpassword.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Main.stage.setScene(scene);
        Main.stage.show();;
    }
    @FXML
    private void signIn() throws IOException{

        boolean isEmailEmpty=ValideInformation.validateEmptyField(emailOrMobileNumber);
        boolean isPasswordEmpty=ValideInformation.validateEmptyField(password);
        if(!isEmailEmpty && !isPasswordEmpty){
            FXMLLoader fxmlLoader = new FXMLLoader(userLoginController.class.getResource("fxmlFiles/MoviePage.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Main.stage.setScene(scene);
            Main.stage.show();
        }
    }

    @FXML
    protected void signUpButton() throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(userLoginController.class.getResource("fxmlFiles/Register.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Main.stage.setScene(scene);
        Main.stage.show();
    }

    @FXML
    protected void goBack() throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(userLoginController.class.getResource("fxmlFiles/mainLogin.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Main.stage.setScene(scene);
        Main.stage.show();
    }
}