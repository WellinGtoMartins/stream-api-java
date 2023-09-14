import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Desafio1 {
    /**
     * Mostra a lista na ordem numérica
     */
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Ordem crescente
        numeros.stream().sorted().forEach(System.out::println);

        System.out.println();

        // Ordem decrescente
        numeros.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);



    }


}
