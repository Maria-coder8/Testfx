package com.example.testfx;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.ScrollBar;

import javax.swing.text.html.ImageView;

public class MovieController {
    @FXML
    private ScrollBar scrollBar;
    @FXML
    private ImageView imageButton;
    @FXML
    protected void goToWatched() throws IOException{
        SwitchScene.switchScene("watchedMovies.fxml");
    }
    @FXML
    protected void goToHome() throws IOException{
        SwitchScene.switchScene("MoviePage.fxml");
    }
    @FXML
    protected void goToMovieList() throws IOException{
        SwitchScene.switchScene("yourListMovies.fxml");
    }
    @FXML
    protected void goToFavourites() throws IOException{
        SwitchScene.switchScene("favouriteMovies.fxml");
    }
   @FXML
    protected void SwitchStage() throws IOException{
       SwitchScene.switchScene("movieDetails.fxml");
   }

   @FXML
   protected void searchBar() throws IOException {

   }
}
