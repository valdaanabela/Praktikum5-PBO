// ValdaAnabela_L0325035
package praktikum5.tugas;

public class MainDiary {
    public static void main(String[] args) {
        // Instansiasi objek BukuHarian
        BukuHarian diary = new BukuHarian("Valda");

        // Menambahkan dua catatan harian
        diary.tulisCatatan("12-09-2026", "Hari ini belajar I/O Stream dan persistensi data Java.");
        diary.tulisCatatan("13-09-2026", "Selesai mengerjakan tugas praktikum Modul 5.");
        diary.tulisCatatan("14-09-2026", "Belajar UTS PBO.");
        diary.tulisCatatan("15-09-2026", "Mengerjakan project PBO.");

        // Membaca dan menampilkan catatan harian ke konsol
        diary.bacaCatatan();
    }
}