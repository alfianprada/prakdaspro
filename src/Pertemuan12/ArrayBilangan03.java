//3 ; 3+8=11 ; −(1+(3 mod 7))=-2 ; 20+(3 mod 15)=20

package Pertemuan12;

import java.util.Arrays;

public class ArrayBilangan03 {
    public static void main(String[] args) {

        int[] bil = new int[4];
        bil[0] = 3;
        bil[1] = 11;
        bil[2] = -2;
        bil[3] = 20;

        for (int i = 0; i < bil.length; i++) {
        System.out.println("bil[" + i + "] = " + bil[i]);
        }

        for (int nilai : bil) {
        System.out.println(nilai);
        }

        System.out.println(Arrays.toString(bil));
            }
}
