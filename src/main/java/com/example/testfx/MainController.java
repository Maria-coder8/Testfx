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
    protected void Watched() throws IOException{
        FXMLLoader fxmlLoader=new FXMLLoader(MainController.class.getResource("WatchedMovies.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Main.stage.setScene(scene);
        Main.stage.show();
    }
    @FXML
    protected void MovieList() throws IOException{
        FXMLLoader fxmlLoader=new FXMLLoader(MainController.class.getResource("MyList.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Main.stage.setScene(scene);
        Main.stage.show();
    }
    @FXML
    protected void Favourites() throws IOException{
        FXMLLoader fxmlLoader=new FXMLLoader(MainController.class.getResource("Favourites.fxml"));
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
