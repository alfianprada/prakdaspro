package Pertemuan2;

import java.util.Scanner;

public class Bank03copy {
    public static void main(String[] args) {
        Scanner alfian = new Scanner(System.in);

        int lebarTanah, panjangTanah, diameterKolam, sisi, luasPersegi;
        double luasTanah, phi = 3.14,jarijari, luasLingkaran, tanahYangTidakDigunakan, luasYangDigunakan;

        System.out.print("masukkan lebar tanah : ");
        lebarTanah = alfian.nextInt();
        System.out.print("masukkan panjang tanah : ");
        panjangTanah = alfian.nextInt();
        System.out.print("masukkan diameter kolam : ");
        diameterKolam = alfian.nextInt();
        System.out.print("masukkan sisi taman bunga : ");
        sisi = alfian.nextInt();

        luasTanah = panjangTanah*lebarTanah;
        jarijari = diameterKolam / 2;
        luasLingkaran = phi*jarijari*jarijari;
        luasPersegi = sisi*sisi;
        luasYangDigunakan = luasLingkaran+luasPersegi;
        tanahYangTidakDigunakan = luasTanah-luasYangDigunakan;

        System.out.print("Jumlah luas tanah yang tidak digunakan : " + tanahYangTidakDigunakan);
    }
}
