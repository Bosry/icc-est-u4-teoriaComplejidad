package complejidades;

public class ComplejidadCuadratica {
    public ComplejidadCuadratica(){

    }

    public void ejemplo(int[] numeros){
        System.out.println("Ejemplo (n^2): ");
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                System.out.println(numeros[i] + ", " + numeros[j]);
            }
        }
    }

}
