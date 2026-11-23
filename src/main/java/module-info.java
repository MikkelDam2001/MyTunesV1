module com.sea.mytunesv1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.sea.mytunesv1.GUI to javafx.fxml;
    exports com.sea.mytunesv1;
}