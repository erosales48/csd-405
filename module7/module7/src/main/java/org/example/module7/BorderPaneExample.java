package org.example.module7;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BorderPaneExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create components for each region
        Label topLabel = new Label("Top");
        Label bottomLabel = new Label("Bottom");
        bottomLabel.setAlignment(Pos.CENTER);
        Label leftLabel = new Label("Left");
        Label rightLabel = new Label("Right");
        Label centerLabel = new Label("Center");
        Button centerButton = new Button("Center");

        // Create a BorderPane and set components in each region
        BorderPane bPane = new BorderPane();
        bPane.setTop(topLabel);
        bPane.setBottom(bottomLabel);
        bPane.setLeft(leftLabel);
        bPane.setRight(rightLabel);
        bPane.setCenter(centerLabel);
        bPane.setCenter(centerButton);

        // Create the Scene and set it on the Stage
        Scene scene = new Scene(bPane, 400, 300);
        primaryStage.setTitle("JavaFX BorderPane Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

