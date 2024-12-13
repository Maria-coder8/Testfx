package com.example.testfx;
import eu.hansolo.tilesfx.addons.Switch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class alertController {
//    static Boolean s=false;
    public static void alertrmassage(){

        Stage stage=new Stage();

        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setMinWidth(400);
        stage.setMinHeight(200);
        Label label=new Label("Wrong password");
        label.setLayoutY(60);
        label.setLayoutX(170);
        Button button=new Button("Sign up");
        button.setLayoutY(100);
        button.setLayoutX(170);
        button.setOnAction(event -> {
            FXMLLoader fxmlLoader=new FXMLLoader(alertController.class.getResource("Register.fxml"));
            try {
//                Scene newscene=new Scene(fxmlLoader.load());
//                Main.stage.setScene(newscene);
//                Main.stage.show();
////                stage.close();
//                s=true;
                SwitchScene.switchScene(fxmlLoader.load());
            }
            catch (IOException e){
                throw new RuntimeException(e);
            }
        });
        AnchorPane layout=new AnchorPane();
        layout.getChildren().addAll(label,button);
        Scene scene = new Scene(layout);
        stage.setScene(scene);
        stage.showAndWait();
//        if(s)stage.close();
    }
}
