package Pertemuan1;

import java.util.Scanner;

public class penghitungmodulo {
    public static void main(String[] args) {
        Scanner al = new Scanner(System.in);
        int angkapertama,angkaKedua;
        int hasil;

        System.out.print("Angka 1: ");
        angkapertama = al.nextInt();
        System.out.print("Angka 2: ");
        angkaKedua = al.nextInt();

        hasil = angkapertama % angkaKedua;

        System.out.println(hasil);
    }
}
