package Pertemuan7;

import java.util.Scanner;

public class StudiKasus203 {
    public static void main(String[] args) {
        Scanner al = new Scanner(System.in);

        System.out.print("Nama Mahasiswa  : ");
        String nama = al.nextLine();
        System.out.print("Jenis Kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        String kegiatan = al.nextLine();
        System.out.print("Jumlah dokumen  : ");
        int dokumen = al.nextInt();
        
        if (dokumen ==4) {
            if (kegiatan.equalsIgnoreCase("BELMAWA") 
                || kegiatan.equalsIgnoreCase("BAKORMA") 
                || kegiatan.equalsIgnoreCase("Mandiri")) {
                System.out.print("Peringkat Juara : ");
                int juara = al.nextInt();
                if (juara >= 1 && juara <= 3) {
                    System.out.println("Status : Dana penghargaan diberikan");
                } else {
                    System.out.println("Status : Dana tidak diberikan karena bukan juara 1, 2, atau 3");
                }
            } else {
                if (kegiatan.equalsIgnoreCase("PKM")) {
                    al.nextLine();
                    System.out.print("Apakah PKM lolos pendanaan? (lulus/tidak) : ");
                    String lolosP = al.nextLine();
                    if (lolosP.equalsIgnoreCase("lulus")) {
                        System.out.println("Status : Dana penghargaan diberikan");
                    } else {
                        System.out.println("Status : Dana penghargaan tidak diberikan karena PKM tidak lolos pendanaan");
                    }
                } else {
                    System.out.println("Status : Dana Penghargaan tidak diberikan karena mengikuti kegiatan lainnya");
                }
            }
        } else {
            System.out.println("Status : Dokumen tidak lengkap (kurang "+ (4-dokumen)+
            " dokumen).Dana penghargaan tidak diberikan.");
        }
    }
}
