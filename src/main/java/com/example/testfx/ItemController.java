package com.example.testfx;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.fxml.FXML;

public class ItemController {
    @FXML
    private ImageView moviePoster;

    @FXML
    private Movie movie;

    @FXML
    protected void setData(Movie movie) {
        this.movie = movie;
        Image image = new Image(getClass().getResourceAsStream(movie.getMoviePosterSrc()));
        moviePoster.setImage(image);
    }
}
