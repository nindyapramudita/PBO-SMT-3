/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rcycle_projek.model;

/**
 *
 * @author LENOVO
 */
public class CallRequest {
    private String namaPelanggan;
    private String alamat;
    private String noTelp;

    // Constructor disini ada
    public CallRequest(String namaPelanggan, String alamat, String noTelp) {
        this.namaPelanggan = namaPelanggan;
        this.alamat = alamat;
        this.noTelp = noTelp;
    }


    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public void setNamaPelanggan(String namaPelanggan) {
        this.namaPelanggan = namaPelanggan;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    // Method untuk menampilkan informasi pelanggan
    public void tampilkanInfo() {
        System.out.println("Nama Pelanggan: " + namaPelanggan);
        System.out.println("Alamat: " + alamat);
        System.out.println("No. Telepon: " + noTelp);
    }
}