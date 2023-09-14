import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Desafio5 {
    /**
     * Calcula a média dos números maiores que 5
     */
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        double media = numeros.stream().filter(n -> n > 5).mapToDouble(n -> n).average().getAsDouble();

        System.out.println("Média dos números maiores que 5 = " + media);




    }
}
