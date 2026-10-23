//harga kopi=10000+(3 mod 5)x 1000=13000
//hargaTeh=5000+(3 mod 4)x1000=8000
//hargaRoti=15000+(3 mod 6)x1000=18000

package Pertemuan9;

import java.util.Scanner;

public class KafeDoWhile03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kopi,teh,roti,totalHarga;
        int hargaKopi=13000,hargaTeh=8000,hargaRoti=18000;
        String namaPelanggan;
        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan=sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("transaksi dibatalkan");
                break;
            }
            System.out.print("Jumlah kopi: ");
            kopi=sc.nextInt();
            System.out.print("Jumlah teh: ");
            teh=sc.nextInt();
            System.out.print("Jumlah roti: ");
            roti=sc.nextInt();
            totalHarga=(kopi*hargaKopi)+(teh*hargaTeh)+(roti*hargaRoti);
            System.out.println("Total yang harus dibayar: Rp "+totalHarga);
            sc.nextLine();
        } while (true);

        System.out.println("semua transaksi selesai.");
    }
}
