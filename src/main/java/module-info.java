module gb.safronov.client {
    requires javafx.controls;
    requires javafx.fxml;


    opens gb.client to javafx.fxml;
    exports gb.client;
    exports gb.client.controllers;
    opens gb.client.controllers to javafx.fxml;
}