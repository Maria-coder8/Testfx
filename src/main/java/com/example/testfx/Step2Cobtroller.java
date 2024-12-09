package com.example.testfx;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.File;
import java.io.IOException;
import java.util.Objects;


public class Step2Cobtroller {
    @FXML
    protected void payment() throws IOException{
        FXMLLoader fxmlLoader=new FXMLLoader(Step2Cobtroller.class.getResource("Step3.fxml"));
        Scene scene=new Scene(fxmlLoader.load());
        Main.stage.setScene(scene);
        Main.stage.show();

    }
    @FXML
    protected void BacktoStep1() throws IOException{
        FXMLLoader fxmlLoader=new FXMLLoader(Step2Cobtroller.class.getResource("Register.fxml"));
        Scene scene=new Scene(fxmlLoader.load());
        Main.stage.setScene(scene);
        Main.stage.show();
    }
}
