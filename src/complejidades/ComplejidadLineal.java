package complejidades;

public class ComplejidadLineal {
    public ComplejidadLineal(){

    }

    public void ejemplo(int [] numeros){
        System.out.println("Ejemplo O(n): ");
        System.out.print("[");
        for (int i = 0; i < numeros.length; i++) {
            if (i < numeros.length - 1) {
                System.out.print(numeros[i] + ", ");
            } else{
                System.out.print(numeros[i]);
            }
        }
        System.out.println("]");
    }
}
