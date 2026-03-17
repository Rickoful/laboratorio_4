import java.util.Scanner;

public class Primo {

    // Método para verificar si un número es primo
    public static boolean esPrimo(int n) {
        if (n <= 1) {
            return false;
        }

        if (n == 2) {
            return true;
        }

        if (n % 2 == 0) {
            return false;
        }

        // Solo verificar hasta la raíz cuadrada
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int num = sc.nextInt();

        if (esPrimo(num)) {
            System.out.println(num + " es un número primo");
        } else {
            System.out.println(num + " NO es un número primo");
        }

        sc.close();
    }
}