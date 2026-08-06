import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Challenge4 {
    public static HashMap<String, Integer> maps(List<Map.Entry<String, Integer>> pares) {
        Function<List<Map.Entry<String, Integer>>, HashMap<String, Integer>> organizar = (lista) ->
                lista.stream()
                .sorted(Map.Entry.comparingByKey()).map(entry -> entry)
                        .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(valorExistente, valorNuevo) -> valorExistente,HashMap::new));
        return organizar.apply(pares);
    }