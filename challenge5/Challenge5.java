import java.util.HashSet;
import java.util.List;
import java.util.function.Function;

public class Challenge5 {
    public static HashSet<Integer> tree(List<Integer> numeros) {
        Function<List<Integer>, HashSet<Integer>> filtrarMultiplosDeTres = (lista) ->
                lista.stream().filter(numero -> numero % 3 != 0)
                        .collect(HashSet::new, HashSet::add, HashSet::addAll);
        return filtrarMultiplosDeTres.apply(numeros);
    }
}