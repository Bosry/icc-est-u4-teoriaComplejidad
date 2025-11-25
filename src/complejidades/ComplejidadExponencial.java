package complejidades;

public class ComplejidadExponencial{
    public ComplejidadExponencial(){

    }
    public void ejemplo(int n){
        System.out.println("Ejemplo O(2ⁿ): ");
        fibonacci(n);
    }

    private int fibonacci(int n){
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

}