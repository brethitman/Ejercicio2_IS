public class Suma {


    public int calcularSuma(int a, int b) {
        return a + b;
    }


    public static void main(String[] args) {
        Suma suma = new Suma();

        int numero1 = 10;
        int numero2 = 15;

        int resultado = suma.calcularSuma(numero1, numero2);

        System.out.println("Número 1: " + numero1);
        System.out.println("Número 2: " + numero2);
        System.out.println("La suma es: " + resultado);
    }
}
