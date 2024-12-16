package com.example.testfx;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import java.io.IOException;

import static com.example.testfx.SwitchScene.scene;
import static com.example.testfx.SwitchScene.stage;

public class adminDashboardController {
    @FXML
    protected void goToSignOut() throws IOException {
        stage = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(SwitchScene.class.getResource("fxmlFiles/mainLogin.fxml"));
        scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }
}
