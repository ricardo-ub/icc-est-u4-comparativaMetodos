import java.util.Arrays;
import java.util.concurrent.Callable;

import controles.SortPersonaMethods;
import models.Persona;
import models.Resultado;
import utils.Benchmarking;

public class App {
    public static void main(String[] args) throws Exception {
        SortPersonaMethods sortMethods = new SortPersonaMethods();
         ejecutarEscenarioDesordenado(10000, sortMethods);
        ejecutarEscenarioCasiOrdenado(10000, sortMethods);

        System.out.println();

        ejecutarEscenarioDesordenado(50000, sortMethods);
        ejecutarEscenarioCasiOrdenado(50000, sortMethods);


        System.out.println();

        ejecutarEscenarioDesordenado(100000, sortMethods);
        ejecutarEscenarioCasiOrdenado(100000, sortMethods);
    }

    public static void ejecutarEscenarioDesordenado(int size, SortPersonaMethods sortMethods) {
        // Generar un arreglo de personas desordenado
            Persona[] base = generarPersonas(size);
            Persona[] copiaInsercion = base.clone();
            Persona[] copiaQuickSort = base.clone();
        
            Callable<Void> funcionInsercion = () -> {
                sortMethods.insertSort(copiaInsercion);
                return null;
            };

            Callable<Void> funcionQuickSort = () -> {
                sortMethods.quickSort(copiaQuickSort, 0, copiaQuickSort.length - 1);
                return null;
            };

            Resultado r1 = Benchmarking.medirTiempo(funcionInsercion, "Insertion Sort", "Desordenado", size);
            Resultado r2 = Benchmarking.medirTiempo(funcionQuickSort, "Quick Sort", "Desordenado", size);

            System.out.println("Desordenado | " + r1.getAlgoritmo() + " | "+ r1.getSample() + " | " + r1.getTiempoMilis() + " ms");
            System.out.println("Desordenado | " + r2.getAlgoritmo() + " | "+ r2.getSample() + " | " + r2.getTiempoMilis() + " ms");
    }

    public static void ejecutarEscenarioCasiOrdenado(int size, SortPersonaMethods sortMethods) {
        // Generar un arreglo de personas ordenado\
            Persona[] base = generarPersonas(size);
            
            sortMethods.quickSort(base, 0, base.length - 1); // Ordenar el arreglo base

            Persona[] baseMasUno = Arrays.copyOf(base, base.length + 1);
            baseMasUno[baseMasUno.length-1] = new Persona("Persona Nueva", (int) (Math.random() * 101)); //
        
            Persona[] copiaInsercion = baseMasUno.clone();
            Persona[] copiaQuickSort = baseMasUno.clone();

            Callable<Void> funcionInsercion = () -> {
                sortMethods.insertSort(copiaInsercion);
                return null;
            };

            Callable<Void> funcionQuickSort = () -> {
                sortMethods.quickSort(copiaQuickSort, 0, copiaQuickSort.length - 1);
                return null;
            };

            Resultado r1 = Benchmarking.medirTiempo(funcionInsercion, "Insertion Sort", "Casi Ordenado + 1 persona", size+1);
            Resultado r2 = Benchmarking.medirTiempo(funcionQuickSort, "Quick Sort", "Casi Ordenado + 1 persona", size+1);

            System.out.println("Casi ordenado + 1 persona | " + r1.getAlgoritmo() + " | "+ r1.getSample() + " | " + r1.getTiempoMilis() + " ms");
            System.out.println("Casi ordenado + 1 persona | " + r2.getAlgoritmo() + " | "+ r2.getSample() + " | " + r2.getTiempoMilis() + " ms");
    }
    
    public static Persona[] generarPersonas(int cantidad) {
        Persona[] personas = new Persona[cantidad];

        for (int i = 0; i < cantidad; i++) {
            String nombre = "Persona " + (i + 1);
            int edad = (int) (Math.random() * 101);
            personas[i] = new Persona(nombre, edad);
        }

        return personas;
    }
}
