package challenge2;

import java.util.List;
import java.util.function.Function;

public class ParallelRace {

    Function<List<Integer>, Integer> lambda = lista -> {
        if (lista == null || lista.isEmpty()) {
            return Integer.MAX_VALUE;
        }
        int min = Integer.MAX_VALUE;
        for (int numero : lista) {
            if (numero < min) {
                min = numero;
            }
        }
        return min;
    };

    public Resultado run(List<Integer> lista) {
        return new Resultado(lambda.apply(lista));
    }
}
