package com.example;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class PrimaryController {

    @FXML
    public void handleBukaJendelaBaru(ActionEvent event) {
        try {
            // 1. Muat FXML untuk tampilan jendela baru
            FXMLLoader loader = new FXMLLoader(getClass().getResource("FormulirBaruView.fxml"));
            Parent root = loader.load();
            
            // 2. Buat objek Stage baru (Jendela baru)
            Stage stageBaru = new Stage();
            
            // 3. Konfigurasi Stage baru
            stageBaru.setTitle("Formulir Entri Data Baru");

            // Opsional: Mengatur Stage baru sebagai MODAL
            stageBaru.initModality(Modality.APPLICATION_MODAL); 
            stageBaru.initOwner(((Node) event.getSource()).getScene().getWindow());
            
            // 4. Buat Scene baru dari Parent yang dimuat
            Scene sceneBaru = new Scene(root);
            stageBaru.setScene(sceneBaru);
            
            // 5. Tampilkan Stage baru
            stageBaru.show();
            
        } catch (IOException e) {
            e.printStackTrace();
            // Tambahkan dialog error jika FXML tidak ditemukan
        }
    }
}
