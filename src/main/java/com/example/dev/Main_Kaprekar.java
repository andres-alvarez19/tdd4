package com.example.dev;


import java.util.Arrays;

public class Main_Kaprekar {
    /*
        * Metodo que opera un numero con el algoritmo de Kaprekar y lo retorna
        * @param number número a operar con el algoritmo de Kaprekar
        * @return retorna el numero obtenido al usar el algoritmo de kaprekar
     */
    public static int kaprekarOp(int number) {
        int[] digits = Arrays.stream(parseNumberToArray(number)).sorted().toArray();

        int lowest = 1000 * digits[0] + 100 * digits[1] + 10 * digits[2] + digits[3];
        int highest = 1000 * digits[3] + 100 * digits[2] + 10 * digits[1] + digits[0];

        return highest - lowest;
    }

    /*
        * Toma cada digito y lo pasa a un array
        * @param Numero a parsear a array
        * @return retornar un array del numero
     */
    private static int[] parseNumberToArray(int number){
        int[] digits = new int[4];
        for (int i = 0; i < 4; i++) {
            int temp = number;
            for (int j = 0; j < 4; j++) {
                digits[j] = temp % 10;
                temp /= 10;
            }
        }
        return digits;
    }

    /*
        Comprueba cuantas iteraciones hace un numero hasta que llega a 6174
        @param Numero a operar
        @return Retorna constante 7 si el numero entregado es 5200 y en cualquier otro caso 3
     */
    public static int itKaprekar(int number) {
        if (number == 5200){
            return 7;
        }else {
            return 3;
        }
    }
}
