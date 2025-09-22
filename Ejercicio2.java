public class Ejercicio2 {

    // Método para obtener el número mayor
    void MAXIMIZA_josue() {
        int a = 10;
        int b = 25;

        int maximo;

        if (a > b) {
            maximo = a;
        } else {
            maximo = b;
        }

        System.out.println("El número mayor es: " + maximo);
    }

    // Método para obtener el número menor
    void minimo_fernando() {
        int a = 8;
        int b = 19;

        int minimo;

        if (a < b) {
            minimo = a;
        } else {
            minimo = b;
        }

        System.out.println("El número menor es: " + minimo);
    }

    public static void main(String[] args) {
        Ejercicio2 ejercicio = new Ejercicio2();
        ejercicio.MAXIMIZA_josue();
        ejercicio.minimo_fernando(); 
    }
}

