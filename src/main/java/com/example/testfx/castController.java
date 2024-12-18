package com.example.testfx;
import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import javafx.scene.image.ImageView;

import static com.example.testfx.Main.*;


public class castController {
    @FXML
    private ImageView movieImg;

    @FXML
    protected void goToWatched() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(castController.class.getResource("fxmlFiles/watchedMovies.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    protected void goToHome() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(castController.class.getResource("fxmlFiles/MoviePage.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void goToMovieList() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(castController.class.getResource("fxmlFiles/MyList.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void goToFavourites() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(castController.class.getResource("fxmlFiles/favouriteMovies.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void goBack() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MovieController.class.getResource("fxmlFiles/movieDetails.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Main.stage.setScene(scene);
        Main.stage.show();
    }

}