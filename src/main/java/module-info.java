module com.app.useracc {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.app.useracc to javafx.fxml;
    exports com.app.useracc;
}