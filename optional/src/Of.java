import java.util.Optional;

public class Of {
    /**
     * of(value): Cria um Optional contendo o valor fornecido. Se o valor
     * for nulo, lançará uma exceção NullPointerException     *
     */
    public static void main(String[] args) {

        Optional<String> optionalValue = Optional.of("Hello");
        System.out.println(optionalValue.get());


    }

}
