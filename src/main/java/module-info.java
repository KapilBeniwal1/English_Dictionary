module com.example.dictonary_kapil {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.dictonary_kapil to javafx.fxml;
    exports com.example.dictonary_kapil;
}