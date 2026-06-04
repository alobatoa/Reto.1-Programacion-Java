
package Reto1;
public class Principal {
    
// HEXADECIMAL=Sistema de numeracion en base 16//
    // Base= Representacion de numeros con simbolos"
    
    public static void main(String[] args) {
        char[] hex = {'F', '1', '2', 'A', '4'}; // Número hexadecimal de 4 dígitos
        int[] valores = new int[5];       // Equivalente decimal de cada dígito
        int[] potencias = new int[5];     // Potencias de 16 correspondientes

        // Llenamos el array de potencias: 16³, 16², 16¹, 16?
        for (int i = 0; i < potencias.length; i++) {
            potencias[i] = (int) Math.pow(16, potencias.length -1-i);
        }

        // Convertimos cada carácter hexadecimal a su valor decimal
        for (int i = 0; i < hex.length; i++) {
            valores[i] = convertirHexADecimal(hex[i]);
        }

        // Calculamos el resultado final
        int resultado = 0;
        for (int i = 0; i < hex.length; i++) {
            resultado += valores[i] * potencias[i];
        }

        // Mostramos el proceso
        System.out.println("Hexadecimal: " + String.valueOf(hex));
        System.out.print("Valores decimales: ");
        for (int val : valores) System.out.print(val + " ");
        System.out.print("\nPotencias: ");
        for (int pot : potencias) System.out.print(pot + " ");
        System.out.println("\nResultado decimal: " + resultado);
        
        
        
       
    }

// Método para convertir un carácter hexadecimal a decimal
    public static int convertirHexADecimal(char ch) {
        if (ch >= '0' && ch <= '9') return ch - '0';
        else if (ch >= 'A' && ch <= 'F') return 10 + (ch - 'A');
        else throw new IllegalArgumentException("Carácter inválido: " + ch);
        

    }
}
