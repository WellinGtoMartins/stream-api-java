import java.util.Arrays;
import java.util.List;

public class Desafio6 {
    /**
     * Verifica se a lista contém algum número maior que 10
     */
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean verica = numeros.stream().anyMatch(n -> n > 10);

        if (verica) {
            System.out.println("Há um número maior que 10 na lista");
        } else {
            System.out.println("Não há nenhum número maior que 10 na lista");
        }



    }
}
