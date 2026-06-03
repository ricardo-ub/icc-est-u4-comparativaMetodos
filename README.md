# Universidad Politecnica Salesiana

## Proyecto: Comparativa de métodos
## Estudiante: Ricardo Uzhca

## Practica 4.1: Comparativa de metodos
### Fecha: 2026-06-01
### Descripción

Se implementaron y compararon dos algoritmos de ordenamiento, 
Insertion Sort y Quick Sort mediante pruebas de rendimiento en dos escenarios diferentes:

Un arreglo completamente desordenado y un arreglo previamente ordenado 
al que se añadió una nueva persona. Para cada escenario se utilizaron 
tamaños de muestra de 10.000, 50.000 y 100.000 elementos, registrando el 
tiempo de ejecución de cada algoritmo en milisegundos para posteriormente 
analizar su comportamiento y eficiencia.

## RESULTADOS OBTENIDOS:
### 10000
Desordenado | Insertion Sort | 10000 | 629.8524 ms
Desordenado | Quick Sort | 10000 | 10.4219 ms

Casi ordenado + 1 persona | Insertion Sort | 10001 | 1.4312 ms
Casi ordenado + 1 persona | Quick Sort | 10001 | 5.7065 ms
### 50000
Desordenado | Insertion Sort | 50000 | 26394.6471 ms
Desordenado | Quick Sort | 50000 | 54.7621 ms

Casi ordenado + 1 persona | Insertion Sort | 50001 | 6.8121 ms
Casi ordenado + 1 persona | Quick Sort | 50001 | 46.7377 ms
### 100000
Desordenado | Insertion Sort | 100000 | 140113.6589 ms
Desordenado | Quick Sort | 100000 | 176.9689 ms

Casi ordenado + 1 persona | Insertion Sort | 100001 | 9.2151 ms
Casi ordenado + 1 persona | Quick Sort | 100001 | 148.6194 ms


### Tabla 1. Escenario 1: arreglo completamente desordenado
Tamaño de muestra | Tiempo Insercion | Tiempo QuickSort | Algoritmo más rápido | Observación

    10000         | 629.8524 ms      | 10.4219 ms       | Quick Sort           | Quick Sort notablemente más rápido que Insertion

    50000         | 26394.6471 ms    | 54.7621 ms       | Quick Sort           | Aumento la diferencia de rendimienot al incrementar el tamaño de datos

    100000        | 140113.6589 ms   | 176.9689 ms      | Quick Sort           | Insertion mostro tiempos muy elevados y Quick mantuvo su eficiencia


### Tabla 2. Escenario 2: arreglo ordenado más una nueva persona
Tamaño de muestra | Tiempo Insercion | Tiempo QuickSort | Algoritmo más rápido | Observación

    10001         | 1.4312 ms        | 5.7065 ms        | Insertion Sort       | Quick Sort notablemente más rápido que Insertion

    50001         | 6.8121 ms        | 46.7377 ms       | Insertion Sort       | Aumento la diferencia de rendimienot al incrementar el tamaño de datos

    100001        | 9.2151 ms        | 148.6194 ms      | Insertion Sort       | Insertion mostro tiempos muy elevados y Quick mantuvo su eficiencia


## Analisis requerido

¿Que algoritmo fue mas rapido en el escenario desordenado?
En el escenario desordenado Quick Sort fue el algoritmo mas rapido que los tiempos obtenidos por Insertion.


¿Que algoritmo fue mas rapido en el escenario casi ordenado?
En el escenario casi ordenado Insertion Sort fue el más rapido como ya estaba ordenado y solo se agregaba una mas se necesitó pocos cambios para el ordenamiento

¿El crecimiento del tamaño de muestra afectó por iugal a los dos algoritmos?
No porque al aumentar el tamaño de la muestra, Insertion se volvio mas lento en el escenario desordenado pero en cambio Quick Sort aumentó el tiempo de ejecución pero algo menor

¿Por que Insercion puede mejorar cuando el arreglo ya esta casi ordenado?
Porque ya algunos elementos estan en su posicion y asi el algoritmo realiza pocas comparaciones o movimientos para terminar de ordenar el arreglo

¿Por que QuickSort suele ser mejor cuando los datos estan muy desordenados?
Es mejor porque divide al arreglo en partes más pequeñas y ordena eficientemente manejando asi grandes cantidades de datos desordenados en menos tiempo que Insertion.

## Conclusiones
1. En el escenario cuando los datos estan completamente desordenados es mas rapido usar Quick Sort con grandes tamaños o volumenes de muestra antes que Insertion Sort.

2. Cuando el arreglo ya esta casi ordenado el que tiene mejores resultados es Insertion ya que necesitó hacer pocos cambios para completar el orden.

3. Los resultados obtenidos muestran que el estado inicial de los datos influye en el rendimiento de los algoritmos de ordenamiento porque cada uno se porto diferente segun el escenario evaluado.