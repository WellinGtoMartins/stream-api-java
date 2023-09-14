import java.util.Arrays;
import java.util.List;

public class Desafio11 {
    /**
     * Encontre a soma dos quadrados de todos os números da lista
     */
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 5, 4, 3);

        int somaDosQuadrados = numeros.stream()
                .mapToInt(n -> n * n)
                .sum();

        System.out.println("A soma dos quadrados dos números da lista é: " + somaDosQuadrados);







    }
}
