module com.oop.mahadi.demo1cores {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.oop.mahadi.demo1cores to javafx.fxml;
    exports com.oop.mahadi.demo1cores;
}