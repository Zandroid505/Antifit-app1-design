/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */

package mainApp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ToDoListMenuController implements Initializable {
    //Configure opening to-do list menu
    @FXML private ListView<ToDoList> toDoListView;
    @FXML private TextField newListTitle;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //Add to do list titles to listView
        //add listener to make cell editable
    }


    public void addNewList(ActionEvent newListButtonPressed) {
        //if(newListTitle isn't empty and is at least 3 characters long)
            //Add newListTitle to ListView (toDoLists)
            //call refresh
    }

    private void refresh() {
        //Clear title field
    }

    public void openList(ActionEvent openListButtonPressed) throws IOException {
        //if(list is selected and openListButton is selected)
            //Pass currently selected toDoList object to IndividualListController
            //Switch to individualList scene (fxml file) pass title name

        Parent individualListViewParent = FXMLLoader.load(getClass().getResource("IndividualList.fxml"));
        Stage stage = (Stage)((Node)openListButtonPressed.getSource()).getScene().getWindow();
        Scene individualListViewScene = new Scene(individualListViewParent);

        stage.setScene(individualListViewScene);
        stage.show();
    }

    public void deleteList(ActionEvent delListButtonPressed) {
        //if(list is selected and removeListButton is selected)
            //Delete selectedList from listView
    }

    public void editTitle(ActionEvent editTitleButtonPressed) {
        //Change to do list title based on input in textField
    }


    public void saveSelectedLists(ActionEvent saveButtonPressed) {
        //if(one or more lists are selected)
            //String temp = createOutputListString(selected lists)
            //Write temp to new file

            //Open file explorer
            //Let user choose where to save to do list(s)
            //Save to location
    }

    public void openPreviouslySavedLists(ActionEvent openSavedFileButtonPressed) {
        //Open file explorer
        //Let user open .txt file
        //Populate listView with .txt file
    }






}
