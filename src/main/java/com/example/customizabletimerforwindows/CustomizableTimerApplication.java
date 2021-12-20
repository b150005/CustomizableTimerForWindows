package com.example.customizabletimerforwindows;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.*;

import java.net.URL;

public class CustomizableTimerApplication extends Application {
  public static void main(String[] args) {
    // アプリケーションの起動
    launch(args);
  }

  @Override
  public void start(Stage stage) {
    try {
      URL url = CustomizableTimerApplication.class.getResource("settings-view.fxml");
      FXMLLoader fxmlLoader = new FXMLLoader(url);
      Scene scene = new Scene(fxmlLoader.load());
      stage.setScene(scene);
    } catch (IOException e) {
      e.printStackTrace();
    }
    stage.setTitle("Settings");
    stage.show();
  }
}
