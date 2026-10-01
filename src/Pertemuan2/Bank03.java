package Pertemuan2;

import java.util.Scanner;

public class Bank03 {
    public static void main(String[] args) {
        Scanner alfian = new Scanner(System.in);

        int jml_tabungan_awal, lama_menabung;
        double prosentase_bunga =0.02, bunga, jml_tabungan_akhir;

        System.out.print("masukkan jumlah tabungan awal anda :");
        jml_tabungan_awal = alfian.nextInt();
        System.out.print("masukkan lama menabung anda :");
        lama_menabung = alfian.nextInt();

        bunga = lama_menabung*prosentase_bunga*jml_tabungan_awal;
        jml_tabungan_akhir = bunga+jml_tabungan_awal;

        System.out.println("Bunga adalah : " + bunga);
        System.out.println("Jumlah tabungan akhir anda adalah : " + jml_tabungan_akhir);
    }
}
