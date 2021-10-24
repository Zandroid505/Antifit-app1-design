/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */

package mainApp;

import javafx.beans.property.SimpleStringProperty;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private SimpleStringProperty title;
    private List<Task> listTasks = new ArrayList<>();

    public ToDoList(String title) {
        //Assign title to parameter (call SimpleStringProperty constructor)
    }

    public String getTitle() {
        return title.get();
    }

    public SimpleStringProperty titleProperty() {
        return title;
    }

    public void setTitle(String title) {
        this.title.set(title);
    }

    public String createOutputListString(List<ToDoList> toDoListsToSave) {
        //StringBuilder outputFileString

        //for(amnt of toDoLists)
            //outputFileString = "'title'\n"
            //for(amount of tasks in current to do list)
                //outputFileString = "'deadline'" + "'description'"
            //outputFileString = "\n"

        //return string of outputFileString

        return "";
    }
}
