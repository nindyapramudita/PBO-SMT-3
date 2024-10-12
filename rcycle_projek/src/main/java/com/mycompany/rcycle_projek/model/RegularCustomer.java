/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rcycle_projek.model;

/**
 *
 * @author LENOVO
 */

public class RegularCustomer extends CallRequest {

    public RegularCustomer(String namaPelanggan, String alamat, String noTelp) {
        super(namaPelanggan, alamat, noTelp);
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo(); // Menampilkan informasi dasar
        System.out.println("Status: Tidak Prioritas"); // Menampilkan status
    }
}
