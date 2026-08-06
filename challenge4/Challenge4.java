package challenge4;

import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Challenge4 {

    // Método del Estudiante B usando Hashtable
    public static Hashtable<String, Integer> maps(List<Map.Entry<String, Integer>> entries) {
        return entries.stream()
                .sorted((e1, e2) -> e1.getKey().compareTo(e2.getKey())) // sorted() con expresión Lambda
                .map(entry -> Map.entry(entry.getKey(), entry.getValue())) // map() con expresión Lambda
                .collect(Collectors.toMap(
                        entry -> entry.getKey(),
                        entry -> entry.getValue(),
                        (primerValor, nuevoValor) -> primerValor, // Ignora duplicados, conserva el primero
                        Hashtable::new
                ));
    }

    public static void main(String[] args) {
        // Datos de entrada de prueba (Estudiante B)
        List<Map.Entry<String, Integer>> datos = List.of(
                Map.entry("silver", 8),
                Map.entry("ruby", 4),
                Map.entry("gold", 12),
                Map.entry("silver", 99) // Duplicado que será ignorado
        );

        Hashtable<String, Integer> resultado = maps(datos);

        System.out.println("Hashtable Estudiante B: " + resultado);
    }
}

