

import java.util.Arrays;

public class Ordenamiento {
    private int [] array;

    public Ordenamiento() {
        array = new int[10000];
    }

    public void carga() {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10000);
        }
    }

    @Override
    public String toString() {
        return "Ordenamiento" +
                "array= " + Arrays.toString(array) ;
    }


    public void muestraArray () {
        System.out.println(Arrays.toString(array));
    }


    public void bubbleSort() {
        int num = array.length;
        for (int i = 0; i < num - 1; i++) {
            for (int j = 0; j < num - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Intercambiar datos[j] y datos[j + 1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }


    public void insertionSort() {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int tempIns = array[i];
            int j = i - 1;
            // Mover los elementos de datos[0...i-1] que son mayores que tempIns
            // una posición adelante de su posición actual
            while (j >= 0 && array[j] > tempIns) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = tempIns;
        }
    }



    // Implementación del Shell Sort
    public void shellSort() {
        int n = array.length;
        // Mover los elementos de datos[0...i-1] por intervalos
        for (int intervaloShell = n / 2; intervaloShell > 0; intervaloShell /= 2) {
            for (int i = intervaloShell; i < n; i++) {
                int temp = array[i];
                int j;
                for (j = i; j >= intervaloShell && array[j - intervaloShell] > temp; j -= intervaloShell) {
                    array[j] = array[j - intervaloShell];
                }
                array[j] = temp;
            }
        }
    }
}

