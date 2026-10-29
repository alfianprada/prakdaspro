//Percobaan 2 (uji tambahan,langkah 9) (baris, kolom) uji ke-1 (2 + (3 mod 3) = 2, 4 + (3 mod 3)) = 4
//Percobaan 2 (uji tambahan,langkah 9) (baris, kolom) uji ke-2 (5 + (3 mod 3) = 5, 2 + (3 mod 3)) = 2
//Percobaan 2 (Pertanyaan 2) baris, kolom 4 + (3 mod 4) = 7, 6 + (3 mod 4) = 9

package Pertemuan10;

import java.util.Scanner;

public class Rectangle03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris: ");
        int baris = sc.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        int kolom = sc.nextInt();
        for (int i = 1; i <= baris; i++) {
            for (int j = 1; j <= kolom; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
        sc.close();
    }
}
