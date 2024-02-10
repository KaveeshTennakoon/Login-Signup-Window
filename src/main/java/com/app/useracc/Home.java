package com.app.useracc;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;


public class Home {

    @FXML
    private AnchorPane HomeWin;

    @FXML
    private Button loginwin;

    @FXML
    private Button signupwin;

    @FXML
    void loginwin() throws IOException {
        new SceneSwitch(HomeWin, "Login.fxml");

    }
}