package challenge1;

import java.util.ArrayList;
import java.util.List;

public class Challenge1 {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Juan", "Pérez", 21, "juan.perez@escuelaing.edu.co", 6));
        students.add(new Student("Miguel", "Roncancio", 22, "miguel.roncancio@escuelaing.edu.co", 5));

        WelcomeMessage welcomeMessage = new WelcomeMessage(students);
        welcomeMessage.printMessage();
    }
}
