/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rcycle_projek.model;

/**
 *
 * @author LENOVO
 */

public class VIPCustomer extends CallRequest {
    private String memberID; // Menyimpan ID anggota

    public VIPCustomer(String namaPelanggan, String alamat, String noTelp, String memberID) {
        super(namaPelanggan, alamat, noTelp);
        this.memberID = memberID; // Inisialisasi ID anggota
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo(); // Menampilkan informasi dasar
        System.out.println("Member ID: " + memberID); // Menampilkan Member ID
        System.out.println("Status: Diprioritaskan"); // Menampilkan status
    }

    // Getter dan Setter untuk memberID
    public String getMemberID() {
        return memberID;
    }

    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }
}
