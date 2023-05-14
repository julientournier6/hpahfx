package com.example.hpahfx;

import com.example.hpahfx.vue.StartController;
import com.example.hpahfx.vue.StartVue;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("first_view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Harry Potter at Home");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}