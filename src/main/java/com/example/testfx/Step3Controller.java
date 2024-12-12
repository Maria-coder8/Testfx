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
        SwitchScene.switchScene("Payment.fxml");
    }

    @FXML
    protected void BacktoStep2() throws IOException {
        SwitchScene.switchScene("Step2.fxml");
    }













}
