/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */

package mainApp;


import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ToDoListMenu.fxml"));

        primaryStage.setTitle("To-do list");
        primaryStage.setScene(new Scene(root, 600, 500));

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
