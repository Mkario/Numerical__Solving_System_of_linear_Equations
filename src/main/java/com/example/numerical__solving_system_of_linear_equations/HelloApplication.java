package com.example.numerical__solving_system_of_linear_equations;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.event.*;

import java.io.IOException;
import java.util.ArrayList;

public class HelloApplication extends Application {


    @Override
    public void start(Stage stage) throws IOException  {
        GUI LETtheFUNbegin = new GUI();
        LETtheFUNbegin.Welcome();
    }

    public static void main(String[] args) {
        launch();
    }
}