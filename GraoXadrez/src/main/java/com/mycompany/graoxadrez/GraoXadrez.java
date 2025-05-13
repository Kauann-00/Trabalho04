// 

package com.mycompany.graoxadrez;

import java.math.BigInteger;

public class GraoXadrez {
    public static void main(String[] args) {
        // Total de casas no tabuleiro
        int casas = 64;
        
        // Calcula 2^64 - 1 usando BigInteger
        BigInteger totalGraos = BigInteger.ZERO;
        for (int i = 0; i < casas; i++) {
            totalGraos = totalGraos.add(BigInteger.TWO.pow(i));
        }
        
        // Exibe o resultado
        System.out.println("O total de grãos que o monge recebeu é: " + totalGraos);
    }
}