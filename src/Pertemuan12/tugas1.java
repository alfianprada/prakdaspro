//jumlah nilai mahasiswa 5 + (3 mod 11) = 8
//salah satu nilai yang diinput 3 mod 100 = 3

package Pertemuan12;

import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlah,lulus=0,tlulus=0;
        int rata2,total=0;

        System.out.print("Masukkan jumlah nilai Mahasiswa : ");
        jumlah = input.nextInt();
        int[] nilai = new int[jumlah];

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilai[i]=input.nextInt();
            total+=nilai[i];
        }
        rata2 = total/nilai.length;

        int tertinggi = nilai[0];
        int terendah = nilai[0];
        for (int i = 1; i < nilai.length; i++) {
        if (nilai[i] > tertinggi) tertinggi = nilai[i];
        if (nilai[i] < terendah) terendah = nilai[i];
        }

        System.out.println("\n=== DAFTAR NILAI MAHASISWA ===");

        for (int i = 0; i < nilai.length; i++) {
            String status;
            if (nilai[i] > 70) {
                status = "LULUS";
                lulus++;
            } else {
                status = "TIDAK LULUS";
                tlulus++;
            }
            System.out.println("Nilai Mahasiswa ke-"+ (i+1) +" adalah : "+nilai[i]+" ("+status+")");
        }
        System.out.println("\n=== HASIL PENGOLAHAN NILAI ===");
        System.out.println("Total nilai seluruh mahasiswa : " + total);
        System.out.println("Rata-rata seluruh nilai        : " + rata2);
        System.out.println("Nilai tertinggi                : " + tertinggi);
        System.out.println("Nilai terendah                 : " + terendah);
        System.out.println("Jumlah mahasiswa LULUS         : " + lulus);
        System.out.println("Jumlah mahasiswa TIDAK LULUS   : " + tlulus);
    }
}
