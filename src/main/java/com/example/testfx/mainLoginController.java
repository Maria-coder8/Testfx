package com.example.testfx;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.File;
import java.io.IOException;
import java.util.Objects;


public class mainLoginController {
    @FXML
    protected void goToAdmin() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(mainLoginController.class.getResource("fxmlFiles/adminLogin.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Main.stage.setScene(scene);
        Main.stage.show();
    }

    @FXML
    protected void goToUser() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(mainLoginController.class.getResource("fxmlFiles/userLogin.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Main.stage.setScene(scene);
        Main.stage.show();
    }
}
