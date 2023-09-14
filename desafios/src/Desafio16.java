import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio16 {
    /**
     * Agrupe os números em pares e ímpares
     */
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 5, 4, 3);
        List<Integer> numeroPares = numeros.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        List<Integer> numerosImpares = numeros.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());

        System.out.println("Números pares: ");
        System.out.println(numeroPares);
        System.out.println("Números ímpares");
        System.out.println(numerosImpares);
    }
}
