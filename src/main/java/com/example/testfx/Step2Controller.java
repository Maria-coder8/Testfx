package com.example.testfx;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;

import java.io.IOException;


public class Step2Controller {
    @FXML
    protected void payment() throws IOException{
        SwitchScene.switchScene("Step3.fxml");

    }

    @FXML
    private ToggleButton btnStandard;
    @FXML
    private ToggleButton btnPremium;
    @FXML
    private ToggleButton btnTelecom;

    @FXML
    protected void BacktoStep1() throws IOException{
        SwitchScene.switchScene("Register.fxml");
    }
}
