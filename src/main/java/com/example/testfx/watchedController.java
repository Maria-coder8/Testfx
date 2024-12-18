package com.example.testfx;
import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import javafx.scene.image.ImageView;

public class watchedController {
    @FXML
    private ImageView movieImg;

    @FXML
    protected void goToWatched() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(watchedController.class.getResource("fxmlFiles/watchedMovies.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Main.stage.setScene(scene);
        Main.stage.show();

    }

    @FXML
    protected void goToHome() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(watchedController.class.getResource("fxmlFiles/MoviePage.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Main.stage.setScene(scene);
        Main.stage.show();
    }

    @FXML
    protected void goToMovieList() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(watchedController.class.getResource("fxmlFiles/MyList.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Main.stage.setScene(scene);
        Main.stage.show();
    }

    @FXML
    protected void goToFavourites() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(watchedController.class.getResource("fxmlFiles/favouriteMovies.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Main.stage.setScene(scene);
        Main.stage.show();
    }

    @FXML
    protected void SwitchStage() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(watchedController.class.getResource("fxmlFiles/movieDetails.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Main.stage.setScene(scene);
        Main.stage.show();
    }
}