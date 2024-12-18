package com.example.testfx;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javax.swing.text.html.ImageView;
import java.io.IOException;

public class MovieDetailsController {
    @FXML
    private ImageView imageButton;
    @FXML
    protected void goToWatched() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MovieDetailsController.class.getResource("fxmlFiles/watchedMovies.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Main.stage.setScene(scene);
        Main.stage.show();
    }
    @FXML
    protected void goToHome() throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(MovieDetailsController.class.getResource("fxmlFiles/MoviePage.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Main.stage.setScene(scene);
        Main.stage.show();
    }
    @FXML
    protected void goToMovieList() throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(MovieDetailsController.class.getResource("fxmlFiles/yourListMovies.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Main.stage.setScene(scene);
        Main.stage.show();
    }
    @FXML
    protected void goToFavourites() throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(MovieDetailsController.class.getResource("fxmlFiles/favouriteMovies.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Main.stage.setScene(scene);
        Main.stage.show();
    }

    @FXML
    protected void goToActor() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MovieDetailsController.class.getResource("fxmlFiles/castPage.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Main.stage.setScene(scene);
        Main.stage.show();
    }
}
