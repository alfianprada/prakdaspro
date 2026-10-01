package Pertemuan5;

import java.util.Scanner;

public class Tugas1Pemilihan03 {
    public static void main(String[] args) {
        Scanner alfian = new Scanner(System.in);

        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = alfian.nextBoolean();
        String nama;

        nama = (uktLunas) ? "Pembayaran UKT terverifikasi\nSilahkan cetak KRS dan minta tanda tangan DPA"
         :"Registrasi ditolak. Silakan lunasi UKT terlebih dahulu";

        System.out.println(nama);

    }
}
