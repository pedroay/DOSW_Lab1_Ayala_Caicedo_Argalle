package challenge1;

import java.util.ArrayList;
import java.util.List;

public class Challenge1 {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Pedro", "Ayala", 19, "pedro.ayala-b@escuelaing.edu.co", 6));
        students.add(new Student("Samuel", "Argalle", 19, "samuel.argalle@escuelaing.edu.co", 7));
        students.add(new Student("Javier", "Caicedo", 19, "javier.caicedo-g@escuelaing.edu.co", 6));

        WelcomeMessage welcomeMessage = new WelcomeMessage(students);
        welcomeMessage.printMessage();
    }
}
