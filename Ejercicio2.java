public class Ejercicio2 {

    // Método para obtener el número mayor
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
        //metodo factorial rodrigo
        void mostrarFactorial(int n){
            System.out.println((n>=0)? "El factorial es: "+factorial(n):"Sintax error");
        }

        private long factorial (int n){
        long resultado = 1;
        for(int i = 2; i<= n ; i++){
            resultado *= i;
        }
        return resultado;
    }

    
    public static void main(String[] args) {
        Ejercicio2 ejercicio = new Ejercicio2();
        ejercicio.MAXIMIZA_josue();
        ejercicio.minimo_fernando(); 
        ejercicio.MAXIMIZA_josue();
        ejercicio.mostrarFactorial(9) ;
    }
}

