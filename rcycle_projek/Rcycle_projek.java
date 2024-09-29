/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rcycle_projek;

import com.mycompany.rcycle_projek.model.CallRequest;
import com.mycompany.rcycle_projek.service.CallRecycleService;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Rcycle_projek {
    public static void main(String[] args) {
        // Inisialisasi objek 
        CallRecycleService service = new CallRecycleService();
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        System.out.println("SELAMAT DATANG SAHABAT BUMI");
        
        do {
            System.out.println("\n=== Menu CallRecycle ===");
            System.out.println("1. Hubungi Admin");
            System.out.println("2. Informasi Layanan");
            System.out.println("3. Tampilkan yang Sudah Menghubungi");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();  // Menangani newline character

            // Percabangannya disini yah
            switch (pilihan) {
                case 1:
                    // Input data pelanggan
                    System.out.print("Nama Anda: ");
                    String nama = scanner.nextLine();
                    System.out.print("Alamat Anda: ");
                    String alamat = scanner.nextLine();
                    System.out.print("No. Telepon: ");
                    String noTelp = scanner.nextLine();

                    // Membuat objek CallRequest dan menambahkannya ke dalam service
                    CallRequest request = new CallRequest(nama, alamat, noTelp);
                    service.tambahRequest(request);
                    break;
                case 2:
                    // Menampilkan informasi layanan
                    service.tampilkanInformasiLayanan();
                    break;
                case 3:
                    // Menampilkan semua request yang sudah masuk
                    service.tampilkanSemuaRequest();
                    break;
                case 4:
                    System.out.println("Keluar dari aplikasi.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, coba lagi.");
            }
        } while (pilihan != 4);

        scanner.close();
    }
}