package com.example.testfx;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import org.w3c.dom.Text;

import java.io.IOException;

import static com.example.testfx.SwitchScene.scene;
import static com.example.testfx.SwitchScene.stage;

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
        FXMLLoader fxmlLoader = new FXMLLoader(SwitchScene.class.getResource("resetpassword.fxml"));
        scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();;
    }
    @FXML
    private void signIn() throws IOException{

        boolean isEmailEmpty=ValideInformation.validateEmptyField(emailOrMobileNumber);
        boolean isPasswordEmpty=ValideInformation.validateEmptyField(password);
        if(!isEmailEmpty && !isPasswordEmpty){
            FXMLLoader fxmlLoader = new FXMLLoader(SwitchScene.class.getResource("fxmlFiles/MoviePage.fxml"));
            scene = new Scene(fxmlLoader.load());
            stage.setScene(scene);
            stage.show();
        }
    }

    @FXML
    protected void signUpButton() throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(SwitchScene.class.getResource("fxmlFiles/Register.fxml"));
        scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void goBack() throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(SwitchScene.class.getResource("fxmlFiles/mainLogin.fxml"));
        scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }
}