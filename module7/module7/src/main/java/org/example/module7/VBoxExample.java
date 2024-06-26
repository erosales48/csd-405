package org.example.module7;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VBoxExample extends Application {
    @Override
    public void start(Stage primaryStage) {
        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");

        VBox vbox = new VBox(10); // 10 pixels spacing between buttons
        vbox.getChildren().addAll(button1, button2, button3);

        Scene scene = new Scene(vbox, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("VBox Example");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
