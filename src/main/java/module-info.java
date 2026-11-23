module com.sea.mytunesv1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.sea.mytunesv1 to javafx.fxml;
    exports com.sea.mytunesv1;
}