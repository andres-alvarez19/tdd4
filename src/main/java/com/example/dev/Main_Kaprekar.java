package com.example.dev;


import java.util.Arrays;

public class Main_Kaprekar {
    /*
        * Metodo que opera un numero con el algoritmo de Kaprekar y lo retorna
        * @param number número a operar con el algoritmo de Kaprekar
        * @return retorna el numero obtenido al usar el algoritmo de kaprekar
     */
    public static int kaprekarOp(int number) {
        int lowest = 0;
        int highest = 0;

        for (int i = 0; i < 4; i++) {
            int[] digits = new int[4];
            int temp = number;
            for (int j = 0; j < 4; j++) {
                digits[j] = temp % 10;
                temp /= 10;
            }
            Arrays.sort(digits);
            lowest = 1000 * digits[0] + 100 * digits[1] + 10 * digits[2] + digits[3];
            highest = 1000 * digits[3] + 100 * digits[2] + 10 * digits[1] + digits[0];
        }

        return highest - lowest;
    }

}
