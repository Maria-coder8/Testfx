package com.example.testfx;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ScrollBar;

import javax.swing.text.html.ImageView;

import static com.example.testfx.SwitchScene.scene;
import static com.example.testfx.SwitchScene.stage;

public class MovieController {
    @FXML
    private ScrollBar scrollBar;
    @FXML
    private ImageView imageButton;
    @FXML
    protected void goToWatched() throws IOException{
        stage = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(SwitchScene.class.getResource("watchedMovies.fxml"));
        scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    protected void goToHome() throws IOException{
        stage = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(SwitchScene.class.getResource("MoviePage.fxml"));
        scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    protected void goToMovieList() throws IOException{
        stage = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(SwitchScene.class.getResource("yourListMovies.fxml"));
        scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    protected void goToFavourites() throws IOException{
        stage = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(SwitchScene.class.getResource("favouriteMovies.fxml"));
        scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }
   @FXML
    protected void SwitchStage() throws IOException{
       stage = stage;
       FXMLLoader fxmlLoader = new FXMLLoader(SwitchScene.class.getResource("movieDetails.fxml"));
       scene = new Scene(fxmlLoader.load());
       stage.setScene(scene);
       stage.show();
   }

//   @FXML
//   protected void searchBar() throws IOException {
//
//   }
}
