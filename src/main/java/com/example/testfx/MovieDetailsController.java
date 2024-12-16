package com.example.testfx;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ScrollBar;

import javax.swing.text.html.ImageView;
import java.io.IOException;

import static com.example.testfx.SwitchScene.scene;
import static com.example.testfx.SwitchScene.stage;

public class MovieDetailsController {
    @FXML
    private ScrollBar scrollBar;
    @FXML
    private ImageView imageButton;
    @FXML
    protected void goToWatched() throws IOException {
        stage = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(SwitchScene.class.getResource("fxmlFiles/watchedMovies.fxml"));
        scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    protected void goToHome() throws IOException{
        stage = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(SwitchScene.class.getResource("fxmlFiles/MoviePage.fxml"));
        scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    protected void goToMovieList() throws IOException{
        stage = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(SwitchScene.class.getResource("fxmlFiles/yourListMovies.fxml"));
        scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    protected void goToFavourites() throws IOException{
        stage = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(SwitchScene.class.getResource("fxmlFiles/favouriteMovies.fxml"));
        scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }
}
