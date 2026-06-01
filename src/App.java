import java.util.concurrent.Callable;

import controles.SortPersonaMethods;
import models.Persona;
import models.Resultado;
import utils.Benchmarking;

public class App {
    public static void main(String[] args) throws Exception {
        ejecutarEscenarioDesordenado(0, null);
    }

    public static void ejecutarEscenarioDesordenado(int size, SortPersonaMethods sortMethods) {
        // Generar un arreglo de personas desordenado
            Persona[] base = generarPersonas(size);
            Persona[] copiaInsercion = base.clone();
        
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
            System.out.println(r1);
            System.out.println(r2);
    }
    
    public static Persona[] generarPersonas(int cantidad) {
        Persona[] personas = new Persona[cantidad];
        for (int i = 0; i < cantidad; i++) {
            String nombre = "Persona" + (i + 1);
            int edad = (int) (Math.random() * 101);
            personas[i] = new Persona(nombre, edad);
        }
        return personas;
    }
}
