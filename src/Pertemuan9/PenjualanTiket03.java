// Harga tiket = 40000 + (3 mod 6) × 2000 = 46000
// Syarat diskon pertama = lebih dari (3 + (3 mod 3))=3 tiket, dengan diskon (8 + (3 mod 5))=11%
// Syarat diskon kedua = lebih dari (8 + (3 mod 4))=11 tiket, dengan diskon (15 + (3 mod 4))=18%

package Pertemuan9;

import java.util.Scanner;

public class PenjualanTiket03 {
    public static void main(String[] args) {
        Scanner al = new Scanner(System.in);
        int tiket,totaltiket=0,i=1;
        int hargaTiket=46000;
        double diskon=0,totalHarga;
        String diskonp="";
        do {
            System.out.print("Masukkan jumlah tiket ke-"+i+"(masukkan 0 untuk keluar): ");
            tiket=al.nextInt();
            if (tiket==0) {
                System.out.println("transaksi selesai");
                break;
            }
            if (tiket < 0) {
                System.out.println("Tiket tidak valid");
                continue;
            }
            totaltiket=totaltiket+tiket;
            if (totaltiket > 0 && totaltiket <= 3) {
                diskon=0;
                diskonp="diskon 0%";
            } else  if (totaltiket > 3 && totaltiket <= 11){
                diskon=0.11;
                diskonp="diskon 11%";
            } else {
                diskon=0.18;
                diskonp="18%";
            }
            i++;
            System.out.println("Jumlah tiket anda saat ini adalah: "+totaltiket);
        } while (true);
        totalHarga=totaltiket*hargaTiket-diskon;
        System.out.println("Total tiket anda adalah: "+totaltiket);
        System.out.println("diskon anda adalah: "+diskonp);
        System.out.println("Total harga tiket adalah Rp "+totalHarga);
    }
}
