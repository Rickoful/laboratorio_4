import java.util.Scanner;

public class Primo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduce un numero: ");
        int numero = teclado.nextInt();
        
        int divisores = 0;

        // Contamos cuantos divisores tiene el numero
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                divisores++; // Si el resto es 0, encontramos un divisor
            }
        }

        // Un numero es primo si SOLO tiene 2 divisores (el 1 y al mismo)
        if (divisores == 2) {
            System.out.println(numero + " es primo.");
        } else {
            System.out.println(numero + " no es primo.");
        }
        
        teclado.close();
    }
}
