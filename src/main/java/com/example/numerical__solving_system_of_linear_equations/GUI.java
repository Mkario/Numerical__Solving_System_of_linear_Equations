package com.example.numerical__solving_system_of_linear_equations;

import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GUI {
    Stage st = new Stage();
    void Welcome()
    {
        Button WelcomeButton = new Button("Welcome!");
        WelcomeButton.setText("Hello!");
        WelcomeButton.setOnAction(e ->
        {
            inputTaker();
        });
        StackPane layout = new StackPane();
        layout.getChildren().add(WelcomeButton);
        Scene scene = new Scene(layout, 300, 300);
        st.setScene(scene);
        st.show();
    }
    void inputTaker()
    {
        Button AfterInputIsTaken = new Button("next!");
        VBox layout = new VBox();
        AfterInputIsTaken.setOnAction(e -> {
            methodPicker();
        });
        Node y = new Label("Please insert the equations!");
        layout.getChildren().add(0,y);
        layout.getChildren().add(AfterInputIsTaken);
        Scene scene1 = new Scene(layout, 300, 300);
        st.setScene(scene1);
        st.show();

    }
    void methodPicker()
    {
        Button AfterMethodIsChosen = new Button("next!");
        VBox layout = new VBox();
        Node y = new Label("Please insert the method!");
        AfterMethodIsChosen.setOnAction(e -> {
            needParameterOrNot();
        });
        layout.getChildren().add(0,y);
        layout.getChildren().add(1,AfterMethodIsChosen);
        Scene scene1 = new Scene(layout, 300, 300);
        st.setScene(scene1);
        st.show();
    }
    void needParameterOrNot()
    {
        int type = 0;
        if(type == 1) {
            extraSceneForParameters();
        }
        else
            needInitialGuessOrNot();
    }
    void extraSceneForParameters()
    {
        Button AfterParametersAreSet = new Button("next!");

        VBox layout = new VBox();
        Node y = new Label("Please insert parameters");
        AfterParametersAreSet.setOnAction(e->
        {
            needInitialGuessOrNot();
        });
        layout.getChildren().add(0,y);
        layout.getChildren().add(1,AfterParametersAreSet);
        Scene scene1 = new Scene(layout, 300, 300);
        st.setScene(scene1);
        st.show();
    }
    void needInitialGuessOrNot()
    {
        int type = 0;
        if(type == 1)
            extraSceneForInitialGuess();
        else
            precisionSetter();
    }
    void extraSceneForInitialGuess()
    {
        Button AfterIntialGuessIsSet = new Button("next!");
        VBox layout = new VBox();
        Node y = new Label("Please insert initial Guess");
        AfterIntialGuessIsSet.setOnAction(e->{
            precisionSetter();
        });
        layout.getChildren().add(0,y);
        layout.getChildren().add(1,AfterIntialGuessIsSet);
        Scene scene1 = new Scene(layout, 300, 300);
        st.setScene(scene1);
        st.show();
    }
    void precisionSetter()
    {
        Button Solve = new Button("solve");
        VBox layout = new VBox();
        Node y = new Label("Please insert precision");
        Solve.setOnAction(e -> {
            solve();
        });
        layout.getChildren().add(0,y);
        layout.getChildren().add(1,Solve);
        Scene scene1 = new Scene(layout, 300, 300);
        st.setScene(scene1);
        st.show();
    }
    void solve()
    {
        // We'll make object and pass the every thing to it
        // 5 methods will be representing the 5 ways to
        // solve a system of linear Equations
    }
}
