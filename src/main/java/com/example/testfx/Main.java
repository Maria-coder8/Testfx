package com.example.testfx;

import eu.hansolo.tilesfx.addons.Switch;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;



public class Main extends Application {
    public static Stage stage;

    @Override
    public void start(Stage primaryStage) throws IOException {
        stage=new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("fxmlFiles/MoviePage.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
