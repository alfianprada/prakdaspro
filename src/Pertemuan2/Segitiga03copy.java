package Pertemuan2;

import java.util.Scanner;


public class Segitiga03copy {
    public static void main(String[] args) {
        Scanner alfian = new Scanner(System.in);

        int gajiPokok, tunjanganAnak, jumlahAnak;
        double totalTunjangan;
        double potonganPensiun = 0.1;
        double totalAkhirGaji;
        double totalDanaPensiun;

        System.out.print("Masukkan Gaji Pokok: ");
        gajiPokok = alfian.nextInt();
        System.out.print("Masukkan besaran tunjangan anak: ");
        tunjanganAnak = alfian.nextInt();
        System.out.print("Masukkan jumlah anak: ");
        jumlahAnak = alfian.nextInt();

        totalTunjangan = tunjanganAnak*jumlahAnak;
        totalDanaPensiun = gajiPokok*potonganPensiun;
        totalAkhirGaji = totalTunjangan+gajiPokok-totalDanaPensiun;

        System.out.println("Total gaji bersih: " + totalAkhirGaji);
    }
}
