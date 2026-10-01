package Pertemuan3;

import java.util.Scanner;

public class MenghitungLuasPersegiPanjang03 {
    public static void main(String[] args) {
        Scanner alfian = new Scanner(System.in);

        int panjang;
        int lebar;
        int luas;

        System.out.print("Masukkan Panjang : ");
        panjang = alfian.nextInt();
        System.out.print("Masukkan Lebar : ");
        lebar = alfian.nextInt();

        luas = panjang*lebar;

        System.out.println("Luas Persegi Adalah : " + luas);
    }
}
