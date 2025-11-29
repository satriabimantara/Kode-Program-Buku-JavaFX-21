package com.example;

// FormulirBaruController.java
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class FormulirBaruController {
    
    @FXML
    private Button btnTutup;

    /**
     * Metode ini dipanggil saat tombol "Tutup Jendela" diklik.
     */
    @FXML
    private void handleTutup(ActionEvent event) {
        // Mendapatkan referensi ke Stage (jendela) saat ini dari tombol
        Stage stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
        
        // Menutup Stage/Jendela
        stage.close();
    }
}