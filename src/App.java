import complejidades.ComplejidadConstante;
import complejidades.ComplejidadCuadratica;
import complejidades.ComplejidadLineal;
import complejidades.ComplejidadLogaritmica;

public class App {
    public static void main(String[] args) throws Exception {
        int[] numeros = {3, 6, 19, 23, 1, 0, 12, 5};
        ComplejidadConstante complejidadCon = new ComplejidadConstante();
        ComplejidadLineal complejidadLin = new ComplejidadLineal();
        ComplejidadCuadratica complejidadCua = new ComplejidadCuadratica();
        ComplejidadLogaritmica complejidadLog = new ComplejidadLogaritmica();

        int objetivo = 12;

        complejidadCon.ejemplo();
        complejidadLin.ejemplo(numeros);
        complejidadCua.ejemplo(numeros);
        complejidadLog.ejemplo(numeros, objetivo);
    }
}
