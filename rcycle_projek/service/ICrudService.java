/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.rcycle_projek.service;

import com.mycompany.rcycle_projek.model.CallRequest;
import java.util.List;
/**
 *
 * @author LENOVO
 */
public interface ICrudService {
    void tambahRequest(CallRequest request);    // Tambah request
    List<CallRequest> semuaRequest();           // Dapatkan semua request
    void hapusRequest(int index);               // Hapus request berdasarkan index
}
