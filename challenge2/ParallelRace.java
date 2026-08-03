package challenge2;

import java.util.List;
import java.util.function.Function;

public class ParallelRace {

    Function<List<Integer>, int[]> lambda = lista -> {
        if (lista == null || lista.isEmpty()) {
            return new int[] { Integer.MAX_VALUE, Integer.MIN_VALUE, 0 };
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int numero : lista) {
            if (numero < min) {
                min = numero;
            }
            if (numero > max) {
                max = numero;
            }
        }
        return new int[] { min, max, lista.size() };
    };

    // Valida si el número es divisible por 2 (par)
    Function<Integer, Boolean> esDivisible = numero -> numero % 2 == 0;

    // Valida si el número es múltiplo de 2 y además >= 2
    Function<Integer, Boolean> esMultiplo = numero -> numero >= 2 && numero % 2 == 0;

    // Valida si el número es impar (reutiliza esDivisible)
    Function<Integer, Boolean> isOdd = numero -> !esDivisible.apply(numero);

    // Validacion si el numero es par
    Function<Integer, Boolean> isEven = numero -> {
        return numero % 2 == 0;
    
    };

    public Resultado run(List<Integer> lista) {
        int[] valores = lambda.apply(lista);
        return new Resultado(valores[0], valores[1], valores[2]);
    }

}