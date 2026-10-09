package Pertemuan7;

import java.util.Scanner;

public class StudiKasus103 {
    public static void main(String[] args) {
    
    Scanner al = new Scanner(System.in);

    int hargaPerCup = 18000;
    int jumlahCup, uangBayar;
    int totalHarga, diskon, totalBayar;
    int kembalian, kurang;

    System.out.print("Masukkan Jumlah Cup : ");
    jumlahCup = al.nextInt();
    System.out.print("Masukkan uang bayar : ");
    uangBayar = al.nextInt();

    totalHarga = jumlahCup * hargaPerCup;
    diskon = 0;

    if (totalHarga >= 110000 ) {
        diskon = totalHarga * 8 / 100;
    } else {
        diskon =0;
    }

    totalBayar = totalHarga - diskon;

    System.out.println("Total harga         : "+totalHarga);
    System.out.println("diskon              : "+diskon);
    System.out.println("Total bayar         : "+totalBayar);

    if (uangBayar >= totalBayar) {
        kembalian = uangBayar - totalBayar;
        System.out.println(kembalian);
    } else {
        kurang = totalBayar- uangBayar;
        System.out.println("Uang tidak cukup, kurang Rp "+kurang);
    }
    }
}
