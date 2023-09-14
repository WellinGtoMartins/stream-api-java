import java.util.Optional;

public class IfPresent {
    /**
     * Execute uma ação fornecida por um Consumer se o Optional contiver um valor
     */
    public static void main(String[] args) {

        Optional<String> optionalValue = Optional.of("Hello");
        optionalValue.ifPresent(value -> System.out.println("Valor presente: " + value));




    }
}
