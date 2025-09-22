public class Ejercicio2 {
   
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

    //siguiente metodo aqui csmd


    public static void main(String[] args) {
        Ejercicio2 ejercicio = new Ejercicio2();
        ejercicio.MAXIMIZA_josue(); 

        //aqui llame a su metodo csmd    
        }
}
