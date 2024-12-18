package com.example.testfx;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.File;
import java.io.IOException;

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
          FXMLLoader fxmlLoader = new FXMLLoader(SwitchScene.class.getResource("fxmlFiles/Step2.fxml"));
          scene = new Scene(fxmlLoader.load());
          stage.setScene(scene);
          stage.show();
      }
    }
    @FXML
    protected void Back() throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(RegisterController.class.getResource("fxmlFiles/userLogin.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Main.stage.setScene(scene);
        Main.stage.show();
    }
}