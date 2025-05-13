//Estrutura de repetição

package com.mycompany.graoxadrez;

import java.math.BigInteger;

public class GraoXadrez {
    public static void main(String[] args) {
        int casas = 64;
        
        BigInteger totalGraos = BigInteger.ZERO;
        for (int i = 0; i < casas; i++) {
            totalGraos = totalGraos.add(BigInteger.TWO.pow(i));
        }
        
        System.out.println("O total de grãos que o monge recebeu é: " + totalGraos);
    }
}
