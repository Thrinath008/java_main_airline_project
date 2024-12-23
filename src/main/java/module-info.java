module thrianth.java_main_airline_project {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires net.synedra.validatorfx;

    opens thrianth.java_main_airline_project to javafx.fxml;
    exports thrianth.java_main_airline_project;
}