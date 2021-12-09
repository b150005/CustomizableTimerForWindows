package com.example.customizabletimerforwindows;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

import static javafx.collections.FXCollections.observableArrayList;

public class SettingsController implements Initializable {
  // General
  @FXML private CheckBox digitalModeCheckButton;
  @FXML private CheckBox displayAnimationInFrontCheckBox;
  @FXML private CheckBox frontAnimationCheckBox;
  @FXML private ChoiceBox<String> frontAnimationDisplayModeChoiceBox;
  @FXML private Label frontAnimationFilePathLabel;
  @FXML private Button showFrontFileChooserButton;
  @FXML private CheckBox backAnimationCheckBox;
  @FXML private ChoiceBox<String> backAnimationDisplayModeChoiceBox;
  @FXML private Label backAnimationFilePathLabel;
  @FXML private Button showBackFileChooserButton;
  @FXML private DatePicker displayDatePicker1;
  @FXML private ChoiceBox<String> displayTimeChoiceBox1;
  @FXML private DatePicker displayDatePicker2;
  @FXML private ChoiceBox<String> displayTimeChoiceBox2;
  @FXML private DatePicker displayDatePicker3;
  @FXML private ChoiceBox<String> displayTimeChoiceBox3;
  @FXML private DatePicker displayDatePicker4;
  @FXML private ChoiceBox<String> displayTimeChoiceBox4;
  @FXML private DatePicker displayDatePicker5;
  @FXML private ChoiceBox<String> displayTimeChoiceBox5;

  // Analog
  @FXML private Label faceFilePathLabel;
  @FXML private Button showFaceFileChooserButton;
  @FXML private Label hourFilePathLabel;
  @FXML private Button showHourFileChooserButton;
  @FXML private Label minuteFilePathLabel;
  @FXML private Button showMinuteFileChooserButton;
  @FXML private Label secondFilePathLabel;
  @FXML private Button showSecondFileChooserButton;

  // Digital
  @FXML private CheckBox timerModeCheckBox;
  @FXML private ChoiceBox fontChoiceBox;
  @FXML private Button showFontFileChooserButton;
  @FXML private ColorPicker baseFontColorPicker;
  @FXML private ColorPicker beforeFontColorPicker;
  @FXML private ColorPicker afterFontColorPicker;
  @FXML private Slider opacitySlider;
  @FXML private Spinner<Double> opacitySpinner;
  @FXML private CheckBox shiftToClockCheckBox;

  @Override
  public void initialize(URL url, ResourceBundle resourceBundle) {
    final ObservableList<String> displayMode = FXCollections.observableArrayList("常時", "指定時");
    this.frontAnimationDisplayModeChoiceBox.setItems(displayMode);
    this.backAnimationDisplayModeChoiceBox.setItems(displayMode);

    this.displayDatePicker1.valueProperty().addListener((observable, oldValue, newValue) -> {

    });
    this.opacitySlider.valueProperty().addListener((observable, oldValue, newValue) -> {

    });
    this.opacitySpinner.valueProperty().addListener((observable, oldValue, newValue) -> {

    });
  }

  @FXML
  protected void onCheckBoxClick(ActionEvent event) {
    switch (((CheckBox)event.getSource()).getId()) {
      case "digitalModeCheckButton":
        break;
      case "displayAnimationInFrontCheckBox":
        break;
      case "frontAnimationCheckBox":
        break;
      case "backAnimationCheckBox":
        break;
      case "timerModeCheckBox":
        break;
      case "shiftToClockCheckBox":
        break;
      default:
        throw new IllegalStateException("Unexpected value: " + event.getSource());
    }
  }
  @FXML
  protected void onDisplayModeChanged(ActionEvent event) {
    switch (((ChoiceBox)event.getSource()).getId()) {
      case "frontAnimationDisplayModeChoiceBox":
        break;
      case "backAnimationDisplayModeChoiceBox":
        break;
      default:
        throw new IllegalStateException("Unexpected value: " + event.getSource());
    }
  }
  @FXML
  protected void onFontChanged(ActionEvent event) {
    System.out.println("low");
  }
  @FXML
  protected void onFontColorChanged(ActionEvent event) {

  }
  @FXML
  protected void onOpacityChangedWithSlider(MouseEvent event) {

  }
  @FXML
  protected void onOpacityChangedWithSpinner(ActionEvent event) {
    System.out.println("low");
  }
}
