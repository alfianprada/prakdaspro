package Pertemuan3;

import java.util.Scanner;

public class GajiKaryawan03 {
    public static void main(String[] args) {
        Scanner alfian = new Scanner(System.in);

        int gajiPokok, totGaji;
        double bonus;
        double tunjTransp =600000;
        double tunjMkn =400000;

        System.out.print("Masukkan gaji pokok : ");
        gajiPokok = alfian.nextInt();

        bonus = 0.05 * gajiPokok;

        totGaji = (int) (gajiPokok + tunjTransp + tunjMkn + bonus - (0.1 * gajiPokok));

        System.out.println("Bonus Bulanan Anda Adalah Rp. " + bonus);
        System.out.println("Gaji Yang Diterima Adalah Rp. " + totGaji);
    }
}
