/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.util.Scanner;

/**
 *
 * @author anfev
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite Tamaño de la Serie: ");
        long num_Tecl = teclado.nextInt();
        for (int i = 0; i < num_Tecl; i++) {
            if (Primo(Fib(i))) {
                System.out.println(Fib(i) + "ES PRIMO");
            } else {
                System.out.println(Fib(i) + "");
            }
        }
    }

    public static long Fib(long numTecl) {
        if (numTecl > 1) {
            return Fib(numTecl - 1) + Fib(numTecl - 2);
        } else if (numTecl == 1) {
            return 1;
        } else if (numTecl == 0) {
            return 0;
        } else {
            System.out.println("");
            return -1;
        }
    }

    public static boolean Primo(long NumeroPrimo) {
        boolean Primo = false;
        int Divisibles = 0;
        for (int i = 1; i <= NumeroPrimo; i++) {
            if (NumeroPrimo % i == 0) {
                Divisibles++;
            }
        }
        if (Divisibles == 2) {
            Primo = true;
        }
        return Primo;

    }

}
