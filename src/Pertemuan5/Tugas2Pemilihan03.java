package Pertemuan5;

import java.util.Scanner;

public class Tugas2Pemilihan03 {
    public static void main(String[] args) {
        Scanner alfian = new Scanner(System.in);

        System.out.print("Masukkan Jumlah SKS : ");
        int jumlahSks = alfian.nextInt();

        if (jumlahSks > 24) {
            System.out.println("Melebihi batas");
        } else {
            System.out.println("KRS valid");
        }
    }
}
