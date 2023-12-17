
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

import Controller.TiketController;
import model.TiketPesawat;
import model.Penumpang;
import model.Admin;

public class Result {

    public static void main(String[] args) throws Exception {
        TiketController tiketController = new TiketController();
        tiketController.setUp();
        boolean lanjut = true;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (lanjut) {
            tampilkanMenu();
            System.out.print("Pilih Tiket:");
            String pilihan = reader.readLine();
            switch (pilihan) {
                case "1":
                    tiketController.lihatDaftarTiketPesawat();
                    break;
                case "2":
                    tiketController.belanja();
                    break;
                case "3":
                    tiketController.tampilkanLaporanPenjualan();
                    break;
                default:
                    lanjut = false;
                    break;
            }
        }

        System.out.println("Sampai Jumpa");

    }

    public static void tampilkanMenu() {
        System.out.println("1. Lihat daftar Tiket Pesawat");
        System.out.println("2. Belanja");
        System.out.println("3. Laporan Penjualan");
        System.out.println("4. Keluar");
    }
}