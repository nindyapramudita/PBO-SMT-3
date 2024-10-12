/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// ini buat nyambungi komunikasi antar package atau classnya gitu
package com.mycompany.rcycle_projek.service;

import com.mycompany.rcycle_projek.model.CallRequest;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author LENOVO
 */
public class CallRecycleService extends RecycleService implements ICrudService {
    private List<CallRequest> daftarRequest = new ArrayList<>();

    // Implementasi dari ICrudService
    @Override
    public void tambahRequest(CallRequest request) {
        daftarRequest.add(request);
        System.out.println("Request berhasil ditambahkan!");
    }

    @Override
    public List<CallRequest> semuaRequest() {
        return daftarRequest;
    }

    @Override
    public void hapusRequest(int index) {
        if (index >= 0 && index < daftarRequest.size()) {
            daftarRequest.remove(index);
            System.out.println("Request berhasil dihapus.");
        } else {
            System.out.println("Index tidak valid.");
        }
    }

    // Metode tambahan dari abstract class
    @Override
    public void tampilkanInformasiLayanan() {
        System.out.println("=== Informasi Layanan ===");
        System.out.println("1. Pengambilan sampah plastik secara langsung ke rumah.");
        System.out.println("2. Layanan tersedia dari Senin hingga Sabtu.");
        System.out.println("3. Hubungi admin melalui aplikasi untuk penjadwalan.");
    }
}