package challenge6;

import java.util.HashMap;
import java.util.Map;

public class Challenge6 {

    private static final Map<String, Runnable> commandsStudentA = new HashMap<>();

    public static void registerCommandStudentA(String command) {
        switch (command.toUpperCase()) {
            case "GREET" ->
                commandsStudentA.put("GREET", () -> System.out.println("Greetings, traveler of time and code!"));
            case "FAREWELL" -> commandsStudentA.put("FAREWELL",
                    () -> System.out.println("May the bits be with you until the next mission."));
            case "SING" -> commandsStudentA.put("SING", () -> System.out.println("01010101"));
            case "DANCE" -> commandsStudentA.put("DANCE", () -> System.out.println("Spinning in party mode."));
            default -> System.out.println("Comando desconocido: " + command);
        }
    }

    public static void executeCommand(String command) {
        Runnable action = commandsStudentA.get(command.toUpperCase());
        if (action != null) {
            action.run();
        } else {
            System.out.println("Comando no encontrado en el mapa: " + command);
        }
    }

    public static void main(String[] args) {

        registerCommandStudentA("GREET");
        registerCommandStudentA("FAREWELL");
        registerCommandStudentA("SING");
        registerCommandStudentA("DANCE");

        executeCommand("GREET");
        executeCommand("FAREWELL");
        executeCommand("SING");
        executeCommand("DANCE");
    }
}
