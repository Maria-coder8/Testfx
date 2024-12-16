package com.example.testfx;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.layout.AnchorPane;
import model.Movie;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.GridPane;

import javax.swing.text.html.ImageView;

import static com.example.testfx.SwitchScene.scene;
import static com.example.testfx.SwitchScene.stage;

public class MovieController {
    @FXML
    private ScrollBar scrollBar;
    @FXML
    private ImageView movieImg;

    @FXML
    protected void goToWatched() throws IOException {
        stage = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(SwitchScene.class.getResource("fxmlFiles/watchedMovies.fxml"));
        scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void goToHome() throws IOException {
        stage = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(SwitchScene.class.getResource("fxmlFiles/MoviePage.fxml"));
        scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void goToMovieList() throws IOException {
        stage = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(SwitchScene.class.getResource("fxmlFiles/yourListMovies.fxml"));
        scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void goToFavourites() throws IOException {
        stage = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(SwitchScene.class.getResource("fxmlFiles/favouriteMovies.fxml"));
        scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void SwitchStage() throws IOException {
        stage = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(SwitchScene.class.getResource("fxmlFiles/movieDetails.fxml"));
        scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }

//    @FXML
//    private GridPane grid;
//
//    private List<Movie> movies = new ArrayList<>();
//
//    private List<Movie> getData() {
//        List<Movie> movies = new ArrayList<>();
//        Movie movie;
//
//        for (int i = 0; i < 7; i++) {
//            movie = new Movie();
//            movie.setMoviePosterSrc("/images/images/casting.jpg");
//        }
//        return movies;
//    }

//    @Override
//    public void initialize(URL url, ResourceBundle resourceBundle) {
//        movies.addAll(getData());
//        int column = 0;
//        int row = 0;
//        try {
//            for (int i = 0; i < movies.size(); i++) {
//                FXMLLoader fxmlLoader = new FXMLLoader();
//                fxmlLoader.setLocation(getClass().getResource("/fxmlFiles/movie.fxml"));
//                AnchorPane anchorPane = fxmlLoader.load();
//
//                ItemController itemController = fxmlLoader.getController();
//                itemController.setData(movies.get(i));
//
//                if (column == 3) {
//                    column =0;
//                    row++;
//                }
//
//                grid.add(anchorPane, column++, row);
//                GridPane.setMargin(anchorPane,new Insets(10));
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

//   @FXML
//   protected void searchBar() throws IOException {
//
//   }
//    }
}
