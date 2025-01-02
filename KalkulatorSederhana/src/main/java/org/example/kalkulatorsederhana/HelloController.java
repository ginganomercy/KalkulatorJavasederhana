package org.example.kalkulatorsederhana;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField tfBilanganPertama;
    @FXML
    private TextField tfBilanganKedua;
    @FXML
    private Button btnTambah;
    @FXML
    private Button btnKurang;
    @FXML
    private Button btnKali;
    @FXML
    private Button btnBagi;
    @FXML
    private Button tfhasil;
    @FXML
    private TextField tfHasil;

    @FXML
    public void onButtonClicked(ActionEvent e) {
        BilanganModel bilanganModel = new BilanganModel();

        // Try-catch untuk menghindari masukan selain angka
        try {
            // Mengambil dan mem-parsing nilai dari tfBilanganPertama
            bilanganModel.setBilanganPertama(
                    Double.parseDouble(tfBilanganPertama.getText()));
            // Mengambil dan mem-parsing nilai dari tfBilanganKedua
            bilanganModel.setBilanganKedua(
                    Double.parseDouble(tfBilanganKedua.getText()));
        } catch (NumberFormatException exception) {
            tfHasil.setText("Masukkan hanya boleh angka");
            return;
        }

        // Logika perhitungan berdasarkan tombol yang ditekan
        if (e.getTarget().equals(btnTambah)) {
            bilanganModel.setHasil(bilanganModel.getBilanganPertama()
                    + bilanganModel.getBilanganKedua());
            tfHasil.setText(String.valueOf((bilanganModel.getHasil())));
        } else if (e.getTarget().equals(btnKurang)) {
            bilanganModel.setHasil(bilanganModel.getBilanganPertama()
                    - bilanganModel.getBilanganKedua());
            tfHasil.setText(String.valueOf((bilanganModel.getHasil())));
        } else if (e.getTarget().equals(btnKali)) {
            bilanganModel.setHasil(bilanganModel.getBilanganPertama()
                    * bilanganModel.getBilanganKedua());
            tfHasil.setText(String.valueOf((bilanganModel.getHasil())));
        } else if (e.getTarget().equals(btnBagi)) {
            bilanganModel.setHasil(bilanganModel.getBilanganPertama()
                    / bilanganModel.getBilanganKedua());
            tfHasil.setText(String.valueOf((bilanganModel.getHasil())));
        }
    }
}