package com.example.testfx;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import java.io.IOException;


public class adminDashboardController {
    @FXML
    protected void goToSignOut() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(adminDashboardController.class.getResource("fxmlFiles/mainLogin.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Main.stage.setScene(scene);
        Main.stage.show();
    }
}
