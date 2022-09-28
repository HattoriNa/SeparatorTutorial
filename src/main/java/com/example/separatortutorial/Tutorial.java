package com.example.separatortutorial;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Separator;
import javafx.scene.layout.VBox;


public class Tutorial extends Application  {
    public static void main(String args[]){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Button button1 = new Button("Button1");
        Button button2 = new Button("Button2");

        Separator separator = new Separator(Orientation.HORIZONTAL);

        VBox layout = new VBox(button1, separator, button2);

        Scene scene = new Scene(layout, 200, 100);

        primaryStage.setTitle("Separator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}