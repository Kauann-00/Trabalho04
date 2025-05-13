// Estrutura de repetição

package com.mycompany.potenciamanual;

import java.util.Scanner;

public class PotenciaManual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a base: ");
        double base = scanner.nextDouble();
        
        System.out.print("Digite o expoente (inteiro): ");
        int expoente = scanner.nextInt();
        
        double resultado = 1.0;
        int expoenteAbsoluto = Math.abs(expoente);
        
        // Calcula a potência com um loop
        for (int i = 0; i < expoenteAbsoluto; i++) {
            resultado *= base;
        }
        
        // Se o expoente for negativo, calcula o inverso
        if (expoente < 0) {
            resultado = 1.0 / resultado;
        }
        
        System.out.printf("%s elevado a %d = %.2f%n", 
            base % 1 == 0 ? String.format("%.0f", base) : String.valueOf(base), 
            expoente, resultado);
        
        scanner.close();
    }
}