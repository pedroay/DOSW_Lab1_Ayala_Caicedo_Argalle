package challenge4;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Challenge4 {
    public static HashMap<String, Integer> mapsStudentA(List<Map.Entry<String, Integer>> pares) {
        Function<List<Map.Entry<String, Integer>>, HashMap<String, Integer>> organizar = (lista) -> lista.stream()
                .sorted(Map.Entry.comparingByKey()).map(entry -> entry)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (valorExistente, valorNuevo) -> valorExistente, HashMap::new));
        return organizar.apply(pares);
    }

    public static Hashtable<String, Integer> mapsStudentB(List<Map.Entry<String, Integer>> entries) {
        return entries.stream()
                .sorted((e1, e2) -> e1.getKey().compareTo(e2.getKey()))
                .map(entry -> Map.entry(entry.getKey(), entry.getValue()))
                .collect(Collectors.toMap(
                        entry -> entry.getKey(),
                        entry -> entry.getValue(),
                        (primerValor, nuevoValor) -> primerValor,
                        Hashtable::new));
    }

    public static String mergeMap(List<Map.Entry<String, Integer>> mapA, List<Map.Entry<String, Integer>> mapB) {
        HashMap<String, Integer> mapaA = mapsStudentA(mapA);
        Hashtable<String, Integer> mapaB = mapsStudentB(mapB);
        String resultado = "";
        for (String key : mapaA.keySet()) {
            if (mapaB.containsKey(key)) {
                resultado += "key: " + key + "  |  values:" + mapaB.get(key) + "\n";
            } else {
                resultado += "key: " + key + "  |  values:" + mapaA.get(key) + "\n";
            }
        }
        for (String key : mapaB.keySet()) {
            if (!mapaA.containsKey(key)) {
                resultado += "key: " + key + "  |  values:" + mapaB.get(key) + "\n";
            }
        }

        return resultado;

    }

    public static void main(String[] args) {
        List<Map.Entry<String, Integer>> datosA = List.of(
                Map.entry("silver", 4),
                Map.entry("ruby", 4),
                Map.entry("gold", 12),
                Map.entry("silver", 99));

        List<Map.Entry<String, Integer>> datosb = List.of(
                Map.entry("silver", 8),
                Map.entry("ruby", 4),
                Map.entry("gold", 12),
                Map.entry("diamond", 99) // Duplicado que será ignorado
        );
        String resultado = mergeMap(datosA, datosb);
        System.out.println(resultado);
    }
}
