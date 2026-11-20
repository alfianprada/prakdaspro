//50 + (3 mod 50) = 53

package Pertemuan12;

import java.util.Scanner;

public class SearchNilai03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlah;
        int key;
        boolean ditemukan = false;

        System.out.print("Masukkan jumlah elemen array : ");
        jumlah = input.nextInt();
        int[] nilai = new int[jumlah];

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan elemen array indeks ke-"+ i +" : ");
            nilai[i]=input.nextInt();
        }

        System.out.print("Masukkan key : ");
        key = input.nextInt();
        
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + i);
                System.out.println("Posisi Elemen : "+ (i+1));
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Nilai yang dicari tidak ditemukan!");
            System.out.println("Nilai pencarian: " + key);
            System.out.println("Jumlah elemen array: " + nilai.length);
            System.out.println("Indeks yang diperiksa: 0 sampai " + (nilai.length - 1));
            System.out.println("Silakan masukkan nilai yang tersedia.");
        }
    }
}
