module com.example.customizabletimerforwindows {
  requires javafx.controls;
  requires javafx.fxml;

  requires org.controlsfx.controls;
  requires com.dlsc.formsfx;
  requires org.kordamp.ikonli.javafx;
  requires org.kordamp.bootstrapfx.core;

  opens com.example.customizabletimerforwindows to javafx.fxml;
  exports com.example.customizabletimerforwindows;
}