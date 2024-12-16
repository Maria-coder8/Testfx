package com.example.testfx;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public  class SwitchScene {

    public static Stage stage;
    public static Scene scene;

    public static void init(Stage stage) throws IOException{
        SwitchScene.stage = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(SwitchScene.class.getResource("fxmlFiles/Step2.fxml"));
        scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();

    }

    public static void switchScene(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SwitchScene.class.getResource(fxml));
        SwitchScene.scene.setRoot(fxmlLoader.load());
    }
}