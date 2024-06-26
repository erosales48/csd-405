module org.example.module7 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens org.example.module7 to javafx.fxml;
    exports org.example.module7;
}