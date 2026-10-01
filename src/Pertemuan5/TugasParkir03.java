package Pertemuan5;

import java.util.Scanner;

public class TugasParkir03 {
    public static void main(String[] args) {
        Scanner alfian = new Scanner(System.in);
        int tarif;

        System.out.print("Masukkan Lama Parkir: ");
        int lamaParkir = alfian.nextInt();

        if (lamaParkir < 2) {
            tarif = 2000;
        } else {
            tarif = 2000 +(lamaParkir-2)*1000;
        }

        System.out.println(tarif);
    }
}
