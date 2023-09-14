import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio15 {
    /**
     * Verifica se a lista contém pelo menos um número negativo
     */
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 5, 4, 3);

        boolean numeroNegativo = numeros.stream().anyMatch(n -> n < 0);

        if(numeroNegativo) {
            System.out.println("A lista contém pelo menos um número negativo");
        } else {
            System.out.println("A lista não contém números negativos");


        }



    }
}
