import java.util.Arrays;
import java.util.List;

public class Desafio8 {
    /**
     * Somar os dígitos de todos os números da lista
     */
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 5, 4, 3);

        int soma = numeros.stream()
                .mapToInt(Desafio8::somaDigitos)
                .sum();

        System.out.println("A soma dos dígitos de todos os números é: " + soma);
    }

    public static int somaDigitos(int numero) {
        int soma = 0;
        while (numero > 0) {
            soma += numero % 10;
            numero /= 10;
        }
        return soma;
    }
}
