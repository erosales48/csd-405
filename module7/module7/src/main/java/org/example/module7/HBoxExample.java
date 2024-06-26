package org.example.module7;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HBoxExample extends Application {
    @Override
    public void start(Stage primaryStage) {
        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");

        HBox hbox = new HBox(10); // 10 pixels spacing between buttons
        hbox.getChildren().addAll(button1, button2, button3);

        Scene scene = new Scene(hbox, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("HBox Example");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
