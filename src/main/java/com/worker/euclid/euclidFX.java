package com.worker.euclid;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.control.*;

import java.io.IOException;

public class euclidFX extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        HBox textBox = new HBox(25);
        StackPane button1 = new StackPane();
        textBox.setAlignment(Pos.CENTER);
        Button sub1 = new Button();
        sub1.setText("Calculate");
        button1.getChildren().add(sub1);
        TextField test1 = new TextField();
        TextField test2 = new TextField();
        TextField result = new TextField();
        test1.setPromptText("Number 1");
        test2.setPromptText("Number 2");
        textBox.getChildren().addAll(test1, test2, button1, result);
        button1.setAlignment(Pos.CENTER_RIGHT);
        Scene mainScene = new Scene(textBox, 1280,720);
        sub1.setOnAction(e -> {
                String help1 = test1.getText();
                String help2 = test2.getText();
                EuclidBack doIt = new EuclidBack();
                int f = doIt.calcEuclid(help1,help2);
                result.setText(Integer.toString(f));
                });
        stage.setScene(mainScene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
