/* Edgar Rosales
 * 29Jun2024
 * CSD405-J318 Intermediate Java Programming
 *
 * Module 7 Assignment
 * Research the web for JavaFX topics from the list below.
 * Provide examples on the topics you discuss along with a file including documentation in the actual code.
 * Include a link to the site(s) you are referencing in your paper.
 * This paper is to be a 700-word paper (excluding your references) on two of the following Layout topics.
 * This paper will automatically be submitted to SafeAssign for an originality/plagiarism review.
 *
 * JavaFX GridPane
 * JavaFX TilePane
 *
 */
package org.example.module7;

// Required imports
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.net.URL;

public class ImageGallery extends Application {
    // Create new TilePane
    private TilePane tilePane = new TilePane();

    @Override
    public void start(Stage primaryStage) {
        tilePane.setTileAlignment(Pos.CENTER);
        tilePane.setHgap(10);
        tilePane.setVgap(10);
        tilePane.setPadding(new Insets(15, 15, 15, 15));
        tilePane.setStyle("-fx-background-color: rgba(1, 1, 1, 0.9);");

        // Initial load of image set 1
        loadImages(1);

        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(10, 10, 10, 10));

        // Create buttons for different sets of images
        Button set1Button = new Button("Set 1");
        set1Button.setOnAction(e -> loadImages(1));

        Button set2Button = new Button("Set 2");
        set2Button.setOnAction(e -> loadImages(2));

        Button set3Button = new Button("Set 3");
        set3Button.setOnAction(e -> loadImages(3));

        // Add buttons to the GridPane
        gridPane.add(set1Button, 0, 0);
        gridPane.add(set2Button, 1, 0);
        gridPane.add(set3Button, 2, 0);

        // Place a VBox in the GridPane for Controls
        VBox vbox = new VBox(10, gridPane, tilePane);
        vbox.setAlignment(Pos.TOP_CENTER);
        vbox.setPadding(new Insets(15, 15, 15, 15));

        Scene scene = new Scene(vbox, 850, 890);
        primaryStage.setTitle("Image Gallery");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    // Image loader
    private void loadImages(int set) {
        tilePane.getChildren().clear();
        for (int i = 1; i <= 9; i++) {
            URL imageUrl = getClass().getResource("/set" + set + "/image" + i + ".png");
            Image image = new Image(imageUrl.toExternalForm());

            ImageView imageView = new ImageView(image);
            imageView.setFitWidth(250);
            imageView.setFitHeight(250);
            tilePane.getChildren().add(imageView);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
