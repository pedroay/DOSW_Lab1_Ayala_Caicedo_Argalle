import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Challenge3 {
    public Challenge3() {
        System.out.println("Hello World");
    }
    public static String TransformMessage(String mensaje) {
        Function<String, String> reversa =(str)->new StringBuilder(str).reverse().toString();
        return reversa.apply(mensaje);
    }
    public static void main(String[] args) {
        String mensajeOriginal="hola";
        String resultado=TransformMesssage(mensajeOriginal);
    }
}