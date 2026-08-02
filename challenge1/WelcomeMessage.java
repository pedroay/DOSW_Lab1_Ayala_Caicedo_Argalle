package challenge1;

import java.util.List;
import java.util.stream.Collectors;

public class WelcomeMessage {

    private List<Student> students;

    public WelcomeMessage(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public String generateMessage() {
        if (students == null || students.isEmpty()) {
            return "Hello and welcome!";
        }

        // Use stream(), map(), and collect() with lambda expression to get formatted student descriptions
        List<String> studentDetails = students.stream()
                .map(student -> student.getFirstName() + " " + student.getLastName() +
                        ", a " + formatSemester(student.getSemester()) + "-semester student, " +
                        student.getAge() + " years old")
                .collect(Collectors.toList());

        String formattedStudents;
        if (studentDetails.size() == 1) {
            formattedStudents = studentDetails.get(0);
        } else if (studentDetails.size() == 2) {
            formattedStudents = studentDetails.get(0) + ",\nand " + studentDetails.get(1);
        } else {
            String allButLast = String.join(",\n", studentDetails.subList(0, studentDetails.size() - 1));
            formattedStudents = allButLast + ",\nand " + studentDetails.get(studentDetails.size() - 1);
        }

        // Use stream(), map(), and collect() with lambda expression to extract emails
        String emails = students.stream()
                .map(student -> student.getEmail())
                .collect(Collectors.joining("\n"));

        return "Hello and welcome!\n\n" +
               "We are " + formattedStudents + ".\n\n" +
               "Our institutional emails are:\n" +
               emails;
    }

    public void printMessage() {
        System.out.println(generateMessage());
    }

    private String formatSemester(int semester) {
        switch (semester) {
            case 1:
                return "1st";
            case 2:
                return "2nd";
            case 3:
                return "3rd";
            default:
                return semester + "th";
        }
    }
}
