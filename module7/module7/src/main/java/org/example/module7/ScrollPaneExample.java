package org.example.module7;

/* Edgar Rosales
 * CSD406-J318 Intermediate Java Programing
 *
 * This is an example of how to use ScrollPane in JavaFX.
 * ScrollPane provides a scrollable view of its content.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ScrollPaneExample extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Create a VBox layout to hold multiple labels
        VBox vbox = new VBox(10);
        for (int i = 1; i <= 20; i++) {
            Label label = new Label("Label " + i);
            vbox.getChildren().add(label);
        }

        // Create a ScrollPane and set its content as the VBox
        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setContent(vbox);
        scrollPane.setPrefSize(200, 150); // Set preferred size of the ScrollPane

        // Optional: Customize the ScrollPane
        scrollPane.setFitToWidth(true); // Ensure the content width fits the viewport width
        scrollPane.setPannable(true); // Allow panning via mouse

        // Create and set the scene
        Scene scene = new Scene(scrollPane, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("ScrollPane Example");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
