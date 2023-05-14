package com.example.hpahfx.vue;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class StartVue extends VBox {
    public Label welcomeText = new Label("Welcome");
    public Button welcomeButton = new Button("Click me");
    TextField textField = new TextField("What is your name");

    public StartVue(){
        welcomeText.getStyleClass().add("label");
        welcomeButton.getStyleClass().add("btn");
        welcomeText.getStyleClass().add("text");

        this.getChildren().addAll(welcomeText, welcomeButton, textField);
    }
}
