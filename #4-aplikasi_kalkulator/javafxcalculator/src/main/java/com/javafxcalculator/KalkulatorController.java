package com.javafxcalculator;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class KalkulatorController {
    // Injeksi komponen UI dari FXML (harus sama dengan fx:id)
    @FXML private TextField txtAngka1;
    @FXML private TextField txtAngka2;
    @FXML private Label lblHasil;
    
    @FXML
    private void handleHitungJumlah(ActionEvent event) {
        try {
            // 1. Ambil teks dari TextField dan konversi ke Double
            double a = Double.parseDouble(txtAngka1.getText());
            double b = Double.parseDouble(txtAngka2.getText());
            
            // 2. Proses Logika
            double hasil = a + b;
            
            // 3. Tampilkan hasil di Label
            lblHasil.setText("HASIL: " + String.format("%.2f", hasil));
            
        } catch (NumberFormatException e) {
            // Penanganan error jika input bukan angka
            lblHasil.setText("ERROR: Masukkan hanya angka!");
        }
    }

}
