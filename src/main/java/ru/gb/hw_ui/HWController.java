package ru.gb.hw_ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HWController {
    @FXML
    private  TextArea chatArea;
    @FXML
    private TextField MessageField;

    public void onSendButtonClick(ActionEvent actionEvent) {
            final String Message = MessageField.getText();
            if (!"".equals(Message)) {
                chatArea.appendText(Message + "\n");
            }

        MessageField.clear();
    }
}