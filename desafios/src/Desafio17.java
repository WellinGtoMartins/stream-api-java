import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio17 {
    /**
     * Filtrar os números primos da lista
     */
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 5, 4, 3);

        List<Integer> numerosPrimos = numeros.stream()
                .filter(Desafio17::isPrime)
                .collect(Collectors.toList());

        System.out.println(numerosPrimos);
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number <= 3) {
            return true;
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
