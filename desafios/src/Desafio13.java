import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Desafio13 {
    /**
     * Filtra os números que estão dentro de um intervalo
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o limite inferior: ");
        int li = sc.nextInt();

        System.out.print("Entre com o limite superior: ");
        int ls = sc.nextInt();

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 5, 4, 3);

        List<Integer> intervalo = numeros.stream().filter(n -> n > li && n < ls).collect(Collectors.toList());

        System.out.println(intervalo);


    }
}
