package org.example.kalkulatorsederhana;

public class BilanganModel {
    private double BilanganPertama;
    private double BilanganKedua;
    private double hasil;

    // Getter dan Setter untuk bilanganPertama
    public double getBilanganPertama() {
        return BilanganPertama;
    }

    public void setBilanganPertama(double bilanganPertama) {
        this.BilanganPertama = bilanganPertama;
    }

    // Getter dan Setter untuk bilanganKedua
    public double getBilanganKedua() {
        return BilanganKedua;
    }

    public void setBilanganKedua(double bilanganKedua) {
        this.BilanganKedua = bilanganKedua;
    }

    // Getter dan Setter untuk hasil
    public double getHasil() {
        return hasil;
    }

    public void setHasil(double hasil) {
        this.hasil = hasil;
    }
}