package complejidades;

public class ComplejidadLogaritmica {

    public ComplejidadLogaritmica() {

    }

    public int ejemplo(int[] numeros, int objetivo) {
        System.out.println("Ejemplo O(log n)");
        int inicio = 0;
        int fin = numeros.length - 1;

        while (inicio <= fin) {
            int mid = (inicio + fin) / 2;

            if (numeros[mid] == objetivo) {
                return mid;
            } else if (numeros[mid] < objetivo) {
                inicio = mid + 1;
            } else {
                fin = mid - 1;
            }
        }
        return -1;
    }

}
