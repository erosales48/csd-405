package org.example.module7;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TitledPaneExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create the content for the TitledPane
        VBox content = new VBox();
        content.getChildren().add(new Label("This is the content inside the TitledPane."));

        // Create a TitledPane with a title and the content
        TitledPane titledPane = new TitledPane("Expandable Section", content);
        titledPane.setExpanded(false); // Initially collapsed

        // Add the TitledPane to a layout container
        VBox root = new VBox();
        root.getChildren().add(titledPane);

        // Create the Scene and set it on the Stage
        Scene scene = new Scene(root, 300, 200);
        primaryStage.setTitle("JavaFX TitledPane Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

