package challenge2;

import java.util.List;
import java.util.function.Function;

public class ParallelRace {

    Function<List<Integer>, Integer> lambda = lista -> {
        if (lista == null || lista.isEmpty()) {
            return Integer.MAX_VALUE;
        }
        int max = Integer.MIN_VALUE;
        for (int numero : lista) {
            if (numero > max) {
                max = numero;
            }
        }
        return max;
    };

    public Resultado run(List<Integer> lista) {
        return new Resultado(lambda.apply(lista));
    }
}
