public class Ejercicio2 {
   
    void MAXIMIZA_josue() {
        int a = 30;
        int b = 25;

        int maximo;

        if (a > b) {
            maximo = a;
        } else {
            maximo = b;
        }

        System.out.println("El número mayor es: " + maximo);
    }

     int calcularSuma(int a, int b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        Ejercicio2 ejercicio = new Ejercicio2();
        ejercicio.MAXIMIZA_josue(); 

         // método de suma
        int numero1 = 10;
        int numero2 = 15;
        int resultado = ejercicio.calcularSuma(numero1, numero2);

        System.out.println("Número 1: " + numero1);
        System.out.println("Número 2: " + numero2);
        System.out.println("La suma es: " + resultado);

    }
}
