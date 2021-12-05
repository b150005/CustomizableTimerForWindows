package com.example.customizabletimerforwindows;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CustomizableTimerApplication extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage stage) {
    FXMLLoader fxmlLoader = new FXMLLoader(CustomizableTimerApplication.class.getResource("settings-view.fxml"));
    try {
      Scene scene = new Scene(fxmlLoader.load());
      stage.setScene(scene);
    } catch (IOException e) {
      e.printStackTrace();
    }
    stage.setTitle("Settings");
    stage.show();
  }
}
