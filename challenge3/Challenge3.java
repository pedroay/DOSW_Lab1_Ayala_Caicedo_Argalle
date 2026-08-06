package challenge3;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import java.util.function.Function;
import java.util.stream.Stream;

public class Challenge3 {

    /**
     * Solución de la colisión:
     * - Repite el mensaje 3 veces separadas por espacio.
     * - Invierte el resultado final.
     * - Utiliza stream(), StringBuilder y StringBuffer.
     */
    public static String transformMessage(String message) {
        if (message == null || message.isEmpty()) {
            return "";
        }

        // 1. Uso de StringBuilder y stream() para repetir 3 veces
        StringBuilder sb = new StringBuilder();

        Stream.generate(() -> message)
                .limit(3)
                .forEach(item -> {
                    if (sb.length() > 0) {
                        sb.append(" ");
                    }
                    sb.append(item);
                });

        // 2. Uso de StringBuffer para invertir el resultado final
        StringBuffer buffer = new StringBuffer(sb.toString());
        return buffer.reverse().toString();
    }

    public static void main(String[] args) {
        // Uso de expresión lambda para invocar la función
        Function<String, String> transformerLambda = msg -> transformMessage(msg);

        String testInput = "hola";
        String result = transformerLambda.apply(testInput);

        System.out.println("Entrada: " + testInput);
        System.out.println("Resultado Final: " + result);
    }
}
