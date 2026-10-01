package Pertemuan3;

import java.util.Scanner;

public class PeternakanTelur03 {
    public static void main(String[] args) {
        Scanner alfian = new Scanner(System.in);

        int telurBulan = 25;
        int tray = 30;
        int ayam,bulan,jumlahTelurPerbulan,telurKemas,sisaTelur;
        double berat = 62,beratTotal;

        System.out.print("masukkan jumlah ayam :");
        ayam=alfian.nextInt();
        System.out.print("Masukkan bulan :");
        bulan = alfian.nextInt();

        jumlahTelurPerbulan = ayam * telurBulan *bulan;
        sisaTelur = jumlahTelurPerbulan % tray;
        telurKemas = jumlahTelurPerbulan / tray;
        beratTotal = jumlahTelurPerbulan*berat/1000;

        System.out.println("Total telur     : "+jumlahTelurPerbulan);
        System.out.println("Jumlah tray     : " + telurKemas);
        System.out.println("Telur Eceran    : "+sisaTelur);
        System.out.println("Berat total (kg): " +beratTotal);
    }
}

// masukkan jumlah ayam :5
// Masukkan bulan :2
// Total telur     : 250
// Jumlah tray     : 8
// Telur Eceran    : 10
// Berat total (kg): 15.5