module com.empresa.javafx014 {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;

    opens com.empresa.javafx014 to javafx.fxml;
    exports com.empresa.javafx014;
}