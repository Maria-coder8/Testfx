package com.example.testfx;
import java.util.regex.*;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class ValideInformation {
    public static Boolean validateEmptyField(TextField textField) {
        if (textField.getText().trim().isEmpty()) {
            textField.setStyle("-fx-border-color: red; -fx-border-width: 2; -fx-border-radius: 20;");
            textField.setPromptText("This field is required");
            return true;
        } else {
            textField.setStyle("");
            return false;
        }
    }
    public static Boolean VallidateEmailField (TextField textField){
        String email=textField.getText().trim();
        if(!email.endsWith("@gmail.com")){
            textField.setStyle("-fx-border-color: red; -fx-border-width: 2; -fx-border-radius: 20;");
            textField.setPromptText("Invalid email");
            return true;
        }
        else{
            textField.setStyle("");
            return false;
        }
    }
    public static Boolean VallidatePasswordField (PasswordField passwordField){
        String password=passwordField.getText().trim();
        if(password.length()<8){
            passwordField.setStyle("-fx-border-color: red; -fx-border-width: 2; -fx-border-radius: 20;");
            passwordField.setPromptText("Invalid password");
            return true;
        }
        else{
            passwordField.setStyle("");
            return false;
        }
    }
}





