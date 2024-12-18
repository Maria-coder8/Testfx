package com.example.testfx;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

public class MovieController implements Initializable {
    @FXML
    private ImageView movieImg;
    @FXML
    private GridPane grid;

    private List<Movie> movies = new ArrayList<>();
    private Image image;

    private List<Movie> getData() {
        List<Movie> movies = new ArrayList<>();
        Movie movie;
        movie = new Movie();
        movie.setMoviePosterSrc("images/images/casting.jpg");
        movies.add(movie);

        movie = new Movie();
        movie.setMoviePosterSrc("images/images/balto.jpeg");
        movies.add(movie);

        movie = new Movie();
        movie.setMoviePosterSrc("images/images/forrestgump.jpg");
        movies.add(movie);

        return movies;
    }

    @Override
    public void initialize(URL location, ResourceBundle resourceBundle) {
        movies.addAll(getData());
        int column = 0;
        int row = 0;
        try {
            for (int i = 0; i < movies.size(); i++) {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("fxmlFiles/movie.fxml"));
                AnchorPane anchorPane = fxmlLoader.load();

                ItemController itemController = fxmlLoader.getController();
                itemController.setData(movies.get(i));

                if (column == 3) {
                    column = 0;
                    row++;
                }

                this.grid.add(anchorPane, column++, row);
                GridPane.setMargin(anchorPane, new Insets(10));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
        @FXML
        protected void goToWatched () throws IOException {
            FXMLLoader fxmlLoader = new FXMLLoader(MovieController.class.getResource("fxmlFiles/watchedMovies.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Main.stage.setScene(scene);
            Main.stage.show();

        }
        @FXML
        protected void goToHome () throws IOException {
            FXMLLoader fxmlLoader = new FXMLLoader(MovieController.class.getResource("fxmlFiles/MoviePage.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Main.stage.setScene(scene);
            Main.stage.show();
        }
        @FXML
        protected void goToMovieList () throws IOException {
            FXMLLoader fxmlLoader = new FXMLLoader(MovieController.class.getResource("fxmlFiles/MyList.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Main.stage.setScene(scene);
            Main.stage.show();
        }
        @FXML
        protected void goToFavourites () throws IOException {
            FXMLLoader fxmlLoader = new FXMLLoader(MovieController.class.getResource("fxmlFiles/favouriteMovies.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Main.stage.setScene(scene);
            Main.stage.show();
        }
        @FXML
        protected void SwitchStage () throws IOException {
            FXMLLoader fxmlLoader = new FXMLLoader(MovieController.class.getResource("fxmlFiles/movieDetails.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Main.stage.setScene(scene);
            Main.stage.show();
        }
    }