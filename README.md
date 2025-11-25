# **INFORME DE INVESTIGACION**


![assets/image.png](assets/ups-icc.png)


### **Asignatura:** Estructura de Datos

### **Tema:** Proyecto de Complejidad y Eficiencia de Algoritmos


# Integrantes:
- Bryan Orley Santos Rocano - https://github.com/Bosry

# Objetivos:

- Analizar la teoría de la complejidad computacional y su relevancia en la resolución de problemas.

- Evaluar la eficiencia de los algoritmos mediante el estudio de su coste temporal y espacial.

- Comprender los diferentes factores que influyen en el tiempo de ejecución de un algoritmo.

- Aplicar notaciones de complejidad para describir el rendimiento de algoritmos en distintos escenarios.

- Fortalecer la capacidad de análisis teórico y experimental en el estudio de estructuras de datos y algoritmos.


# Marco Teórico: 

#### En el área de la informática y las ciencias computacionales, el análisis de algoritmos permite determinar la eficiencia con la que una computadora resuelve un problema. La teoría de la complejidad se encarga de clasificar los problemas y algoritmos según los recursos computacionales que requieren, principalmente tiempo y memoria. Estos conceptos son fundamentales para diseñar sistemas eficientes y escalables.

## **1. Teoría de la Complejidad**

### 1.1 Definición general

- La teoría de la complejidad computacional es una disciplina de la informática teórica que estudia el grado de dificultad de resolver un problema utilizando un algoritmo. Evalúa cuántos recursos—como tiempo de ejecución y memoria—se necesitan en función del tamaño de la entrada.
Su objetivo principal es clasificar los problemas según su complejidad y determinar si existen soluciones eficientes para ellos.

### 1.2 Importancia en la resolución de problemas

#### La teoría de la complejidad es esencial porque:

- Permite comparar algoritmos para un mismo problema.

- Ayuda a identificar cuándo un problema no puede resolverse de forma eficiente.

- Posibilita elegir la mejor estrategia de diseño de algoritmos.

- Orienta sobre la viabilidad de resolver problemas de gran escala.

- Evita el uso de algoritmos costosos en aplicaciones críticas.

#### En un mundo donde los datos crecen exponencialmente, comprender la complejidad es clave para crear sistemas rápidos, optimizados y escalables.

### 1.3 Eficiencia de algoritmos

#### Coste temporal

- El coste temporal mide cuántas operaciones realiza un algoritmo en función del tamaño de la entrada (denotado como n). 
##### No depende del hardware, sino de un modelo matemático que aproxima el comportamiento del algoritmo.

#### Coste espacial

El coste espacial analiza la cantidad de memoria que requiere un algoritmo. Esto incluye:

- Memoria para datos de entrada.

- Memoria para variables auxiliares.

- Estructuras temporales creadas durante la ejecución.

#### Un algoritmo eficiente debe encontrar equilibrio entre tiempo y espacio.

### 1.4 Factores de tiempo de ejecución

### - Factores propios

#### Son características internas del algoritmo, por ejemplo:

- Número de operaciones.

- Método de búsqueda o recorrido.

- Cantidad de estructuras de datos empleadas.

- Estrategia de resolución (divide y vencerás, recursividad, etc.).

### - Factores circunstanciales

#### Son factores externos, como:

- Velocidad del procesador.

- Lenguaje de programación utilizado.

- Capacidades del compilador.

- Arquitectura del hardware.

- Condiciones del sistema operativo.

#### Aunque afectan el rendimiento real, no cambian la complejidad teórica.

### - Análisis teórico

Consiste en evaluar matemáticamente el comportamiento del algoritmo sin ejecutarlo. Se estudia su complejidad en términos del tamaño de la entrada.
Es independiente del hardware, lo que lo hace general y universal.

### - Análisis experimental

Implica ejecutar el algoritmo y medir su rendimiento real usando herramientas como cronómetros, perfiles o pruebas empíricas.
Se usa para comparar algoritmos bajo condiciones específicas o confirmar el análisis teórico.

### 1.5 Notación de complejidad

### - Big O (O())

#### La notación Big O describe el límite superior del tiempo o espacio requerido por un algoritmo.

Ejemplos comunes:

- O(1): constante

- O(n): lineal

- O(n²): cuadrática

- O(log n): logarítmica

- O(2ⁿ): exponencial

#### Esta notación se usa para describir el peor comportamiento esperado.

### - Mejor caso

Describe el rendimiento cuando la entrada facilita la ejecución.
#### Ejemplo: en una búsqueda lineal, encontrar el elemento en la primera posición → O(1).

### - Peor caso

Representa el escenario más costoso, y es el más usado en el análisis formal.
#### Ejemplo: buscar un elemento que no existe en una lista → O(n).

### - Caso promedio

Evalúa el comportamiento esperado considerando todas las posibles entradas y su probabilidad.
Es útil cuando los datos reales suelen tener un patrón intermedio.

* Big O, Ω, Θ

- O(f(n)) -> Limite superior (Máximo crecimiento)
- Ω(f(n)) -> Limite inferior (Minimo crecimiento)
- Θ(f(n)) -> Crecimiento ajustado (Limite exacto si existe)

---

## **2. Ejemplos de Complejidad en Java**

En esta sección se presentan las clases creadas dentro del proyecto y el análisis correspondiente a cada una.

---

## **2.1 Complejidad O(1) – Constante**

### **Archivo:** `ComplejidadConstante.java`

### **Código del ejemplo**

```java
public void ejemplo() {
    System.out.println("Ejemplo O(1)");
    int x = 10;
    int y = 5;
    int suma = x + y;
}
```

### **Explicación resumida**

- El número de operaciones es fijo.
- No depende del tamaño de un arreglo o lista.
- Siempre ejecuta las mismas líneas.

## **2.2 Complejidad O(n) – Lineal**

### **Archivo:** `ComplejidadLineal.java`

### **Codigo del ejemplo**

```java
public class ComplejidadLineal {

    public void ejemplo(int[] arreglo) {
        System.out.println("Ejemplo O(n)");
        for (int elemento : arreglo) {
            System.out.println(elemento);
        }
    }
}
```
### **Explicación resumida**

- Cada elemento requiere una operación.
- Si hay 100 elementos → se hacen 100 operaciones.
- Si el arreglo crece, el tiempo crece igual.

## **2.3 Complejidad O(n²) – Cuadratica**

### **Archivo:** `ComplejidadCuadratica.java`

```java
public class ComplejidadCuadratica {
    public void ejemplo(int[] numeros){
        System.out.println("Ejemplo (n^2): ");
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                System.out.println(numeros[i] + ", " + numeros[j]);
            }
        }
    }

}
```
### **Explicación resumida**

- Si el arreglo tiene n elementos, el doble bucle ejecuta n × n = n² operaciones.
- El tiempo crece mucho más rápido que O(n).

## **2.4 Complejidad O(log n) – Logaritmica**

### **Archivo:** `ComplejidadLogaritmica.java`

```java
public class ComplejidadLogaritmica {
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
```
### **Explicación resumida**

- Cada iteración reduce los datos a la mitad.
- No revisa todos los elementos.
- Aumenta muy lentamente incluso si la entrada es enorme.

## **2.5 Complejidad O(n log n) – N log n**

### **Archivo:** `ComplejidadLinealLogaritmica.java`

```java
public class ComplejidadLinealLogaritmica {
    public void ejemplo(int[] numeros){
        System.out.println("Ejemplo O(n log n):  ");
        mergeSort(numeros, 0, numeros.length - 1);
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
```
### **Explicación resumida**

- El bucle externo recorre n veces.
- El interno hace log n pasos.
- Total: n × log n.

## **2.6 Complejidad O(2ⁿ) – Exponencial**


---
**PARA CADA COMPLEJIDAD, REPETIR LA ESTRUCTURA ANTERIOR**


# **Conclusiones**

- El comprender claramente el funcionamiento y el como crece el tiempo de ejecucion segun la complejidad del algoritmo ayuda mucho a resolver y elegir el tipo de complejidad a usar.
- Aclaramos que la complejidad logaritmica es la mas eficiente con arreglos grandes, y que el ir probando con codigo es la mejor manera de entender.


**POR ESTUDIANTE**: *Bryan Orley Santos Rocano*

---