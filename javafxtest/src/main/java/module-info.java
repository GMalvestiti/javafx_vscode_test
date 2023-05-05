module com.javafxtest {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.javafxtest to javafx.fxml;
    exports com.javafxtest;
}
