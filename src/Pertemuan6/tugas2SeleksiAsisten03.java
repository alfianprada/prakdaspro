package Pertemuan6;

import java.util.Scanner;

public class tugas2SeleksiAsisten03 {
    public static void main(String[] args) {
        Scanner al = new Scanner(System.in);

        System.out.print("Apakah mahasiswa aktif? (ya/tidak): ");
        boolean aktif = al.nextBoolean();
        System.out.print("Apakah mahasiswa tidak sedang mendapatkan sanksi akademik? (ya/tidak): ");
        boolean sanksi = al.nextBoolean();

        if (!sanksi && aktif) {
             System.out.print("Berapakah nilai dasar pemrograman anda: ");
             int nilaiDaspro = al.nextInt();
             System.out.print("Apakah anda memiliki sertifikat kompetensi pemrograman? (ya/tidak): ");
             boolean sertifikat = al.nextBoolean();
            if (nilaiDaspro >= 78 || sertifikat) {
                System.out.println("Mahasiswa akan dipanggil untuk mengikuti wawancara");
                System.out.print("Berapa nilai wawancara anda : ");
                int nilaiW = al.nextInt();
                if (nilaiW >73) {
                    System.out.println("Selamat Anda diterima sebagai asisten");
                } else {
                    System.out.println("Mohon maaf anda tidak diterima menjadi asisten karena nilai kurang dari ketentuan");
                }
            } else {
                System.out.println("Mohon maaf anda belum memenuhi syarat");
            }
        }else {
            System.out.println("Maaf anda tidak dapat mengikuti seleksi");
        }
    }
}
