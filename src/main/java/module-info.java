module com.example.separatortutorial {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.separatortutorial to javafx.fxml;
    exports com.example.separatortutorial;
}