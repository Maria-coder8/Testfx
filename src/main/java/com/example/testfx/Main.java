package com.example.testfx;
import com.almasb.fxgl.app.MainWindow;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;


public class Main extends Application {
    public static Stage stage;

    @Override
    public void start(Stage stage) throws IOException {

            SwitchScene.init(stage);
    }

    public static void main(String[] args) {
        launch();
    }
}