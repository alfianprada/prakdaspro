package Pertemuan10;

import java.util.Scanner;

public class NilaiMhs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         String nama,status,keputusan;
         int kuis,uts,uas,tugas=0,total=0,rataT=0;
         double nA;

         do {
            System.out.print("Nama Mahasiswa : ");
            nama = sc.nextLine();
            
            System.out.print("Nilai Kuis : ");
            kuis = sc.nextInt();
            System.out.print("Nilai UTS  : ");
            uts = sc.nextInt();
            System.out.print("Nilai UAS  : ");
            uas = sc.nextInt();
            for (int i = 1; i < 3; i++) {
                System.out.print("Nilai Tugas "+i+" : ");
                tugas = sc.nextInt();
                if (tugas <= 0 && tugas >=100) {
                System.out.println("Nilai tidak valid, ulangi!!");
                continue;
                }
                total+=tugas;
            }
            
            rataT = tugas/2;
            nA = (0.35*kuis)+(0.15*uts)+(0.30*uas)+(0.20*rataT);
            if (nA > 50) {
                status = "LULUS";
            } else {
                status = "TIDAK LULUS";
            }
            
            System.out.println("Rata-rata tugas : "+rataT);
            System.out.println("Nilai Akhir     : "+nA);
            System.out.println("Status          : "+status);

            System.out.print("Tambah Mahasiswa? (y/t) : ");
            keputusan=sc.nextLine();
            
         } while (keputusan.equalsIgnoreCase("y"));
         sc.close();
    }
}
