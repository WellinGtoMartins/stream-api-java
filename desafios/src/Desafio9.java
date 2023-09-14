import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio9 {

    /**
     * Verifica se todos os números da lista são distintos (não se repetem)
     */



    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 5, 4, 3);

        List<Integer> nums = numeros.stream().distinct().collect(Collectors.toList());

        if (nums.size() < numeros.size()) {
            System.out.println("Alguns números se repetem");
        } else {
            System.out.println("Todos os números são distintos");
        }

    }
}
