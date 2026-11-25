module com.sea.mytunesv1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires com.microsoft.sqlserver.jdbc;
    requires java.naming;


    opens com.sea.mytunesv1.GUI to javafx.fxml;
    exports com.sea.mytunesv1;
}