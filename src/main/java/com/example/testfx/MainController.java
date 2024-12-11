package com.example.testfx;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.TextField;

import javax.swing.text.html.ImageView;
import java.io.File;

import java.util.Objects;
public class MainController {
    @FXML
    private ScrollBar scrollBar;
    @FXML
    private ImageView imageButton;
    @FXML
    protected void goToWatched() throws IOException{
        FXMLLoader fxmlLoader=new FXMLLoader(MainController.class.getResource("watchedMovies.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Main.stage.setScene(scene);
        Main.stage.show();
    }
    @FXML
    protected void goToHome() throws IOException{
        FXMLLoader fxmlLoader=new FXMLLoader(MainController.class.getResource("MoviePage.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Main.stage.setScene(scene);
        Main.stage.show();
    }
    @FXML
    protected void goToMovieList() throws IOException{
        FXMLLoader fxmlLoader=new FXMLLoader(MainController.class.getResource("yourListMovies.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Main.stage.setScene(scene);
        Main.stage.show();
    }
    @FXML
    protected void goToFavourites() throws IOException{
        FXMLLoader fxmlLoader=new FXMLLoader(MainController.class.getResource("favouriteMovies.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Main.stage.setScene(scene);
        Main.stage.show();
    }
   @FXML
    protected void SwitchStage() throws IOException{
       FXMLLoader fxmlLoader=new FXMLLoader(MainController.class.getResource("movieDetails.fxml"));
       Scene scene = new Scene(fxmlLoader.load());
       Main.stage.setScene(scene);
       Main.stage.show();
   }


}
