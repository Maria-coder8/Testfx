package com.example.testfx;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import java.io.IOException;


public class PaymentController {

    @FXML
    protected void toMain() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(PaymentController.class.getResource("fxmlFiles/MoviePage.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Main.stage.setScene(scene);
        Main.stage.show();
    }

    @FXML
    protected void BackToStep3() throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(PaymentController.class.getResource("fxmlFiles/Step3.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Main.stage.setScene(scene);
        Main.stage.show();
    }

}
