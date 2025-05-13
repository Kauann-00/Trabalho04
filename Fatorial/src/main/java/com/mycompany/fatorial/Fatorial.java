//Estrutura de repetição

package com.mycompany.fatorial;

import java.math.BigInteger;
import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro não-negativo: ");
        
        try {
            int numero = scanner.nextInt();
            
            if (numero < 0) {
                System.out.println("Erro: O fatorial não é definido para números negativos.");
                scanner.close();
                return;
            }
            
            BigInteger fatorial = BigInteger.ONE;
            for (int i = 1; i <= numero; i++) {
                fatorial = fatorial.multiply(BigInteger.valueOf(i));
            }
            
            System.out.printf("O fatorial de %d é: %s%n", numero, fatorial);
            
        } catch (Exception e) {
            System.out.println("Erro: Digite um número inteiro válido.");
        }
        
        scanner.close();
    }
}
