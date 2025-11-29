module com.perpustakaan {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.perpustakaan to javafx.fxml;
    exports com.perpustakaan;
}
