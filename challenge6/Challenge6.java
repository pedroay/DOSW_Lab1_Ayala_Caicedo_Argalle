package challenge6;

import java.util.HashMap;
import java.util.Map;

public class Challenge6 {

    private static final Map<String, Runnable> commandsMap = new HashMap<>();

    public static void registerCommand(String command) {
        switch (command.toUpperCase()) {
            case "JOKE" -> commandsMap.put("JOKE",
                    () -> System.out.println("Why did the RAM break up with the CPU? It needed space."));
            case "SHOUT" -> commandsMap.put("SHOUT", () -> System.out.println("STACK OVERFLOW ALERT!"));
            case "WHISPER" -> commandsMap.put("WHISPER", () -> System.out.println("Shhh... the bugs are sleeping."));
            case "ANALYZE" -> commandsMap.put("ANALYZE",
                    () -> System.out.println("Processing data... result: You are amazing at programming!"));

            case "GREET" -> commandsMap.put("GREET", () -> System.out.println("Greetings, traveler of time and code!"));
            case "FAREWELL" -> commandsMap.put("FAREWELL",
                    () -> System.out.println("May the bits be with you until the next mission."));
            case "SING" -> commandsMap.put("SING", () -> System.out.println("01010101"));
            case "DANCE" -> commandsMap.put("DANCE", () -> System.out.println("Spinning in party mode."));

            default -> System.out.println("Comando desconocido: " + command);
        }
    }

    public static void executeCommand(String command) {
        Runnable action = commandsMap.get(command.toUpperCase());
        if (action != null) {
            action.run();
        } else {
            System.out.println("Comando no encontrado en el mapa: " + command);
        }
    }

    public static void main(String[] args) {
        String[] todosLosComandos = {
                "JOKE", "SHOUT", "WHISPER", "ANALYZE",
                "GREET", "FAREWELL", "SING", "DANCE"
        };

        for (String cmd : todosLosComandos) {
            registerCommand(cmd);
        }

        System.out.println("--- Ejecutando todos los comandos combinados ---");
        executeCommand("GREET");
        executeCommand("JOKE");
        executeCommand("ANALYZE");
        executeCommand("DANCE");
        executeCommand("SHOUT");
        executeCommand("WHISPER");
        executeCommand("FAREWELL");
        executeCommand("SING");

        System.out.println("--- Prueba de error ---");
        executeCommand("SLEEP");
    }
}
