// ValdaAnabela_L0325035
package praktikum5.tugas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BukuHarian {
    // Atribut tanpa modifier 'private' (sesuai gaya contoh modul)
    String namaPemilik;
    String namaFile;

    // Constructor
    public BukuHarian(String namaPemilik) {
        this.namaPemilik = namaPemilik;
        this.namaFile = "diary_" + namaPemilik.toLowerCase().replaceAll("\\s+", "_") + ".txt";
    }

    // Method untuk menulis catatan harian
    public void tulisCatatan(String tanggal, String isi) {
        // Param true pada FileWriter digunakan agar data lama tidak terhapus (append mode)
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(namaFile, true))) {
            bw.write("[" + tanggal + "] - " + isi);
            bw.newLine();
            System.out.println("Catatan berhasil disimpan ke " + namaFile);
        } catch (IOException e) {
            System.out.println("Gagal menulis catatan: " + e.getMessage());
        }
    }

    // Method untuk membaca catatan harian
    public void bacaCatatan() {
        try (BufferedReader br = new BufferedReader(new FileReader(namaFile))) {
            String baris;
            boolean adaIsi = false;

            System.out.println("\n=== Catatan Harian: " + namaPemilik + " ===");
            System.out.println("===       Valda Anabela       ===");
            while ((baris = br.readLine()) != null) {
                System.out.println(baris);
                adaIsi = true;
            }

            if (!adaIsi) {
                System.out.println("Belum ada catatan harian.");
            }
        } catch (IOException e) {
            // Tangkap galat jika file belum ada
            System.out.println("Belum ada catatan harian.");
        }
    }
}