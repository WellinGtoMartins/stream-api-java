import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio4 {
    /**
     * Remove todos os valores ímpares
     */
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> listaResultante = numeros.stream().filter(n -> n % 2 == 0).toList();

        System.out.println("Lista resultante: ");
        listaResultante.forEach(System.out::println);






    }
}
