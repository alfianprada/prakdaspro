package Pertemuan3;

import java.util.Scanner;

public class cicilan03 {
    public static void main(String[] args) {
        Scanner alfian = new Scanner(System.in);

        int harga,uangMuka,bulan;
        double bunga = 0.02;
        double sisaHarga,totalBunga,hargaPokok,cicilan;

        System.out.print("Masukkan Harga Laptop : ");
        harga = alfian.nextInt();
        System.out.print("Masukkan Uang Muka : ");
        uangMuka = alfian.nextInt();
        System.out.print("Dicicil Berapa Bulan : ");
        bulan = alfian.nextInt();

        sisaHarga = harga - uangMuka;
        totalBunga = bunga * sisaHarga;
        hargaPokok = sisaHarga / bulan;
        cicilan = hargaPokok + totalBunga;

        System.out.println("Jumlah Cicilan Yang Dibayar Setiap Bulan : " + cicilan);
    }
}
