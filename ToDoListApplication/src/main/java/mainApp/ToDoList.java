/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */

package mainApp;

import javafx.scene.control.TableView;
import java.time.LocalDate;

public class ToDoList {
    private String title;
    private TableView<String> descriptions;
    private TableView<LocalDate> dueDate;

    public ToDoList(String title) {
        //Assign name to parameter
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public TableView<String> getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(TableView<String> descriptions) {
        this.descriptions = descriptions;
    }

    public TableView<LocalDate> getDueDate() {
        return dueDate;
    }

    public void setDueDate(TableView<LocalDate> dueDate) {
        this.dueDate = dueDate;
    }
}
