// Tarif parkir mobil = 2500 + (3 mod 6) × 250=3250 per jam
// Tarif parkir motor = 1500 + (3 mod 6) × 250=2250 per jam

package Pertemuan9;

import java.util.Scanner;

public class ParkirKendaraan03 {
    public static void main(String[] args) {
        Scanner al = new Scanner(System.in);
        int jenis,durasi,total=0;
        do {
            System.out.print("Masukkan jenis kendaraan(1.mobil 2.motor 0.keluar): ");
            jenis=al.nextInt();
            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi: ");
                durasi=al.nextInt();
                if (jenis==1) {
                    total+=durasi*3250;
                } else {
                    total+=durasi*2250;
                }
            }
        } while (jenis != 0);
        System.out.println("Total harga parkir anda adalah Rp "+total);
    }
}
