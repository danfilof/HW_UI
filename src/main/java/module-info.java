module ru.gb.hw_ui {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.gb.hw_ui to javafx.fxml;
    exports ru.gb.hw_ui;
}