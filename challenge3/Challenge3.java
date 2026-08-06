package challenge3;

import java.util.function.Function;
import java.util.stream.Stream;

public class Challenge3 {

    /**
     * Estudiante A - StringBuilder
     * Recibe un String, lo repite 3 veces y separa cada repetición con un espacio.
     * Utiliza stream(), lambda y StringBuilder.
     * 
     * @param message Mensaje de entrada
     * @return Mensaje repetido 3 veces separado por espacios
     */
    public static String transformMessage(String message) {
        if (message == null) {
            return "";
        }
        
        StringBuilder sb = new StringBuilder();
        
        // Uso de stream() y función lambda (() -> message) para generar 3 repeticiones
        Stream.generate(() -> message)
              .limit(3)
              .forEach(item -> {
                  if (sb.length() > 0) {
                      sb.append(" ");
                  }
                  sb.append(item);
              });
              
        return sb.toString();
    }

    public static void main(String[] args) {
        // Uso de expresión lambda para invocar la función de transformación
        Function<String, String> repeatLambda = msg -> transformMessage(msg);

        String testInput = "Hola";
        String result = repeatLambda.apply(testInput);

        System.out.println("Entrada: " + testInput);
        System.out.println("Resultado (Estudiante A - StringBuilder): " + result);
    }
}

