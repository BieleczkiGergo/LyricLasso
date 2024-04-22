module org.example.lyriclasso {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.lyriclasso to javafx.fxml;
    exports org.example.lyriclasso;
}