package com.example.testfx;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

public class Step3Controller {
    @FXML
    protected void Done() throws IOException {
        stage = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(SwitchScene.class.getResource("fxmlFiles/Payment.fxml"));
        scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void BacktoStep2() throws IOException {
        stage = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(SwitchScene.class.getResource("fxmlFiles/Step2.fxml"));
        scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }
}
