//Definir una clase ordenamiento que contenga el atributo datos (un array de
//enteros) en el cual se agregarán los métodos:
//Carga(): que llena el arreglo con 10000 números aleatorios.
//Muestra()
//bubbleSort()
//insertionSort()
//shellSort()
//El método main() de la clase principal, tiene que crear un objeto de la clase
//ordenamiento e invocar a los métodos y mostrar el arreglo antes y después de
//ordenar.


public class Main {
    public static void main(String[] args) {

        Ordenamiento ord = new Ordenamiento();

        ord.carga();
        System.out.println("--- array antes de ordenar:--");
        ord.muestraArray();


        System.out.println("---bubbleSort----");
        ord.bubbleSort();
        ord.muestraArray();

        ord.carga(); //IMPORTANTE DESORDENAR EL ARRAY QUE SE ORDENO EN EL BUBBLEsort
        ord.insertionSort();
        System.out.println("---insertion sort----");
        ord.muestraArray();

        ord.carga();
        ord.shellSort();
        System.out.println("---  shell sort ----");
        ord.muestraArray();




    }
    }
