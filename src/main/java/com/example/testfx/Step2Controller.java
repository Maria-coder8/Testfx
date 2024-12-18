package com.example.testfx;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;

import java.io.IOException;



public class Step2Controller {
    @FXML
    private ToggleButton btnStandard;
    @FXML
    private ToggleButton btnPremium;
    @FXML
    private ToggleButton btnTelecom;
    @FXML
    protected void payment() throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(Step2Controller.class.getResource("fxmlFiles/Step3.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Main.stage.setScene(scene);
        Main.stage.show();

    }
    @FXML
    protected void BacktoStep1() throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(Step2Controller.class.getResource("fxmlFiles/Register.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Main.stage.setScene(scene);
        Main.stage.show();
    }
}
