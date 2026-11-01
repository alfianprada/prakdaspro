//n = (6 + (3 mod 5)) = 9

package Pertemuan10;

import java.util.Scanner;

public class Tugas103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();
        int total=0;

        int i = 1;
        while (i <= n) { 
            int j = 0;
            while (j < i) { 
                System.out.print(j+1+" ");
                total=total+1;
                j++;
            }
            System.out.println();
            i++;
        }
        System.out.println("Total angka tercetak: "+total);
        sc.close();
    }
}
