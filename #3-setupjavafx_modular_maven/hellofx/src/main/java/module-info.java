module org.hellojavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql; // Diperlukan untuk JDBC/MySQL

    // Membuka package controller untuk diakses oleh FXML runtime
    opens org.hellojavafx to javafx.fxml;

    // Mengekspor package utama agar dapat diakses dari luar
    exports org.hellojavafx;
}
