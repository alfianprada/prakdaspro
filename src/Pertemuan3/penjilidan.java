package Pertemuan3;

import java.util.Scanner;

public class penjilidan {
    public static void main(String[] args) {
        Scanner alfian = new Scanner(System.in);

        int lembar;
        int biayaC = 500,biayaJ = 5000,totalBiaya;

        System.out.print("Mau Mencetak Berapa Lembar Dokumen? : ");
        lembar = alfian.nextInt();

        totalBiaya = (lembar * biayaC) + biayaJ;

        System.out.println("Total Biaya Yang Harus Dibayarkan : " + totalBiaya);
    }
}
