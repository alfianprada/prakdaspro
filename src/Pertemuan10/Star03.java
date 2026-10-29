//Percobaan 1 (uji tambahan,langkah 10) n (uji ke-1) 3 + (3 mod 5) = 6
//Percobaan 1 (uji tambahan,langkah 10) n (uji ke-2) 9 + (3 mod 5) = 12
//Percobaan 1 (Pertanyaan 1 & 2) n 4 + (3 mod 4) = 7
//Percobaan 1 (Pertanyaan 3) n 10 + (3 mod 6) = 13

package Pertemuan10;

import java.util.Scanner;

public class Star03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i += 2) {
            System.out.print(i+" ");
        }
        System.out.println();
        sc.close();
    }
}
