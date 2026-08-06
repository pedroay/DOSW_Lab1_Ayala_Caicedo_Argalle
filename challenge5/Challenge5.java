package challenge5;

import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Challenge5 {

    
    public static TreeSet<Integer> processTreeSetStudentB(List<Integer> numbers) {
        return numbers.stream()
                .filter(num -> num % 5 != 0) 
                .collect(Collectors.toCollection(TreeSet::new)); 
    }

    public static void main(String[] args) {
        
        List<Integer> datosB = List.of(12, 3, 25, 10, 7, 30, 18, 4);

        TreeSet<Integer> resultadoB = processTreeSetStudentB(datosB);

        System.out.println("TreeSet Estudiante B (sin múltiplos de 5): " + resultadoB);
    }
}