package Pertemuan5;

import java.util.Scanner;

public class TugasAntrean03 {
    public static void main(String[] args) {
        Scanner alfian = new Scanner(System.in);

        System.out.println("===============================================");
        System.out.println("|Kode |Layanan                       |Loket   |");
        System.out.println("===============================================");
        System.out.println("|1    |Legalisir ijazah              |Loket A |");
        System.out.println("|2    |Surat Keterangan aktif Kuliah |Loket B |");
        System.out.println("|3    |Pembayaran UKT                |Loket C |");
        System.out.println("|4    |Pengajuan Cuti akademik       |loket D |");
        System.out.println("===============================================");
        System.out.print("Masukkan Kode : ");
        int kode = alfian.nextInt();

        switch (kode) {
            case 1:
                System.out.println("Legalisir Ijazah,Loket A");
                break;
            case 2:
                System.out.println("Surat keterangan aktif kuliah,Loket B");
                break;
            case 3:
                System.out.println("Pembayaran UKT,Loket C");
                break;
            case 4:
                System.out.println("Pengajuan cuti akademik,Loket D");
                break;
            default:
                System.out.println("Kode tidak tersedia ;)");
        }
    }
}
