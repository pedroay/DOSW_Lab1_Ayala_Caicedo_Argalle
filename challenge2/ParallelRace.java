package challenge2;

import java.util.List;
import java.util.function.Function;

public class ParallelRace {

    Function<List<Integer>, Integer> lambda = lista -> {
        if (lista == null || lista.isEmpty()) {
            return Integer.MIN_VALUE;
        }
        int max = Integer.MIN_VALUE;
        for (int numero : lista) {
            if (numero > max) {
                max = numero;
            }
        }
        return max;
    };

    Function<Integer, Boolean> validacion = numero -> {
        boolean validado = (numero >= 2 && numero % 2 == 0) ? true : false;
        return validado;

    };

    Function<Integer, Boolean> isEven = numero -> {
        return numero % 2 == 0;
    };

    public Resultado run(
            List<Integer> lista) {
        return new Resultado(lambda.apply(lista));
    }
}