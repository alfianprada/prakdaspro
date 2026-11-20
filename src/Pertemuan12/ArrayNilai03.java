//60 + (3 mod 41)=63

package Pertemuan12;

import java.util.Scanner;

public class ArrayNilai03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nilaiAkhir = new int[10];
        int lulus = 0;
        int tlulus = 0;
        String status;
        
        for (int i = 0; i < nilaiAkhir.length; i++) {
        System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
        nilaiAkhir[i] = input.nextInt();
        }
        System.out.println();
        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70) {
                status = "LULUS";
                lulus++;
            } else {
                status = "TIDAK LULUS";
                tlulus++;
            }
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + " (" +
        status + ")");
        }
        System.out.println("============================================");
        System.out.println("Jumlah Mahasiswa yang lulus       : "+ lulus);
        System.out.println("Jumlah Mahasiswa yang tidak lulus : "+ tlulus);
    }
}
