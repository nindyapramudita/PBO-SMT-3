/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// ini buat nyambungi komunikasi antar package atau classnya gitu
package com.mycompany.rcycle_projek.service;
import com.mycompany.rcycle_projek.model.CallRequest;
import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class CallRecycleService {
    // Static variable untuk menyimpan jumlah total request
    public static int totalRequest = 0; //ada staticnya disini
    
    // ArrayList untuk menyimpan data request 
    private ArrayList<CallRequest> daftarRequest = new ArrayList<>();

    // Method untuk menambah request ke dalam daftar
    public void tambahRequest(CallRequest request) {
        daftarRequest.add(request);
        totalRequest++; // Increment jumlah total request
        System.out.println("Request berhasil ditambahkan!");
    }

    // Method untuk menampilkan semua request yang sudah ada
    public void tampilkanSemuaRequest() {
        if (daftarRequest.isEmpty()) { //disini juga ada percabangan if else yah
            System.out.println("Belum ada pelanggan yang menghubungi.");
        } else {
            System.out.println("=== Daftar Pelanggan yang Menghubungi ===");
            for (CallRequest request : daftarRequest) {
                request.tampilkanInfo();
                System.out.println("----------------------");
            }
            // Tampilkan jumlah total request dengan menggunakan static variable
            System.out.println("Total Request: " + totalRequest);
        }
    }

    // Method untuk menampilkan informasi layanan
    public void tampilkanInformasiLayanan() {
        System.out.println("=== Informasi Layanan ===");
        System.out.println("1. Pengambilan sampah plastik secara langsung ke rumah.");
        System.out.println("2. Layanan tersedia dari Senin hingga Sabtu yah.");
        System.out.println("3. Hubungi admin melalui aplikasi untuk penjadwalan.");
    }
}