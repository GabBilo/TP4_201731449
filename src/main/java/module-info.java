module org.calma.TP4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.calma.TP4 to javafx.fxml;
    exports org.calma.TP4;
}