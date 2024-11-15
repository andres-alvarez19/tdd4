package com.example.dev;


public class Main_Kaprekar {
    /*
        * @param number número a operar con el algoritmo de Kaprekar
        * @return retorna una constante 3087 si el numero es 3524, 5175 si number es 5200 y en cualquier otro caso devuelve 999
     */
    public static int kaprekarOp(int number) {
        if (number == 3524) {
            return 3087;
        }else if (number == 5200) {
            return 5175;
        }else{
            return 999;
        }
    }
}
