import java.util.HashMap;
import java.util.Map;

public class Challenge6 {
    public static Map<String, Runnable> crearComandos() {
        Map<String, Runnable> comandos = new HashMap<>();
        comandos.put("JOKE", () ->System.out.println("Why did the RAM break up with the CPU? It needed space."));
        comandos.put("SHOUT", ()-> System.out.println("STACK OVERFLOW ALERT!"));
        comandos.put("WHISPER", () -> System.out.println("Shhh... the bugs are sleeping."));
        comandos.put("ANALYZE", () ->System.out.println("Processing data... result: You are amazing at programming!"));
        return comandos;
    }
    public static void executeCommand(String comando) {
        Map<String, Runnable> comandos = crearComandos();
        switch (comando) {
            case "JOKE":
            case "SHOUT":
            case "WHISPER":
            case "ANALYZE":
                comandos.get(comando).run();
                break;
            default:
                System.out.println("Comando desconocido: " + comando);
        }
    }
    public static void main(String[] args) {
        executeCommand("JOKE");
        executeCommand("SHOUT");
        executeCommand("WHISPER");
        executeCommand("ANALYZE");
    }
}