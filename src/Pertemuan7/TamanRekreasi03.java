package Pertemuan7;

import java.util.Scanner;

public class TamanRekreasi03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int biayaDasar;
        double diskon;
        double totalBayar;

        System.out.println("1.Reguler");
        System.out.println("2.Terusan");
        System.out.println("3.pelajar");
        System.out.print("Masukkan kode (1-3) : ");
        int kode =sc.nextInt();
        System.out.print("Masukkan Jumlah tiket : ");
        int jumlahTiket = sc.nextInt();
        System.out.print("Apakah Anda memiliki kartu member (true/false):");
        boolean kartu = sc.nextBoolean();

        switch (kode) {
            case 1:
                int hargaTiket=35000;
                biayaDasar =hargaTiket*jumlahTiket;
                if (jumlahTiket >=0 && jumlahTiket <=9) {
                    if (kartu == true){
                        diskon = 5;
                    } else {
                    diskon = 0;
                    }
                } else if (jumlahTiket >9 && jumlahTiket <=18){
                    if (kartu == true){
                        diskon = 0.6;
                    } else {
                    diskon = 0.1;
                    }
                } else {
                    if (kartu == true){
                        diskon = 0.7;
                    } else {
                    diskon = 0.2;
                    }
                }
                System.out.println("Layanan    : Reguler");
                System.out.println("Biaya dasar: "+biayaDasar);
                double potongan = diskon*biayaDasar;
                totalBayar = biayaDasar-potongan;
                System.out.println("Diskon  : "+ diskon +("%"));
                System.out.println("Total Bayar : "+totalBayar);
                break;
                case 2:
                hargaTiket=60000;
                biayaDasar =hargaTiket*jumlahTiket;
                if (jumlahTiket >=0 && jumlahTiket <=9) {
                    if (kartu == true){
                        diskon = 5;
                    } else {
                    diskon = 0;
                    }
                } else if (jumlahTiket >9 && jumlahTiket <=18){
                    if (kartu == true){
                        diskon = 0.6;
                    } else {
                    diskon = 0.1;
                    }
                } else {
                    if (kartu == true){
                        diskon = 0.7;
                    } else {
                    diskon = 0.2;
                    }
                }
                System.out.println("Layanan    : Terusan");
                System.out.println("Biaya dasar: "+biayaDasar);
                potongan = diskon*biayaDasar;
                totalBayar = biayaDasar-potongan;
                System.out.println("Diskon  : "+ diskon +("%"));
                System.out.println("Total Bayar :"+ totalBayar);
                    break;
                case 3:
                hargaTiket=25000;
                biayaDasar =hargaTiket*jumlahTiket;
                System.out.println("Biaya dasar: "+biayaDasar);
                if (jumlahTiket >=0 && jumlahTiket <=9) {
                    if (kartu == true){
                        diskon = 5;
                    } else {
                    diskon = 0;
                    }
                } else if (jumlahTiket >9 && jumlahTiket <=18){
                    if (kartu == true){
                        diskon = 0.6;
                    } else {
                    diskon = 0.1;
                    }
                } else {
                    if (kartu == true){
                        diskon = 0.7;
                    } else {
                    diskon = 0.2;
                    }
                }
                System.out.println("Layanan    : Pelajar");
                System.out.println("Biaya dasar: "+biayaDasar);
                potongan = diskon*biayaDasar;
                totalBayar = biayaDasar-potongan;
                System.out.println("Diskon  : "+ diskon +("%"));
                System.out.println("Total Bayar :"+ totalBayar);
                    break;
            default:
                System.out.println("kode tidak dikenal");
        }
    }
}
// 1.Reguler
// 2.Terusan
// 3.pelajar
// Masukkan kode (1-3) : 1
// Masukkan Jumlah tiket : 12
// Apakah Anda memiliki kartu member (true/false):true
// Layanan    : Reguler
// Biaya dasar: 420000
// Diskon  : 0.6%
// Total Bayar : 168000.0