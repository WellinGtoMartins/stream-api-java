import java.util.Arrays;
import java.util.List;

public class Desafio12 {
    /**
     * Encontre o produto de todos os números de lista
     */
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 5, 4, 3);
        int soma = numeros.stream().reduce(1, (a, b) -> a * b);
        System.out.println(soma);
        System.out.println("O produto dos números da lista é: " + soma);


    }
}
