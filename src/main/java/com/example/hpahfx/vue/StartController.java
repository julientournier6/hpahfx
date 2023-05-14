package com.example.hpahfx.vue;

import javafx.event.ActionEvent;

import java.util.Objects;

public class StartController {
    private StartVue startVue;

    public StartController(StartVue startVue){
        this.startVue=startVue;
        startVue.getStylesheets().add(Objects.requireNonNull(
                getClass().getResource("style.css")).toExternalForm());
        startVue.welcomeButton.setOnAction(this::onWelcomeAction);

    }

    public void onWelcomeAction(ActionEvent e){
        startVue.welcomeText.setText("Bienvenue jeune sorcier");
    }

}
