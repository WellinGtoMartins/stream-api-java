import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Desafio18 {
    /**
     * Verifica se todos os números da lista são iguais
     */
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 5, 4, 3);

        boolean saoTodosIguais = numeros.stream().allMatch(n -> n.equals(numeros.get(0)));

        if (saoTodosIguais) {
            System.out.println("Os números na lista são iguais.");
        } else {
            System.out.println("Os números são diferentes.");
        }

    }
}
