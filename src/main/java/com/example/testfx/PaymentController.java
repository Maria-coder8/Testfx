package com.example.testfx;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import java.io.IOException;

public class PaymentController {

    @FXML
    protected void toMain() throws IOException {
        SwitchScene.switchScene("MoviePage.fxml");
    }

    @FXML
    protected void BackToStep3() throws IOException{
        SwitchScene.switchScene("Step3.fxml");
    }

}
