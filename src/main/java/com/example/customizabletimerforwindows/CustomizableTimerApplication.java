package com.example.customizabletimerforwindows;

import java.io.IOException;
import java.net.URL;

import io.lettuce.core.RedisClient;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CustomizableTimerApplication extends Application {
  public static void main(String[] args) {
    // Redis Standaloneの起動
    launchRedis();
    // アプリケーションの起動
    launch(args);
  }

  /**
   * JavaFXアプリケーション(設定画面)の起動
   */
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

  private static void launchRedis() {
    RedisClient client = RedisClient.create("redis://localhost");
  }
}
