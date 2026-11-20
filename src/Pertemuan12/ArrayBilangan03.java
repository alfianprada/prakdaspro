//3 ; 3+8=11 ; −(1+(3 mod 7))=-2 ; 20+(3 mod 15)=20

package Pertemuan12;

import java.util.Arrays;

public class ArrayBilangan03 {
    public static void main(String[] args) {

        int[] bil = {3,11,-2,20};

        for (int i = 0; i < bil.length; i++) {
        System.out.println("bil[" + i + "] = " + bil[i] + ", double = " + (bil[i] * 2));
        }

        for (int nilai : bil) {
        System.out.println(nilai);
        }

        System.out.println(Arrays.toString(bil));
    }
}
