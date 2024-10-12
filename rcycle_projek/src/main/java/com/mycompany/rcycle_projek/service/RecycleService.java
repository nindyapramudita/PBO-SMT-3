/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rcycle_projek.service;


import com.mycompany.rcycle_projek.model.CallRequest;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author LENOVO
 */
public abstract class RecycleService implements ICrudService {
    protected List<CallRequest> daftarRequest = new ArrayList<>();

    // Metode abstrak untuk menampilkan informasi layanan
    public abstract void tampilkanInformasiLayanan();
}
