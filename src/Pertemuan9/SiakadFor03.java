//Jumlah mahasiswa (batas perulangan FOR) = 8 + (3 mod 5)=11
//Batas kelulusan pada Pertanyaan no. 4 (modifikasi kode) = 55 + (3 mod 11)=58

package Pertemuan9;

import java.util.Scanner;

public class SiakadFor03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilai,tertinggi=0,terendah=100;
        int lulus =0,tidakLulus=0;
        for (int i = 1; i <= 11; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+i+": ");
            nilai=sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            } 
            if (nilai < tertinggi) {
                terendah = nilai;
            }
            if (nilai >= 58) {
                lulus++;
            } else {
                tidakLulus++;
            }
        }
        System.out.println("Nilai tertinggi : "+ tertinggi);
        System.out.println("Nilai terendah : "+terendah);
        System.out.println("Jumlah mahasiswa lulus : "+lulus);
        System.out.println("Jumlah mahasiswa tidak lulus : "+tidakLulus);
    }
}
