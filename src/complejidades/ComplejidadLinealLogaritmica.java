package complejidades;

public class ComplejidadLinealLogaritmica {
    public ComplejidadLinealLogaritmica(){

    }

    public void ejemplo(int[] numeros){
        System.out.println("Ejemplo O(n log n):  ");
        mergeSort(numeros, 0, numeros.length);
    }

    private void mergeSort(int[] numeros, int inicio, int fin) {
        if (inicio < fin) {
            int mid = (inicio + fin) / 2;
            mergeSort(numeros, inicio, mid);
            mergeSort(numeros, mid + 1, fin);
            merge(numeros, inicio, mid, fin);
        }
    }

    private void merge(int[] numeros, int inicio, int mid, int fin) {
        int[] temp = new int[fin - inicio + 1];
        int i = inicio, j = mid + 1, k = 0;

        while (i <= mid && j <= fin) {
            if (numeros[i] < numeros[j]) {
                temp[k++] = numeros[i++];
            } else {
                temp[k++] = numeros[j++];
            }
        }

        while (i <= mid) temp[k++] = numeros[i++];
        while (j <= fin) temp[k++] = numeros[j++];

        for (int m = 0; m < temp.length; m++) {
            numeros[inicio + m] = temp[m];
        }
    }
}
