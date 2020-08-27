package sample.Main8;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;



public class Controller {
    @FXML
    private TextField height;

    public void Submit(ActionEvent actionEvent) {
        String Height = height.getText();
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Chiều cao của bạn: " + Height + "cm");
        alert.show();
    }
}
