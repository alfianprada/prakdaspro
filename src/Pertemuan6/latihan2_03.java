package Pertemuan6;

import java.util.Scanner;

public class latihan2_03 {
    public static void main(String[] args) {
        Scanner al = new Scanner(System.in);

        String jenisBuku;
        int jumlahBuku;
        int diskon;

        System.out.print("Masukkan Jenis Buku  : ");
        jenisBuku = al.nextLine();
        System.out.print("Masukkan Jumlah Buku : ");
        jumlahBuku = al.nextInt();

        if (jenisBuku.equalsIgnoreCase("kamus") && jumlahBuku > 3) {
            diskon = 13;
        } else if (jenisBuku.equalsIgnoreCase("kamus")) {
            diskon = 11;
        } else if (jenisBuku.equalsIgnoreCase("novel") && jumlahBuku > 4) {
            diskon = 9;
        } else if (jenisBuku.equalsIgnoreCase("novel")) {
            diskon = 8;
        } else if (!jenisBuku.equalsIgnoreCase("kamus") && !jenisBuku.equalsIgnoreCase("novel") && jumlahBuku > 4) {
            diskon = 6;
        } else {
            diskon = 0;
        }

        System.out.println("Jumlah diskon : " +diskon+ "%");
    }
}
