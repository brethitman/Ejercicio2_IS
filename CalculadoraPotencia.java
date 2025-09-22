import java.util.Scanner;

/**
 * @author Andrea 
 */
public class CalculadoraPotencia {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Calculadora de Potencia ---");

        System.out.print("Introduce la base (un número): ");
        double base = scanner.nextDouble();

        System.out.print("Introduce el exponente (un número entero): ");
        int exponente = scanner.nextInt();

        scanner.close();

        double resultado = Math.pow(base, exponente);

        System.out.println("\nEl resultado de " + base + " elevado a la potencia de " + exponente + " es: " + resultado);
    }
}