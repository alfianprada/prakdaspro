package Pertemuan2;

import java.util.Scanner;


public class Segitiga03 {
    public static void main(String[] args) {
        Scanner alfian = new Scanner(System.in);

        int alas, tinggi;
        float luas;

        System.out.print("Masukkan alas: ");
        alas = alfian.nextInt();
        System.out.print("Masukkan tinggi: ");
        tinggi = alfian.nextInt();

        luas = alas * tinggi / 2;

        System.out.println("Luas segitiga: " + luas);
    }
}
