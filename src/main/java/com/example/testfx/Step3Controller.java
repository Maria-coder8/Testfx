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
    protected void Done() throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(Step3Controller.class.getResource("Payment.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Main.stage.setScene(scene);
        Main.stage.show();

    }
    @FXML
    protected void BacktoStep2() throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(Step3Controller.class.getResource("Step2.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Main.stage.setScene(scene);
        Main.stage.show();
    }













}
