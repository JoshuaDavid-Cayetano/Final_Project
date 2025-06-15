package com.example.clientapp;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Client App");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
