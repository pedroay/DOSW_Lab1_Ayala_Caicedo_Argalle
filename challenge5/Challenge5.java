
import java.util.HashSet;
import java.util.List;
import java.util.function.Function;
import java.util.PriorityQueue;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Challenge5 {

    public static HashSet<Integer> tree(List<Integer> numeros) {
        Function<List<Integer>, HashSet<Integer>> filtrarMultiplosDeTres = (lista) -> lista.stream()
                .filter(numero -> numero % 3 != 0)
                .collect(HashSet::new, HashSet::add, HashSet::addAll);
        return filtrarMultiplosDeTres.apply(numeros);
    }

    public static TreeSet<Integer> processTreeSetStudentB(List<Integer> numbers) {
        return numbers.stream()
                .filter(num -> num % 5 != 0)
                .collect(Collectors.toCollection(TreeSet::new));
    }

    public static PriorityQueue<Integer> processPriorityQueue(HashSet<Integer> hashSet, TreeSet<Integer> treeSet) {
        TreeSet<Integer> combinadosSinDuplicados = new TreeSet<>();
        combinadosSinDuplicados.addAll(hashSet);
        combinadosSinDuplicados.addAll(treeSet);
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.addAll(combinadosSinDuplicados);
        return priorityQueue;
    }

    public static void main(String[] args) {

        List<Integer> datosA = List.of(4, 9, 15, 7, 18, 21, 10, 5);

        HashSet<Integer> resultadoA = tree(datosA);

        List<Integer> datosB = List.of(12, 3, 25, 10, 7, 30, 18, 4);

        TreeSet<Integer> resultadoB = processTreeSetStudentB(datosB);

        PriorityQueue<Integer> resultadoC = processPriorityQueue(resultadoA, resultadoB);

        int size = resultadoC.size();

        for (int i = 0; i < size; i++) {
            System.out.println("Number in the arena:" + resultadoC.poll() + "\n");
        }

    }
}
