package challenge3;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import java.util.function.Function;
import java.util.stream.Stream;

public class Challenge3 {

    public static String transformMessage(String message) {
        if (message == null || message.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();

        Stream.generate(() -> message)
                .limit(3)
                .forEach(item -> {
                    if (sb.length() > 0) {
                        sb.append(" ");
                    }
                    sb.append(item);
                });

        StringBuffer buffer = new StringBuffer(sb.toString());
        return buffer.reverse().toString();
    }

    public static void main(String[] args) {
        Function<String, String> transformerLambda = msg -> transformMessage(msg);

        String testInput = "hola";
        String result = transformerLambda.apply(testInput);

        System.out.println("Entrada: " + testInput);
        System.out.println("Resultado Final: " + result);
    }
}
