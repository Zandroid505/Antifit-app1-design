package mainApp;

import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.CheckBox;

import java.time.LocalDate;

public class Task {
    private SimpleStringProperty description;
    private LocalDate deadline;
    private CheckBox completion;
    private static int amntOfTasks;

    public Task(String description, LocalDate deadline) {
        //Assign description to parameter (call SimpleStringProperty constructor)
        //Assign dueDate to parameter
        //call CheckBox constructor
        //amntOfTasks++
    }

    public String getDescription() {
        return description.get();
    }

    public SimpleStringProperty descriptionProperty() {
        return description;
    }

    public void setDescription(String description) {
        this.description.set(description);
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public CheckBox getCompletion() {
        return completion;
    }

    public void setCompletion(CheckBox completion) {
        this.completion = completion;
    }
}
