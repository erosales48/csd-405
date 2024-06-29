package org.example.module7;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class ImageGallery extends Application {

    @Override
    public void start(Stage primaryStage) {
        TilePane tilePane = new TilePane();
        tilePane.setTileAlignment(Pos.CENTER);
        tilePane.setHgap(10);
        tilePane.setVgap(10);
        tilePane.setPadding(new Insets(15, 15, 15, 15));
        tilePane.setStyle("-fx-background-color: rgba(1, 1, 1, 0.9);");

        // Load and add images to the TilePane
        for (int i = 1; i <= 9; i++) {
            Image image = new Image("/image" + i + ".png");

            ImageView imageView = new ImageView(image);
            imageView.setFitWidth(250);
            imageView.setFitHeight(250);
            tilePane.getChildren().add(imageView);
        }

        Scene scene = new Scene(tilePane, 800, 795);
        primaryStage.setTitle("Image Gallery");
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

