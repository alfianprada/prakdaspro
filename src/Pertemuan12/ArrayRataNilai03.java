//30 + (3 mod 71) = 33

package Pertemuan12;

import java.util.Scanner;

public class ArrayRataNilai03 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int Jmassw;
      int total = 0;
      double rata2;
      String predikat;
      int jumlahlulus = 0;
      System.out.print("Masukkan Jumlah Mahasiswa : ");
      Jmassw = input.nextInt();
      int[] NilaiMhs = new int[Jmassw];
      
      for (int i = 0; i < NilaiMhs.length; i++) {
        System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+": ");
        NilaiMhs[i] = input.nextInt();
        total += NilaiMhs[i];
        if (NilaiMhs[i]>70) {
          jumlahlulus++;
        }
      }
      rata2 = (double) total / NilaiMhs.length;
      if (rata2 >= 85) {
        predikat = "SANGAT BAIK";
      } else if (rata2 >= 70) {
        predikat ="BAIK";
      } else {
        predikat = "PERLU PENDAMPINGAN";
      }
      System.out.println("Total nilai: "+ total);
      System.out.println("Rata-Rata: "+ rata2);

      int tertinggi = NilaiMhs[0];
      int terendah = NilaiMhs[0];
      for (int i = 1; i < NilaiMhs.length; i++) {
        if (NilaiMhs[i] > tertinggi) tertinggi = NilaiMhs[i];
        if (NilaiMhs[i] < terendah) terendah = NilaiMhs[i];
      }

      System.out.println("Nilai tertinggi : "+tertinggi);
      System.out.println("Nilai terendah : "+terendah);
      System.out.println("Predikat Kelas : "+predikat);
      System.out.println("Mahasiswa yang lulus : "+jumlahlulus);
    }
}
