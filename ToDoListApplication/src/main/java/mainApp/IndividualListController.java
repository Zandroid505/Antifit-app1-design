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
import mainApp.ToDoList;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class IndividualListController implements Initializable {

    @FXML private Label toDoListTitle;
    @FXML private Button goBackButton;
    @FXML private Button addTaskButton;
    @FXML private TableView<DatePicker> taskDueDates;
    @FXML private TableView<String> taskDescriptions;


    public void goBackToListMenu(ActionEvent event) throws IOException {
        Parent listMenuParent = FXMLLoader.load(getClass().getResource("ToDoListMenu.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene listMenuScene = new Scene(listMenuParent);

        stage.setScene(listMenuScene);
        stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //Set dueDate default to current day
        //Assign title
    }

    public void addNewTask()


}
