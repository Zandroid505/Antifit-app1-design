/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */

package mainApp;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import mainApp.ToDoList;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ToDoListMenuController {
    //Configure opening to-do list menu
    @FXML private ListView<ToDoList> toDoLists;
    @FXML private TextField newListTitle;
    @FXML private Button newListButton;
    @FXML private Button deleteListButton;
    @FXML private Button openListButton;


    ObservableList<ToDoList> lists = FXCollections.observableArrayList();

    public void addNewList(ActionEvent buttonPressed) {
        //if(newListTitle isn't empty)
            //Add newListTitle ListView (toDoLists)

        //call refresh
    }

    private void refresh() {
        //Clear title field
    }

    public void openList(ActionEvent event) throws IOException {
        //if(list is selected and openListButton is selected)
            //Switch to individualList scene (fxml file) pass title name
            Parent individualListViewParent = FXMLLoader.load(getClass().getResource("IndividualList.fxml"));
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            Scene individualListViewScene = new Scene(individualListViewParent);

            stage.setScene(individualListViewScene);
            stage.show();
    }

    public void deleteList(ActionEvent event) {
        //if(list is selected and removeListButton is selected)
            //Delete selectedList
    }





}
