package Pertemuan2;

public class ContohVariabel03 {
    public static void main(String[] args) {    
        String salahSatuHobySayaAdalah = "Memancing";
        boolean Pandai = true;
        char jenisKelamin ='L';
        byte umurSayaSekarang = 19;
        double ipk = 3.24, tinggiBadan = 1.78;
        System.out.println(salahSatuHobySayaAdalah);
        System.out.println("Apakah saya pandai ? : " + Pandai);
        System.out.println("Jenis kelamin: " + jenisKelamin);
        System.out.println("Umurku saat ini: " + umurSayaSekarang);
        System.out.println(String.format("Saya beripk %s, denga tinggi badan %s",ipk, tinggiBadan));
    }
}
