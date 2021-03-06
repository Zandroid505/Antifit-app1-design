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
import java.time.LocalDate;
import java.util.ResourceBundle;

public class IndividualListController implements Initializable {

    @FXML private Label titleLabel;
    @FXML private TextField descriptionTextField;
    @FXML private TextField deadlineTextField;
    @FXML private TableView<ToDoList> listTableView;
    @FXML private TableColumn<ToDoList, String> descriptionsColumn;
    @FXML private TableColumn<ToDoList, LocalDate> deadlineColumn;
    @FXML private TableColumn<ToDoList, CheckBox> taskCompletion;


    public void goBackToListMenu(ActionEvent backButton) throws IOException {
        //Switch scene back to List menu
        Parent listMenuParent = FXMLLoader.load(getClass().getResource("ToDoListMenu.fxml"));
        Stage stage = (Stage)((Node)backButton.getSource()).getScene().getWindow();
        Scene listMenuScene = new Scene(listMenuParent);

        stage.setScene(listMenuScene);
        stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //Set dueDate default to current day
        //Assign title to Label

        //Set cell values to data stored in current toDoList Object
        //Set cell value of taskCompletion to checkboxes

        //Make description editable
        //Make dueDate editable
    }

    public void addNewTask(ActionEvent event) {
        //Add due date and descriptions to current to do list object

        //Get all items from the table as a list
        //Add new description and dueDate to tableView
    }

    public void deleteTask(ActionEvent delTaskButtonPressed) {
        //Delete selected task from table
            //Description and deadline/dueDate
    }

    public void showCompletedTasks(ActionEvent completeTasksButtonPressed) {
        //Show only tasks that are checked off
    }

    public void showIncompleteTasks(ActionEvent incompleteTasksButtonPressed) {
        //Show only tasks that are not checked off
    }





}
