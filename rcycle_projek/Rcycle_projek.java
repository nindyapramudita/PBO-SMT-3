/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rcycle_projek;

import com.mycompany.rcycle_projek.model.CallRequest;
import com.mycompany.rcycle_projek.model.RegularCustomer;
import com.mycompany.rcycle_projek.model.VIPCustomer;
import com.mycompany.rcycle_projek.service.CallRecycleService;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Rcycle_projek {
    public static void main(String[] args) {
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

            switch (pilihan) {
                case 1:
                    // Input data pelanggan
                    System.out.print("Nama Anda: ");
                    String nama = scanner.nextLine();
                    System.out.print("Alamat Anda: ");
                    String alamat = scanner.nextLine();
                    System.out.print("No. Telepon: ");
                    String noTelp = scanner.nextLine();

                    // Memilih tipe pelanggan
                    System.out.println("Pilih Tipe Pelanggan:");
                    System.out.println("1. Regular Customer");
                    System.out.println("2. VIP Customer");
                    System.out.print("Pilih tipe: ");
                    int tipe = scanner.nextInt();
                    scanner.nextLine();  // Menangani newline character

                    CallRequest request;
                    if (tipe == 1) {
                        // Membuat objek RegularCustomer tanpa tingkat loyalitas
                        request = new RegularCustomer(nama, alamat, noTelp);
                    } else if (tipe == 2) {
                        System.out.print("Member ID: ");
                        String memberID = scanner.nextLine();
                        request = new VIPCustomer(nama, alamat, noTelp, memberID);
                    } else {
                        System.out.println("Tipe pelanggan tidak valid, menggunakan Regular Customer secara default.");
                        request = new RegularCustomer(nama, alamat, noTelp);
                    }

                    // Menambah request ke dalam service
                    service.tambahRequest(request);
                    break;
                case 2:
                    // Menampilkan informasi layanan
                    service.tampilkanInformasiLayanan();
                    break;
                case 3:
                    // Menampilkan semua request yang sudah masuk
                    List<CallRequest> semuaRequest = service.semuaRequest();
                    if (semuaRequest.isEmpty()) {
                        System.out.println("Belum ada pelanggan yang menghubungi");
                    } else {
                        System.out.println("=== Daftar Pelanggan Yang Menghubungi ===");
                        for (CallRequest req : semuaRequest) {
                            req.tampilkanInfo();
                            System.out.println("----------------------");
                        }
                        System.out.println("Total request: " + semuaRequest.size());
                    }
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