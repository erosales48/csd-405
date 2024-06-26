package org.example.module7;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FlowPlaneExample extends Application {
    @Override
    public void start(Stage primaryStage) {
        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");
        Button button4 = new Button("Button 4");
        Button button5 = new Button("Button 5");
        Button button6 = new Button("Button 6");

        // Create FlowPane layout with horizontal and vertical gaps
        FlowPane flowPane = new FlowPane(10, 10);
        flowPane.setPadding(new Insets(10, 10, 10, 10));
        flowPane.getChildren().addAll(button1, button2, button3, button4, button5, button6);

        // Create and set the scene
        Scene scene = new Scene(flowPane, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("FlowPane Example");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
