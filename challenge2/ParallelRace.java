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

<<<<<<< HEAD
  

=======
<<<<<<< HEAD
    Function<Integer, Boolean> validacion = numero -> numero >= 2 && numero % 2 == 0;
=======
>>>>>>> feature/challenge_2_lane_two_ArgalleCaicedo_2026-2
    Function<Integer, Boolean> validacion = numero  ->{
        boolean validado = (numero >= 2 && numero % 2 == 0) ? true : false;
        return validado;

<<<<<<< HEAD
    };  
=======
    };
>>>>>>> d070728d1a7d305656605538e9b436e93f15b5c6
>>>>>>> feature/challenge_2_lane_two_ArgalleCaicedo_2026-2

    public Resultado run(List<Integer> lista) {
        int[] valores = lambda.apply(lista);
        return new Resultado(valores[0], valores[1], valores[2]);
    }
}