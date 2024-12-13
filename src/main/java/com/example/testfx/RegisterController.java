package com.example.testfx;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

import static com.example.testfx.SwitchScene.scene;
import static com.example.testfx.SwitchScene.stage;

public class RegisterController {
    @FXML
    private TextField firstName;
    @FXML
    private TextField lastName;
    @FXML
    private TextField email;
    @FXML
    private PasswordField password;
    @FXML
    protected void NextButton() throws IOException{
      boolean isFirstEmpty=ValideInformation.validateEmptyField(firstName);
      boolean isLastEmpty=ValideInformation.validateEmptyField(lastName);
      boolean isEmailEmpty=ValideInformation.validateEmptyField(email);
      boolean isPasswordEmpty=ValideInformation.validateEmptyField(password);
      boolean isInvalidEmail=ValideInformation.VallidateEmailField(email);
      boolean isInvalidPassword=ValideInformation.VallidatePasswordField(password);
      if (!isFirstEmpty &&!isLastEmpty&&!isEmailEmpty&&!isPasswordEmpty &&!isInvalidEmail && !isInvalidPassword) {
          stage = stage;
          FXMLLoader fxmlLoader = new FXMLLoader(SwitchScene.class.getResource("Step2.fxml"));
          scene = new Scene(fxmlLoader.load());
          stage.setScene(scene);
          stage.show();
      }


    }
    @FXML
    protected void Back() throws IOException{
        stage = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(SwitchScene.class.getResource("userLogin.fxml"));
        scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }

}
